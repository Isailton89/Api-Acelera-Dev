package dev.acelera.api.service;

import dev.acelera.api.sales.Sale;
import dev.acelera.api.sales.SaleRepository;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public void saveXlsx(byte[] file) throws IOException {
        try (Workbook workbook = WorkbookFactory.create(new ByteArrayInputStream(file))) {
            {
                Sheet sheet = workbook.getSheetAt(0);
                for (Row row : sheet) {
                    if (row.getRowNum() == 0) {
                        continue;
                    }

                    Sale sale = new Sale();
                    sale.setCodigo(String.valueOf((int) row.getCell(0).getNumericCellValue()));

                    Cell cpfCell = row.getCell(1);
                    String cpf = "";
                    if (cpfCell.getCellType() == CellType.STRING) {
                        cpf = cpfCell.getStringCellValue();
                    } else if (cpfCell.getCellType() == CellType.NUMERIC) {
                        cpf = String.valueOf((long) cpfCell.getNumericCellValue());
                    }

                    sale.setCpf(cpf);

                    sale.setQntProduComprados(String.valueOf((int) row.getCell(2).getNumericCellValue()));

                    double serialValue = row.getCell(3).getNumericCellValue();
                    Date dataDaCompra = convertSerialToDate(serialValue);
                    String dataFormatada = formatDate(dataDaCompra);

                    sale.setDataCompra(dataFormatada);

                    saleRepository.save(sale);
                }
            }
        }
    }
    public Date convertSerialToDate(double serial) {
        double adjustedSerial = (serial - 25569) * 86400 * 1000;
        return new Date((long) adjustedSerial);
    }
    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(date);
    }
}

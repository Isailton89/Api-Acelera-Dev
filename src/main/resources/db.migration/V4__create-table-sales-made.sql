create table sales_mades(

    id bigint not null auto_increment,
    codigo varchar(100) not null,
    cpf varchar(100) not null,
    quantidade_de_produtos_comprados varchar(100) not null,
    data_da_compra varchar(100) not null,

    primary key(id)

);
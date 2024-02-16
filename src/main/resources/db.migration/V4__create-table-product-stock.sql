create table products_stock(

    id bigint not null auto_increment,
    id_produto bigint not null,
    quantidade bigint not null,
    data_da_compra varchar(100) not null,

    primary key(id)

);
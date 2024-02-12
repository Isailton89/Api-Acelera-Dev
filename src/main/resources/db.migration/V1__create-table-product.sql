create table products(

    id bigint not null auto_increment,
    codigo varchar(100) not null unique,
    nome varchar(100) not null,
    preco decimal(10,2) not null,

    primary key(id)

);
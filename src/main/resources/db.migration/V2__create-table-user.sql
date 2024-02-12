create table products(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    data_nascimento date not null,
    cpf varchar(11) not null unique,
    cep varchar(8) not null,

    primary key(id)

);
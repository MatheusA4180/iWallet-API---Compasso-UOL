create table extract(
    id int not null auto_increment,
    broker varchar(50) not null,
    name varchar(50) not null,
    category varchar(50) not null,
    balance varchar(50) not null,
    date varchar(50) not null,
    type varchar(50) not null,
    primary key(id)
);

create table product(
    id int not null auto_increment,
    broker varchar(50) not null,
    name varchar(50) not null,
    category varchar(50) not null,
    price varchar(50) not null,
    quantity varchar(50) not null,
    total varchar(50) not null,
    date varchar(50) not null,
    color varchar(50) not null,
    primary key(id)
);
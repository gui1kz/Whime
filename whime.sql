CREATE database if not exists whime ;

CREATE TABLE if not exists product(
Product_id int NOT NULL AUTO_INCREMENT,
Full_name varchar(40) NOT NULL,
Category varchar(10) NOT NULL,
Price double NOT NULL,
Color varchar(10),
Size varchar(3) NOT NULL,
Brand varchar(20),
Stock int NOT NULL,
PRIMARY KEY(Product_id)
);

CREATE TABLE if not exists clients(
Person_id int NOT NULL AUTO_INCREMENT,
Product_name varchar(50) NOT NULL,
CPF int NOT NULL,
Born varchar(10) NOT NULL,
Email varchar(50) NOT NULL,
Phone bigint NOT NULL,
Zip_code int NOT NULL,
Address_number varchar(6) NOT NULL,
Marital_status varchar(15),
Gender varchar(20),
PRIMARY KEY(Person_id)
);

CREATE TABLE if not exists orders(
Order_id int NOT NULL AUTO_INCREMENT,

);
create database proyectojavaFinal;
use proyectojavaFinal;

CREATE TABLE RegistroUsuarios (
	id INT auto_increment primary key,
    nombre varchar(255),
    apellido varchar(255),
    email varchar(255) unique,
    password varchar(255),
    fechaNacimiento date,
    pais varchar(255)
    );
    CREATE TABLE login (
    id int auto_increment primary key,
    email varchar(50),
    contraseña varchar(50)
    );
    insert into login (email, contraseña) values ('admin@prueba.com','admin');
    
    
select * from RegistroUsuarios;
select * from login;
-- crear bade de datos
create database db_sistem1;
use db_sistem1;


create table usuarios(
id int auto_increment,
nombre varchar(50),
email varchar(100),
pass varchar(12),
primary key(id)
);
insert into usuarios value(default, "admn", "admin-adri@gmail.com", "admin*1234");
insert into usuarios value(default, "juan", "juan@gmail.com", "juan/2020");
insert into usuarios value(default, "mose", "mose@gmail.com", "2025mose");
select* from usuarios;
/* para eliminar tabla*/
drop table usuarios;
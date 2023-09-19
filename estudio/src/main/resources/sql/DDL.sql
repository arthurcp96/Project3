drop database if exists estudio;
create database estudio;
use estudio;

create table clientes(
id int not null auto_increment primary key,
nombre varchar(50)not null,
apellido varchar(50)not null,
mail varchar(50) not null,
numero varchar (50)not null
);

create table turnos(
id int not null auto_increment primary key,
clientes_id int not null,
abogados_id int not null,
fecha date,
hora enum ('Turno_9_00','Turno_9_30','Turno_10_00','Turno_10_30','Turno_11_00','Turno_11_30','Turno_12_00', 'Turno_12_30','Turno_13_00','Turno_13_30','Turno_14_00')
);

create table abogados(
id int not null auto_increment primary key,
nombre varchar(50)not null,
apellido varchar(50)not null,
especialidad varchar (50) not null);



alter table turnos 
   add constraint fk_turnos_clientes
foreign key (clientes_id)
references clientes(id);

alter table turnos 
   add constraint fk_turnos_abogados
foreign key(abogados_id)
references abogados(id);
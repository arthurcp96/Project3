insert into clientes (id, nombre, apellido, mail, numero) values (1,'Marta','Sanchez', 'martasanchez79@gmail.com', '1177439910');
insert into clientes (id, nombre, apellido, mail, numero) values (2,'María', 'Rodríguez', 'maria.rodriguez@gmail.com', '1133498729');
insert into clientes (id, nombre, apellido, mail, numero) values (3,'Alejandro', 'López', 'alejandro.lopez@gmail.com', '3519382389');
insert into clientes (id, nombre, apellido, mail, numero) values (4,'Carolina', 'Herrera', 'carolina.herrera@gmail.com', '2617899411');
insert into clientes (id, nombre, apellido, mail, numero) values (5,'Camila', 'Torres', 'camila.torres@gmail.com','3519874441');
insert into clientes (id, nombre, apellido, mail, numero) values (6,'Andres', 'Ramírez', 'andres.ramirez@gmail.com', '1139648972');
insert into clientes (id, nombre, apellido, mail, numero) values (7,'Juan', 'González', 'juan.gonzalez@gmail.com','1134567812');
insert into clientes (id, nombre, apellido, mail, numero) values (8,'Valentina', 'Morales', 'valentina.morales@gmail.com', '1122556892');
insert into clientes (id, nombre, apellido, mail, numero) values (9,'Lucas', 'Fernández', 'lucas.fernandez@example.com','35172893012');
insert into clientes (id, nombre, apellido, mail, numero) values (10,'Sofía', 'Gómez', 'sofia.gomez@gmail.com','35162783912');

select * from clientes;


insert into abogados (id, nombre, apellido, especialidad) values (1,'Florencia', 'Vargas', 'Derecho Penal');
insert into abogados (id, nombre, apellido, especialidad) values (2,'Martín', 'López', 'Derecho Laboral');
insert into abogados (id, nombre, apellido, especialidad) values (3, 'Valentina', 'Pérez', 'Derecho Civil');
insert into abogados (id, nombre, apellido, especialidad) values (4, 'Sebastián', 'González', 'Derecho Comercial');
insert into abogados (id, nombre, apellido, especialidad) values (5,'Camila', 'Fernández', 'Derecho de Familia');
insert into abogados (id, nombre, apellido, especialidad) values (6,'Maximiliano', 'Torres', 'Derecho Tributario');
insert into abogados (id, nombre, apellido, especialidad) values (7,'Lucía', 'Martínez', 'Derecho Administrativo');
insert into abogados (id, nombre, apellido, especialidad) values (8,'Julián', 'Rodríguez', 'Derecho Ambiental');
insert into abogados (id, nombre, apellido, especialidad) values (9,'Carolina', 'Silva', 'Derecho Internacional');
insert into abogados (id, nombre, apellido, especialidad) values (10,'Gonzalo', 'Herrera', 'Derecho Laboral');

select * from abogados;

insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (1, 6, 2, '2023-04-26',  'Turno_9_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (2, 5, 1, '2023-04-26', 'Turno_11_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (3, 4, 7, '2023-04-26', 'Turno_9_00');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (4, 2, 9, '2023-04-26', 'Turno_14_00');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (5, 3, 10, '2023-04-26', 'Turno_10_00');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (6, 10, 2, '2023-04-26', 'Turno_11_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (7, 7, 9, '2023-04-26', 'Turno_13_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (8, 5, 6, '2023-04-26', 'Turno_12_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (9, 1, 8, '2023-04-26', 'Turno_9_30');
insert into turnos (id, clientes_id, abogados_id, fecha, hora) values (10, 2, 5, '2023-04-26', 'Turno_12_00');


select * from turnos;
--creacion de tabla
drop table USUARIO;
drop table JUGADOR;


create table USUARIO(
usuario varchar2(30) not null,
contrasenia varchar2(30) not null
);

create table JUGADOR(
rut varchar2(30) primary key,
nombre varchar2(30) not null,
apellido varchar2(30) not null,
edad int not null,
tipo varchar2(30) not null,
genero varchar2(30) not null,
titular varchar2(30) not null
);

INSERT INTO "BDTEST"."USUARIO" (USUARIO, CONTRASENIA) VALUES ('admin', 'admin');
INSERT INTO "BDTEST"."USUARIO" (USUARIO, CONTRASENIA) VALUES ('BDtest', 'BDtest');

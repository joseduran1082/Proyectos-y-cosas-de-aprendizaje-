create database exercici2;
use exercici2;

create table departament( 
	codi int primary key,
	numero_empleats int,
    numero_despatxs int
);

create table edificis(
	nom int primary key,
    num_despaxts int,
    poligono varchar(50),
    ciutat varchar(30),
    codi_despatx int
);

create table numDespaxts(
	codi_despatxosDep int,
    codi_edificiDespatxs int,
	foreign key (codi_edificiDespatxs) REFERENCES edificis (nom),
	foreign key (codi_despatxosDep) REFERENCES departament (codi),
    primary key(codi_despatxosDep, codi_edificiDespatxs)

);
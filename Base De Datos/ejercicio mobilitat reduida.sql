create database exercici5;
use exercici5;

create table lineaMetro(
	numLinea int primary key,
    color varchar(50),
    num_km int

);
create table metroEstacio(
	nomEstacio varchar(120) primary key,
    num_andanes int,
    cotxeraEstacio int

);

create table cotxera(
	codi_cotxera int primary key,
    estacioCotxera varchar(120),
    foreign key (estacioCotxera) references metroEstacio(nomEstacio)

);


create table Tren(
	codi int primary key,
    model varchar(50),
    any_adquisicio date,
    trenCotxera int,
    trenLinea int,
    foreign key (trenCotxera) references cotxera(Codi_cotxera),
    foreign key (trenLinea) references lineaMetro(numLinea)
    
	
);



create table acces1(
	codi int primary key,
	adreça varchar(20),
    mobilitat_reduida ENUM("si","no"),
    estacioAcces varchar(20),
    foreign key (estacioAcces) references metroEstacio(nomEstacio)
);

create table composta1(
	ordre int,
    anda_tornada varchar(20),
	Linea int,
    Estacio varchar(120),
    foreign key (Linea) references lineaMetro(numLinea),
    foreign key (Estacio) references metroEstacio(nomEstacio),
    primary key(Linea,Estacio)
);


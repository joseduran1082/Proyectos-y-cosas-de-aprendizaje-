create database Teatre;
use Teatre;

create table teatre(
codi int primary key
);

create table cinema(
codi int primary key,
edat_recomanada int
);

create table espectacle(
codi int primary key,
nom varchar(20),
descripcio varchar(150),
durada varchar(20),
teatre_codi INT,
cinema_codi INT,
FOREIGN KEY (teatre_codi) REFERENCES teatre(codi),
FOREIGN KEY (cinema_codi) REFERENCES cinema(codi)
);

create table compañiaTeatral(
NIF int primary key,
nom varchar(20),
teatre_compañia int,
foreign key (teatre_compañia) references teatre(codi)
);

create table funcions(
codi int primary key,
data_hora datetime unique,
espectacle_funcio int,
foreign key (espectacle_funcio) references espectacle(codi)
);


create table descompte(
codi_cupo int primary key,
nom_cupo varchar(50),
percentatge_descompte int,
data_hora datetime
);

create table localitat(
fila int,
seiten int,
primary key(fila, seiten)
);

create table entrada(
numero_bitllet int primary key,
preu_base decimal(10,2),
quin_funcio int,
foreign key (quin_funcio) references funcions(codi),
entrada_fila INT,
entrada_seiten INT,
foreign key (entrada_fila, entrada_seiten) references localitat(fila, seiten),
descompte_entrada int,
foreign key (descompte_entrada) references descompte(codi_cupo)
);
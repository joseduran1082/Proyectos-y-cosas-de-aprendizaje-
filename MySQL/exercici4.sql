CREATE DATABASE exercici3;
USE exercici3;
CREATE TABLE comunitats(
	nomComu varchar(20) PRIMARY KEY,
    habitants INT 
);
CREATE TABLE ciutats(
	nomCiutat Varchar(15) PRIMARY KEY,
    numHabitants INT,
    comunitat varchar(20),
    FOREIGN KEY (comunitat) REFERENCES comunitats(nomComu)
);
CREATE TABLE rius(
	nomRiu varchar(15) PRIMARY KEY,
    caudal varchar(10),
    longitud decimal(10.2)
);

create table banya(
	riuBanya varchar(15),
	ciutatBanya varchar(15),
    foreign key (riuBanya) REFERENCES rius (nomRiu),
    foreign key (ciutatBanya) REFERENCES ciutats (nomCiutat),
    primary key (riuBanya, ciutatBanya)


);

create table passa(
	km decimal,
    riuPassa varchar(15),
    comunitatPassa varchar(20),
    foreign key (riuPassa) REFERENCES rius (nomRiu),
    foreign key (comunitatPassa) REFERENCES comunitats (nomComu),
    primary key(riuPassa, comunitatPassa)
    
);


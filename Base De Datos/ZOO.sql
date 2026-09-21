create database Zoo;
use Zoo;


create table habitat(
nom varchar(20) primary key,
clima varchar(20),
vegetacio varchar(20),
continent varchar(20)
);

create table Zona(
extensio int,
codi int primary key,
nom varchar(20)
);
create table data(
data datetime primary key
);
CREATE TABLE Guies (
    Codi INT PRIMARY KEY,
    Nom VARCHAR(100),
    Adreca VARCHAR(255),
    Data_inici DATE,
    Telefon VARCHAR(20) 
);
CREATE TABLE Cuidador(
    Codi INT PRIMARY KEY,
    Nom VARCHAR(100),
    Adreca VARCHAR(255),
    Data_inici DATE,
    Telefon VARCHAR(20) 
);

create table especies(
descripcio varchar(20),
nom_cientific varchar(20) primary key,
nom_catala varchar(20),
cuidador_codi INT,
habitat_nom VARCHAR(100),
FOREIGN KEY (cuidador_codi) REFERENCES Cuidador(Codi),
FOREIGN KEY (habitat_nom) REFERENCES Habitat(Nom)
);
create TABLE Itinerari (
    Codi INT PRIMARY KEY,
    Durada VARCHAR(50),
    Longitud VARCHAR(50), 
    Maxim_visitants INT,
    Especies VARCHAR(255), 
    guia_codi INT,
    data_unica datetime,
    foreign key (data_unica) references data(data),
    FOREIGN KEY (guia_codi) REFERENCES Guies(Codi)
);
CREATE TABLE Assignacio (
    cuidador_codi INT,
    especie_codi varchar(20),
    habitat_codi varchar(20),
	data_unica datetime,
    PRIMARY KEY (cuidador_codi, especie_codi, habitat_codi),
    foreign key (data_unica) references data(data),
    FOREIGN KEY (cuidador_codi) REFERENCES Cuidador(Codi),
    FOREIGN KEY (especie_codi) REFERENCES especies(nom_cientific),
    FOREIGN KEY (habitat_codi) REFERENCES habitat(nom)
);


CREATE TABLE Cuidador_Zona (
    cuidador_codi INT,
    zona_codi INT,
    PRIMARY KEY (cuidador_codi, zona_codi),
    FOREIGN KEY (cuidador_codi) REFERENCES Cuidador(Codi),
    FOREIGN KEY (zona_codi) REFERENCES Zona(Codi)
);
CREATE TABLE Itinerari_Zona (
    itinerari_codi INT,
    zona_codi INT,
    PRIMARY KEY (itinerari_codi, zona_codi),
    FOREIGN KEY (itinerari_codi) REFERENCES Itinerari(Codi),
    FOREIGN KEY (zona_codi) REFERENCES Zona(Codi)
);

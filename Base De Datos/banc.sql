CREATE DATABASE BANC;
USE BANC;
CREATE TABLE Sucursal (
    nom VARCHAR(50) PRIMARY KEY,
    ciutat VARCHAR(50),
    actius DECIMAL(15,2)
);
CREATE TABLE Treballador (
    dni VARCHAR(15) PRIMARY KEY,
    nom VARCHAR(50),
    telefon VARCHAR(20),
    dni_superior VARCHAR(15),
    data_inici DATE,
    temps_treballat INT,
    FOREIGN KEY (dni_superior) REFERENCES Treballador(dni)
);
CREATE TABLE Client (
    dni VARCHAR(15) PRIMARY KEY,
    nom VARCHAR(50),
    carrer VARCHAR(50),
    ciutat VARCHAR(50),
    dni_banquer VARCHAR(15),
    FOREIGN KEY (dni_banquer) REFERENCES Treballador(dni)
);
CREATE TABLE Compte (
    num_compte VARCHAR(20) PRIMARY KEY,
    saldo DECIMAL(15,2),
    data_ultim_acces DATE,
    nom_sucursal VARCHAR(50),
    FOREIGN KEY (nom_sucursal) REFERENCES Sucursal(nom)
);
CREATE TABLE CompteEstalvi (
    num_compte VARCHAR(20) PRIMARY KEY,
    tipus_interes DECIMAL(5,2),
    FOREIGN KEY (num_compte) REFERENCES Compte(num_compte)
);
CREATE TABLE CompteCorrent (
    num_compte VARCHAR(20) PRIMARY KEY,
    descobert DECIMAL(15,2),
    FOREIGN KEY (num_compte) REFERENCES Compte(num_compte)
);
CREATE TABLE Client_Compte (
    dni_client VARCHAR(15),
    num_compte VARCHAR(20),
    PRIMARY KEY (dni_client, num_compte),
    FOREIGN KEY (dni_client) REFERENCES Client(dni),
    FOREIGN KEY (num_compte) REFERENCES Compte(num_compte)
);
CREATE TABLE Prestec (
    num_prestec VARCHAR(20) PRIMARY KEY,
    import_total DECIMAL(15,2),
    nom_sucursal VARCHAR(50),
    FOREIGN KEY (nom_sucursal) REFERENCES Sucursal(nom)
);
CREATE TABLE Client_Prestec (
    dni_client VARCHAR(15),
    num_prestec VARCHAR(20),
    PRIMARY KEY (dni_client, num_prestec),
    FOREIGN KEY (dni_client) REFERENCES Client(dni),
    FOREIGN KEY (num_prestec) REFERENCES Prestec(num_prestec)
);
CREATE TABLE Pagament (
    num_prestec VARCHAR(20),
    num_pagament INT,
    data_pagament DATE,
    import_pagament DECIMAL(15,2),
    PRIMARY KEY (num_prestec, num_pagament),
    FOREIGN KEY (num_prestec) REFERENCES Prestec(num_prestec)
);
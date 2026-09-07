CREATE DATABASE EmpresaMenjar;
USE EmpresaMenjar;

CREATE TABLE MAGATZEM (
    Numero INT PRIMARY KEY,
    Nom VARCHAR(100),
    Descripcio VARCHAR(100)
);

CREATE TABLE PRESTATGERIA (
    Num_Magatzem INT,
    Codi VARCHAR(50),
    Dimensio DECIMAL(10,2),
    PRIMARY KEY (Num_Magatzem, Codi),
    FOREIGN KEY (Num_Magatzem) REFERENCES MAGATZEM(Numero)
);

CREATE TABLE CUINER (
    DNI VARCHAR(20) PRIMARY KEY,
    Nom VARCHAR(50),
    Cognoms VARCHAR(100),
    Num_SS VARCHAR(50) UNIQUE, 
    Tel_Fixe VARCHAR(20),
    Tel_Mobil VARCHAR(20),
    Anys_Servei INT
);

CREATE TABLE AJUDANT (
    DNI VARCHAR(20) PRIMARY KEY,
    Nom VARCHAR(50),
    Cognoms VARCHAR(100),
    Num_SS VARCHAR(50) UNIQUE,
    Tel_Fixe VARCHAR(20),
    Tel_Mobil VARCHAR(20),
    Data_Naixement DATE,
    DNI_Cap_Cuiner VARCHAR(20),
    FOREIGN KEY (DNI_Cap_Cuiner) REFERENCES CUINER(DNI)
);

CREATE TABLE PLAT (
    ID_Plat INT PRIMARY KEY,
    Nom VARCHAR(100) UNIQUE,
    Preu DECIMAL(10, 2),
    Tipus ENUM('Entrant', 'Primer', 'Segon', 'Postre') 
);

CREATE TABLE INGREDIENT (
    ID_Ingredient INT PRIMARY KEY,
    Nom VARCHAR(100)
);

CREATE TABLE RECEPTA (
    ID_Plat INT,
    ID_Ingredient INT,
    Quantitat DECIMAL(10, 2),
    PRIMARY KEY (ID_Plat, ID_Ingredient),
    FOREIGN KEY (ID_Plat) REFERENCES PLAT(ID_Plat),
    FOREIGN KEY (ID_Ingredient) REFERENCES INGREDIENT(ID_Ingredient)
);

CREATE TABLE STOCK (
    ID_Ingredient INT,
    Num_Magatzem INT,
    Codi_Prestatgeria VARCHAR(50),
    Quantitat_Actual DECIMAL(10, 2), 
    PRIMARY KEY (ID_Ingredient, Num_Magatzem, Codi_Prestatgeria),
    FOREIGN KEY (ID_Ingredient) REFERENCES INGREDIENT(ID_Ingredient),
    FOREIGN KEY (Num_Magatzem, Codi_Prestatgeria) REFERENCES PRESTATGERIA(Num_Magatzem, Codi)
);

CREATE TABLE CAPACITAT_CUINER (
    DNI_Cuiner VARCHAR(20),
    ID_Plat INT,
    PRIMARY KEY (DNI_Cuiner, ID_Plat),
    FOREIGN KEY (DNI_Cuiner) REFERENCES CUINER(DNI),
    FOREIGN KEY (ID_Plat) REFERENCES PLAT(ID_Plat)
);
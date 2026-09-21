drop database if exists Sketchers;
create database Sketchers;
use Sketchers;

create table Tipus_Sabata (
codi_tipus int primary key,
nom_descriptiu varchar(50) 
);

create table Sabata (
codi_sabata int primary key,
nom varchar(100),
color varchar(30),
talla int,
preu_base DECIMAL(10, 2),
codi_tipus int,
FOREIGN KEY (codi_tipus) REFERENCES Tipus_Sabata(codi_tipus)
);

create table Clients (
codi_client int primary key,
nom_cognom VARCHAR(100),
telefon VARCHAR(15)
);

create table Descompte (
codi_descompte int primary key,
nom varchar(50),
percentatge int
);

create table Vendes (
codi_venda int primary key,
data_dia DATE ,
codi_client int,
codi_descompte int,
FOREIGN KEY (codi_client) REFERENCES Clients(codi_client),
FOREIGN KEY (codi_descompte) REFERENCES Descompte(codi_descompte)
);

create table Conte (
codi_venda INT,
codi_sabata INT,
quantitat INT,
preu_final DECIMAL(10, 2) NOT NULL,
primary key (codi_venda, codi_sabata),
FOREIGN KEY (codi_venda) REFERENCES Vendes(codi_venda),
FOREIGN KEY (codi_sabata) REFERENCES Sabata(codi_sabata)
);

INSERT INTO Tipus_Sabata VALUES (1, 'Esportives');
INSERT INTO Tipus_Sabata VALUES  (2, 'Casual');
INSERT INTO Tipus_Sabata VALUES (3, 'Caminar');
INSERT INTO Sabata VALUES (101, 'Skechers Arch Fit', 'Negre', 42, 89.90, 3);
INSERT INTO Sabata VALUES (102, 'Skechers Uno', 'Blanc', 38, 75.00, 2);
INSERT INTO Sabata VALUES (103, 'Skechers GoRun', 'Blau', 44, 110.00, 1);
INSERT INTO Clients VALUES (1, 'Juan Perez', '600112233');
INSERT INTO Clients VALUES (2, 'Maria Garcia', '655443322');
INSERT INTO Descompte VALUES (10, 'Promo Estiu', 15);
INSERT INTO Descompte VALUES (20, 'Black Friday', 25);
INSERT INTO Vendes VALUES (5001, '2026-02-20', 1, 10);
INSERT INTO Vendes VALUES (5002, '2026-04-20', 2, 10);
INSERT INTO Conte VALUES (5002, 103, 1, 60.84); 
INSERT INTO Conte VALUES (5001, 101, 2, 152.83); 


SELECT nom_cognom FROM Clients, Vendes
WHERE Clients.codi_client = Vendes.codi_client;

SELECT Vendes.codi_venda, Vendes.data_dia, Descompte.percentatge FROM Vendes, Descompte
WHERE Vendes.codi_descompte = Descompte.codi_descompte AND Descompte.percentatge > 10;

SELECT Sabata.color FROM Sabata, Conte
WHERE Sabata.codi_sabata = Conte.codi_sabata;

SELECT DISTINCT Sabata.nom FROM Sabata, Conte
WHERE Sabata.codi_sabata = Conte.codi_sabata;

SELECT Sabata.nom, Sabata.color FROM Sabata, Tipus_Sabata
WHERE Sabata.codi_tipus = Tipus_Sabata.codi_tipus AND Tipus_Sabata.nom_descriptiu = 'Caminar';

SELECT Clients.nom_cognom, SUM(Conte.preu_final) FROM Clients, Vendes, Conte
WHERE Clients.codi_client = Vendes.codi_client AND Vendes.codi_venda = Conte.codi_venda
GROUP BY Clients.nom_cognom
HAVING SUM(Conte.preu_final) > 150;

SELECT Sabata.nom, Vendes.data_dia FROM Sabata, Conte, Vendes
WHERE Sabata.codi_sabata = Conte.codi_sabata AND Conte.codi_venda = Vendes.codi_venda AND Sabata.color = 'Blau';
DROP DATABASE IF EXISTS ACB;
CREATE DATABASE ACB;
USE ACB;

CREATE TABLE jornada
	(codi		INT(2)		PRIMARY KEY,
	data		DATE
	)ENGINE = InnoDB
	;

CREATE TABLE estadi
	(nom		CHAR(40)	PRIMARY KEY,
	aforament	INT
	)ENGINE = InnoDB
	;

CREATE TABLE equip
	(nom		CHAR(20)	PRIMARY KEY,
	data_creacio	DATE,
	pressupost	INT,
	estadi		CHAR(40)	NOT NULL,
	filial_de	CHAR(20)	REFERENCES equip,
	FOREIGN KEY (estadi) REFERENCES estadi(nom)
	)ENGINE = InnoDB
	;

CREATE TABLE posicio
	(nom_posicio	CHAR(7)		PRIMARY KEY
	)ENGINE = InnoDB
	;

CREATE TABLE membre_equip
	(nom		CHAR(20)	PRIMARY KEY,
	equip		CHAR(20)	NOT NULL,
	FOREIGN KEY (equip) REFERENCES equip(nom)
	)ENGINE = InnoDB
	;

CREATE TABLE jugador
	(nom		CHAR(20)	PRIMARY KEY,
	dorsal		INT(2)		CHECK (dorsal BETWEEN 4 AND 99),
	fitxa		INT,
	posicio		CHAR(7)		NOT NULL,
	FOREIGN KEY (nom) REFERENCES membre_equip(nom),
	FOREIGN KEY (posicio) REFERENCES posicio(nom_posicio)
	)ENGINE = InnoDB
	;

CREATE TABLE entrenador
	(nom		CHAR(20)	PRIMARY KEY,
	any_titol	INT(4),
	FOREIGN KEY (nom) REFERENCES membre_equip(nom)		
	)ENGINE = InnoDB
	;

CREATE TABLE directiu
	(nom		CHAR(20)	PRIMARY KEY,
	carrec		CHAR(20),
	FOREIGN KEY (nom) REFERENCES membre_equip(nom)		
	)ENGINE = InnoDB
	;

CREATE TABLE arbitre
	(nom			CHAR(20)	PRIMARY KEY,
	ciutat_naixement	CHAR(20),
	antiguitat		INT(4)
	)ENGINE = InnoDB
	;

CREATE TABLE partit
	(jornada		INT(2),
	equip_local		CHAR(20),
	equip_visitant		CHAR(20)	NOT NULL,
	hora			TIME,
	punts_local		INT(3),
	punts_visitant	INT(3),
	PRIMARY KEY(jornada,equip_local),
	FOREIGN KEY (jornada) REFERENCES jornada(codi),
	FOREIGN KEY (equip_local) REFERENCES equip(nom),
	FOREIGN KEY (equip_visitant) REFERENCES equip(nom)
	)ENGINE = InnoDB
	;

CREATE TABLE arbitra
	(jornada	INT(2)		REFERENCES partit,
	equip_local	CHAR(20)	REFERENCES partit,
	arbitre		CHAR(20)	REFERENCES arbitre,
	PRIMARY KEY(jornada,equip_local,arbitre),
	FOREIGN KEY (jornada) REFERENCES partit(jornada),
	FOREIGN KEY (equip_local) REFERENCES partit(equip_local),
	FOREIGN KEY (arbitre) REFERENCES arbitre(nom)
	)ENGINE = InnoDB
	;

INSERT INTO jornada VALUES (1,'05/2/13');
INSERT INTO jornada VALUES (2,'05/2/20');
INSERT INTO jornada VALUES (3,'05/2/27');

INSERT INTO estadi VALUES ('Pavell� 11 de setembre',2500);
INSERT INTO estadi VALUES ('Pavell� Municipal de Girona',6500);
INSERT INTO estadi VALUES ('Pavell� Josep Tort',2000);

INSERT INTO equip VALUES ('Basquet Olot','73/9/11',10000,'Pavell� 11 de setembre',NULL);
INSERT INTO equip VALUES ('Girona BC','78/6/1',12000,'Pavell� Municipal de Girona',NULL);
INSERT INTO equip VALUES ('Angl�s Club','82/6/19',18000,'Pavell� Josep Tort',NULL);
INSERT INTO equip VALUES ('Giron�s BC','78/6/1',7000,'Pavell� Municipal de Girona','Girona BC');

INSERT INTO posicio VALUES ('base');
INSERT INTO posicio VALUES ('escorta');
INSERT INTO posicio VALUES ('aler');
INSERT INTO posicio VALUES ('pivot');

INSERT INTO membre_equip VALUES ('Miquel Brunet','Basquet Olot');
INSERT INTO membre_equip VALUES ('Blai Marqu�s','Basquet Olot');
INSERT INTO membre_equip VALUES ('Pol Ruiz','Basquet Olot');
INSERT INTO membre_equip VALUES ('Albert Vidal','Basquet Olot');
INSERT INTO membre_equip VALUES ('Marc Comas','Basquet Olot');
INSERT INTO membre_equip VALUES ('Josep Comes','Girona BC');
INSERT INTO membre_equip VALUES ('Pep Homet','Girona BC');
INSERT INTO membre_equip VALUES ('Joan Blanquer','Girona BC');
INSERT INTO membre_equip VALUES ('Joan Miquel Pi','Girona BC');
INSERT INTO membre_equip VALUES ('Ernest Rodr�guez','Girona BC');
INSERT INTO membre_equip VALUES ('Marc Sanlleh�','Angl�s Club');
INSERT INTO membre_equip VALUES ('Miquel Domingo','Angl�s Club');
INSERT INTO membre_equip VALUES ('Jaume Brossa','Angl�s Club');
INSERT INTO membre_equip VALUES ('Ramon Freixes','Angl�s Club');
INSERT INTO membre_equip VALUES ('Marc Freixes','Angl�s Club');
INSERT INTO membre_equip VALUES ('Joan Brunet','Giron�s BC');
INSERT INTO membre_equip VALUES ('Francesc Marsal','Giron�s BC');
INSERT INTO membre_equip VALUES ('Marc Carnic�','Giron�s BC');
INSERT INTO membre_equip VALUES ('D�dac Serrano','Giron�s BC');

INSERT INTO jugador VALUES ('Pol Ruiz',5,124,'Pivot');
INSERT INTO jugador VALUES ('Albert Vidal',8,456,'Aler');
INSERT INTO jugador VALUES ('Marc Comas',10,765,'Base');
INSERT INTO jugador VALUES ('Joan Blanquer',7,678,'Aler');
INSERT INTO jugador VALUES ('Joan Miquel Pi',9,896,'Pivot');
INSERT INTO jugador VALUES ('Ernest Rodr�guez',10,234,'Escorta');
INSERT INTO jugador VALUES ('Jaume Brossa',7,457,'Base');
INSERT INTO jugador VALUES ('Ramon Freixes',9,566,'Aler');
INSERT INTO jugador VALUES ('Marc Freixes',11,239,'Pivot');
INSERT INTO jugador VALUES ('Francesc Marsal',4,56,'Pivot');
INSERT INTO jugador VALUES ('Marc Carnic�',10,895,'Pivot');
INSERT INTO jugador VALUES ('D�dac Serrano',15,346,'Base');

INSERT INTO entrenador VALUES ('Blai Marqu�s',1987);
INSERT INTO entrenador VALUES ('Pep Homet',1999);
INSERT INTO entrenador VALUES ('Miquel Domingo',1979);
INSERT INTO entrenador VALUES ('Francesc Marsal',2001);

INSERT INTO directiu VALUES ('Miquel Brunet','President');
INSERT INTO directiu VALUES ('Josep Comes','President');
INSERT INTO directiu VALUES ('Pep Homet','Secretari');
INSERT INTO directiu VALUES ('Marc Sanlleh�','President');
INSERT INTO directiu VALUES ('Joan Brunet','President');

INSERT INTO arbitre VALUES ('Pere Just','Girona',2001);
INSERT INTO arbitre VALUES ('Marc Vidal','Blanes',2002);
INSERT INTO arbitre VALUES ('Josep Cam�','Olot',2002);
INSERT INTO arbitre VALUES ('Esteve Esteve','Girona',1998);
INSERT INTO arbitre VALUES ('Pere Pinyol','Girona',1998);

INSERT INTO partit VALUES (1,'Girona BC','Basquet Olot','12:00',69,70);
INSERT INTO partit VALUES (1,'Angl�s Club','Giron�s BC','11:30',82,55);
INSERT INTO partit VALUES (2,'Angl�s Club','Girona BC','11:30',99,75);
INSERT INTO partit VALUES (2,'Basquet Olot','Giron�s BC','17:00',87,76);
INSERT INTO partit VALUES (3,'Girona BC','Angl�s Club','12:00',66,70);
INSERT INTO partit VALUES (3,'Giron�s BC','Basquet Olot','10:00',80,83);

INSERT INTO arbitra VALUES (1,'Girona BC','Pere Just');
INSERT INTO arbitra VALUES (1,'Girona BC','Josep Cam�');
INSERT INTO arbitra VALUES (1,'Angl�s Club','Marc Vidal');
INSERT INTO arbitra VALUES (1,'Angl�s Club','Esteve Esteve');
INSERT INTO arbitra VALUES (2,'Angl�s Club','Pere Just');
INSERT INTO arbitra VALUES (2,'Angl�s Club','Marc Vidal');
INSERT INTO arbitra VALUES (2,'Basquet Olot','Josep Cam�');
INSERT INTO arbitra VALUES (2,'Basquet Olot','Pere Pinyol');
INSERT INTO arbitra VALUES (3,'Girona BC','Pere Just');
INSERT INTO arbitra VALUES (3,'Girona BC','Pere Pinyol');
INSERT INTO arbitra VALUES (3,'Giron�s BC','Esteve Esteve');
INSERT INTO arbitra VALUES (3,'Giron�s BC','Josep Cam�');

/*90*/
select equip.nom, equip.estadi, directiu.nom from directiu, membre_equip, equip, estadi
where (membre_equip.nom = directiu.nom) and (membre_equip.equip = equip.nom) and (directiu.carrec = 'President')
and (equip.estadi = estadi.nom) and estadi.aforament < (select avg(aforament) from estadi);

/*91*/

-- Exercici 91
SELECT a.arbitre FROM arbitra a, partit p
WHERE a.jornada = p.jornada AND a.equip_local = p.equip_local and p.punts_local > p.punts_visitant 
GROUP BY a.arbitre 
HAVING COUNT(*) > 1;

SELECT e.nom AS Equip, me.nom AS Jugador, (SELECT en.nom FROM entrenador en WHERE en.nom = me.nom) AS Entrenador FROM equip e, membre_equip me
WHERE me.equip = e.nom AND e.nom IN (SELECT p.equip_visitant FROM partit p WHERE p.punts_visitant > p.punts_local GROUP BY p.equip_visitant HAVING COUNT(*) >= 2)
ORDER BY e.nom, me.nom;

-- Exercici 93
SELECT DISTINCT e.nom, d.nom AS president FROM equip e, membre_equip me, directiu d, partit p
WHERE me.nom = d.nom AND me.equip = e.nom AND d.carrec = 'President' AND p.equip_visitant = e.nom AND p.punts_visitant > (SELECT AVG(punts_visitant) FROM partit);

-- Exercici 94
SELECT j.nom, j.posicio, me.equip FROM jugador j, entrenador e, membre_equip me
WHERE j.nom = e.nom AND j.nom = me.nom
ORDER BY me.equip, j.nom;

-- Exercici 95
SELECT me.nom, me.equip FROM membre_equip me
WHERE me.nom LIKE '%Brunet';

-- Exercici 96 
SELECT d.nom, me.equip FROM directiu d, membre_equip me
WHERE d.nom = me.nom AND d.carrec <> 'President';

-- Exercici 97 
SELECT me.equip, COUNT(j.fitxa) AS total_fitxes FROM membre_equip me, jugador j
WHERE j.nom = me.nom GROUP BY me.equip;

-- Exercici 98 
SELECT p.equip_visitant, SUM(p.punts_visitant) AS total_punts_visitant FROM partit p
WHERE p.punts_visitant > p.punts_local
GROUP BY p.equip_visitant;

-- Exercici 99
SELECT j.nom, me.equip FROM jugador j, membre_equip me
WHERE j.nom = me.nom AND j.fitxa > 400;

-- Exercici 100
SELECT j.nom, me.equip FROM jugador j, membre_equip me
WHERE j.nom = me.nom AND j.fitxa > 400;

-- Exercici 101
SELECT me.equip, COUNT(j.fitxa) AS total_fitxes FROM jugador j, membre_equip me
WHERE j.nom = me.nom AND j.fitxa > 400
GROUP BY me.equip
ORDER BY me.equip ASC;

-- Exercici 102 
SELECT nom FROM equip
WHERE pressupost = (SELECT MAX(pressupost) FROM equip);

-- Exercici 103
select nom from arbitre 
where (ciutat_naixement = 'Olot') and (year(now()) - antiguitat > 5 );

-- Exercici 104 
select max(abs(punts_local - punts_visitant)) from partit;

-- Exercici 105

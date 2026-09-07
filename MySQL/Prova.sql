CREATE DATABASE prova;
USE prova;

CREATE TABLE alumne(
codi_matricula int  PRIMARY KEY,
nom           VARCHAR(50), /*VARCHAR ES PARA PONER TEXTO*/
cognom        VARCHAR(50),
adreça		  VARCHAR(50)
);


CREATE TABLE modul(
codi INT PRIMARY KEY,
nom VARCHAR (50),
hores INT,
cicle VARCHAR(50),
curs INT 

				  );
                  
CREATE TABLE matricula(

codi_alumne INT,
foreign key (codi_alumne) references alumne (codi_matricula), 
codi_modul INT,
foreign key (codi_modul) references modul (codi),
PRIMARY KEY (codi_alumne, codi_modul)




);
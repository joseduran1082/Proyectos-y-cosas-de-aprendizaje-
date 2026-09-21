CREATE DATABASE ClubDeportivo;
USE ClubDeportivo;

CREATE TABLE Competicion (
    nombre VARCHAR(100) PRIMARY KEY,
    modalidad VARCHAR(100),
    lugar VARCHAR(100)
);

CREATE TABLE Material (
    codigo VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion VARCHAR(255)
);

CREATE TABLE Deportista (
    dni VARCHAR(20),
    nombre VARCHAR(100),
    telefono VARCHAR(20),
    n_licencia VARCHAR(20) PRIMARY KEY
);

CREATE TABLE NoDeportistaActivo (
    dni VARCHAR(20),
    nombre VARCHAR(100),
    telefono VARCHAR(20),
    numero_no_activo INT PRIMARY KEY
);

CREATE TABLE Edicion (
    numero INT,
    nombre_competicion VARCHAR(100),
    f_inicio DATE,
    f_fin DATE,
    PRIMARY KEY (numero, nombre_competicion),
    FOREIGN KEY (nombre_competicion) REFERENCES Competicion(nombre)
);

CREATE TABLE Entrena (
    n_licencia_deportista VARCHAR(20),
    numero_no_activo_entrenador INT,
    PRIMARY KEY (n_licencia_deportista, numero_no_activo_entrenador),
    FOREIGN KEY (n_licencia_deportista) REFERENCES Deportista(n_licencia),
    FOREIGN KEY (numero_no_activo_entrenador) REFERENCES NoDeportistaActivo(numero_no_activo)
);

CREATE TABLE Participa (
    n_licencia_deportista VARCHAR(20),
    numero_edicion INT,
    nombre_competicion VARCHAR(100),
    codigo_material VARCHAR(20),
    posicion VARCHAR(50),
    PRIMARY KEY (n_licencia_deportista, numero_edicion, nombre_competicion),
    FOREIGN KEY (n_licencia_deportista) REFERENCES Deportista(n_licencia),
    FOREIGN KEY (numero_edicion, nombre_competicion) REFERENCES Edicion(numero, nombre_competicion),
    FOREIGN KEY (codigo_material) REFERENCES Material(codigo)
);

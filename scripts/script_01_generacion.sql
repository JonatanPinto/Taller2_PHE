drop database productos_profesor_web_phe;
/*	SCRIPT PARA EL MANEJO DE BASES DE DATOS
	DEL PROYECTO DE PRODUCTOS DE TRABAJO DE
	LOS PROFESORES
*/

-- Mostrar las bases de datos
SHOW DATABASES;

-- Crea la base de datos
CREATE DATABASE IF NOT EXISTS productos_profesor_web_phe CHARACTER SET utf8 COLLATE utf8_general_ci;

-- Muestra las bases de datos
SHOW DATABASES;

-- Usa la base de datos 
USE productos_profesor_web_phe;


-- Creación de la tabla area
CREATE TABLE area (
	clave_area VARCHAR(10) PRIMARY KEY,
	nombre VARCHAR(45)
) ENGINE=InnoDB;

-- Creación de la tabla profesor
CREATE TABLE profesor (
	numero_economico VARCHAR(10) PRIMARY KEY,
	nombre VARCHAR(45),
	primer_apellido VARCHAR(45),
	segundo_apellido VARCHAR(45),
	grado_academico VARCHAR(45),
	area_clave_area VARCHAR(10) NOT NULL,
	CONSTRAINT profesor_area
	FOREIGN KEY (area_clave_area) REFERENCES area (clave_area)
		ON DELETE RESTRICT ON UPDATE RESTRICT) ENGINE=InnoDB;

-- Creación de la tabla usuario
CREATE TABLE usuario (
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
	password VARCHAR(40),
	profesor_numero_economico VARCHAR(10),
	CONSTRAINT usuario_profesor
	FOREIGN KEY (profesor_numero_economico) REFERENCES profesor (numero_economico)
		ON DELETE RESTRICT ON UPDATE RESTRICT) ENGINE=InnoDB;

-- Creación de la tabla proyecto_investigacion
CREATE TABLE proyecto_investigacion (
	id_proyecto_investigacion VARCHAR(10) PRIMARY KEY,
	nombre VARCHAR (150),
	area_clave_area VARCHAR(10) NOT NULL,
	CONSTRAINT proyecto_investigacion_area
	FOREIGN KEY (area_clave_area) REFERENCES area(clave_area)
	ON DELETE RESTRICT ON UPDATE RESTRICT
)ENGINE = InnoDB;

-- Creación de la tabla profesor_proyecto_investigacion
CREATE TABLE profesor_proyecto_investigacion(
	id_profesor_proyecto_investigacion INT AUTO_INCREMENT PRIMARY KEY,
	rol VARCHAR(15),
	profesor_numero_economico VARCHAR(10) NOT NULL,
	proyecto_investigacion_id_proyecto_investigacion VARCHAR(10) NOT NULL,
	CONSTRAINT profesor_proyecto_profesor
	FOREIGN KEY (profesor_numero_economico) 
	REFERENCES profesor(numero_economico) 
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT profesor_proyecto_investigacion_proyecto
	FOREIGN KEY (proyecto_investigacion_id_proyecto_investigacion)
	REFERENCES proyecto_investigacion(id_proyecto_investigacion)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

-- Creación de la tabla revista
CREATE TABLE revista(
	isbn VARCHAR(15) PRIMARY KEY,
	nombre VARCHAR(150),
	editorial VARCHAR(100),
	tipo VARCHAR(20)
)Engine=InnoDB;

-- Creación de la tabla articulo_investigacion
CREATE TABLE articulo_investigacion (
	id_articulo_investigacion INT AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(200),
	fecha_publicacion DATE,
	puntos INT,
	estado VARCHAR(20),
	proyecto_investigacion_id_proyecto_investigacion VARCHAR(10) NOT NULL,
	revista_isbn VARCHAR(30) NOT NULL,
	CONSTRAINT articulo_investigacion_proyecto
	FOREIGN KEY (proyecto_investigacion_id_proyecto_investigacion) 
	REFERENCES proyecto_investigacion(id_proyecto_investigacion) 
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT articulo_revista
	FOREIGN KEY (revista_isbn) 
	REFERENCES revista(isbn) 
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

-- Creación de la tabla profesor_articulo_investigacion
CREATE TABLE profesor_articulo_investigacion(
	id_profesor_articulo_investigacion INT
	AUTO_INCREMENT PRIMARY KEY,
	articulo_investigacion_id_articulo_investigacion INT NOT NULL,
	profesor_numero_economico VARCHAR(15) NOT NULL,
	CONSTRAINT profesor_articulo_investigacion_articulo
	FOREIGN KEY (articulo_investigacion_id_articulo_investigacion) 
	REFERENCES articulo_investigacion(id_articulo_investigacion) 
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT profesor_articulo_investigacion_profesor
	FOREIGN KEY (profesor_numero_economico) 
	REFERENCES profesor(numero_economico) 
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;


-- Creación de la tabla proyecto_terminal
CREATE TABLE proyecto_terminal(
	id_proyecto_terminal INT AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(150),
	cantitad_alumnos INT,
	fecha_inicio DATE,
	fecha_finalizacion DATE,
	puntos INT,
	estado VARCHAR(30),
	proyecto_investigacion_id_proyecto_investigacion VARCHAR(10) NOT NULL,
	CONSTRAINT proyecto_terminal_proyecto
	FOREIGN KEY (proyecto_investigacion_id_proyecto_investigacion) REFERENCES
	proyecto_investigacion(id_proyecto_investigacion) 
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

-- Creación de la tabla profesor_proyecto_terminal
CREATE TABLE profesor_proyecto_terminal(
	id_profesor_proyecto_terminal INT AUTO_INCREMENT PRIMARY KEY,
	profesor_numero_economico VARCHAR(15) NOT NULL,
	proyecto_terminal_id_proyecto_terminal INT NOT NULL,
	CONSTRAINT profesor_proyecto_terminal_profesor
	FOREIGN KEY (profesor_numero_economico) REFERENCES 
	profesor(numero_economico)
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT profesor_proyecto_terminal_proyecto
	FOREIGN KEY (proyecto_terminal_id_proyecto_terminal) REFERENCES 
		proyecto_terminal(id_proyecto_terminal)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

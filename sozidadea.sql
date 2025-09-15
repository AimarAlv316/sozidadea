USE sozidadea;
CREATE TABLE bazkidea (
id_bazkidea INT AUTO_INCREMENT PRIMARY KEY,
bazkide_izena VARCHAR(50) NOT NULL UNIQUE,
pasahitza VARCHAR(50) NOT NULL
)
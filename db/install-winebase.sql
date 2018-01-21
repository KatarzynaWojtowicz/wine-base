CREATE DATABASE winebase;

USE winebase;

CREATE TABLE wine_type (
    id_type INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    wine_type VARCHAR(32) NOT NULL
);

CREATE TABLE grape_variety (
    id_grape_variety INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    grape_variety VARCHAR(32) NOT NULL
);
    
CREATE TABLE colour (
    id_colour INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    colour VARCHAR(32) NOT NULL
);
    
CREATE TABLE wine (
    id_wine INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    wine_name VARCHAR(128) NOT NULL,
    wine_country VARCHAR(64) NOT NULL,
    wine_year INT NOT NULL,
    wine_price DECIMAL(9 , 2 ) NOT NULL,
    wine_description VARCHAR(256),
    id_type INT NOT NULL,
    FOREIGN KEY (id_type)
        REFERENCES wine_type (id_type),
    id_grape_variety INT NOT NULL,
    FOREIGN KEY (id_grape_variety)
        REFERENCES grape_variety (id_grape_variety),
    id_colour INT NOT NULL,
    FOREIGN KEY (id_colour)
        REFERENCES colour (id_colour)
);

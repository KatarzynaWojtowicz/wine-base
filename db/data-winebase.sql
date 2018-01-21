USE winebase;

INSERT INTO colour VALUES (NULL, 'pink');
INSERT INTO colour VALUES (NULL, 'red');
INSERT INTO colour VALUES (NULL, 'white');

INSERT INTO wine_type VALUES (NULL, 'sweet');
INSERT INTO wine_type VALUES (NULL, 'semi-sweet');
INSERT INTO wine_type VALUES (NULL, 'dry');
INSERT INTO wine_type VALUES (NULL, 'semi-dry');

INSERT INTO grape_variety VALUES (NULL, 'chardonnay');
INSERT INTO grape_variety VALUES (NULL, 'sauvignon blanc');
INSERT INTO grape_variety VALUES (NULL, 'riesling');
INSERT INTO grape_variety VALUES (NULL, 'cabernet sauvignon');
INSERT INTO grape_variety VALUES (NULL, 'merlot');
INSERT INTO grape_variety VALUES (NULL, 'pinot noir');
INSERT INTO grape_variety VALUES (NULL, 'syrah');


INSERT INTO wine values (NULL, 'Ca\' del Sette Bacca Del Merlo Bianco Veneto', 'Italy', '2016', 7.90, NULL, (SELECT id_type FROM wine_type WHERE wine_type = 'dry'), (SELECT id_grape_variety FROM grape_variety WHERE grape_variety = 'chardonnay'), (SELECT id_colour FROM colour WHERE colour = 'white'));
INSERT INTO wine values (NULL, 'Fernand Engel Riesling Reserve Alsace', 'France', '2016', 14.12, NULL, (SELECT id_type FROM wine_type WHERE wine_type = 'dry'), (SELECT id_grape_variety FROM grape_variety WHERE grape_variety = 'riesling'), (SELECT id_colour FROM colour WHERE colour = 'white'));
INSERT INTO wine values (NULL, 'Vieux Parc Amandiers d\'Hauterive', 'France', '2015', 9.42, NULL, (SELECT id_type FROM wine_type WHERE wine_type = 'dry'), (SELECT id_grape_variety FROM grape_variety WHERE grape_variety = 'merlot'), (SELECT id_colour FROM colour WHERE colour = 'red'));


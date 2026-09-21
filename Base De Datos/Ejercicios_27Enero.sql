/*Ejercicios*/

select upper(p.nom_cientific), upper(p.nom_popular) from planta p, planta_exterior pe, reproduccio r
where p.nom_cientific = pe.nom_planta and p.nom_cientific = r.nom_planta and r.metode_reproduccio = 'Esqueix'
Union
SELECT UPPER(p.nom_cientific), UPPER(p.nom_popular) FROM planta p, planta_interior pi, reproduccio r
WHERE p.nom_cientific = pi.nom_planta AND p.nom_cientific = r.nom_planta AND r.grau_exit = 'Baix';


SELECT p.nom_cientific, pi.temperatura FROM planta p, planta_interior pi
WHERE p.nom_cientific = pi.nom_planta AND pi.temperatura >= (SELECT MAX(temperatura) FROM planta_interior) - 1
ORDER BY pi.temperatura DESC;


SELECT p.nom_cientific, p.nom_popular FROM planta p, dosi_adob d
WHERE p.nom_cientific = d.nom_planta AND d.nom_adob = 'Casadob'AND p.nom_cientific 
NOT IN ( SELECT nom_planta FROM dosi_adob WHERE nom_estacio = 'Primavera');

SELECT LEFT(p.nom_popular,5), pi.nom_planta FROM planta p, planta_interior pi, reproduccio r
WHERE p.nom_cientific = pi.nom_planta AND pi.ubicacio = 'Llum indirecta'
UNION
SELECT LEFT(p.nom_popular,5), pe.nom_planta FROM planta p, planta_exterior pe
WHERE p.nom_cientific = pe.nom_planta AND pe.tipus_planta = 'T';

SELECT p.nom_cientific FROM planta p, planta_exterior pe, dosi_adob d, adob a
WHERE p.nom_cientific = pe.nom_planta AND p.nom_cientific = d.nom_planta AND d.nom_adob = a.nom_adob AND a.nom_firma = 'CIRSADOB'
UNION
SELECT p.nom_cientificm FROM planta p, planta_interior pi, reproduccio r
WHERE p.nom_cientific = pi.nom_planta AND p.nom_cientific = r.nom_planta AND r.metode_reproduccio = 'Capficats';

SELECT p.nom_popular, d.quantitat_adob FROM planta p, dosi_adob d
WHERE p.nom_cientific = d.nom_planta AND d.quantitat_adob NOT IN ( SELECT MIN(quantitat_adob) FROM dosi_adob UNION SELECT MAX(quantitat_adob) FROM dosi_adob)
ORDER BY d.quantitat_adob;

SELECT p.nom_cientific FROM planta p, dosi_adob d
WHERE p.nom_cientific = d.nom_planta AND p.nom_popular LIKE 'C%' AND d.nom_estacio = 'Primavera';

SELECT p.nom_cientific FROM planta p, exemplar_planta e
WHERE p.nom_cientific = e.nom_planta AND p.nom_cientific NOT IN ( SELECT nom_planta FROM dosi_adob WHERE nom_adob = 'Casadob');


SELECT p.nom_popular, p.nom_cientific FROM planta p, exemplar_planta e
WHERE p.nom_cientific = e.nom_planta AND p.floracio IS NOT NULL AND p.nom_cientific NOT IN ( SELECT nom_planta FROM planta_interior)
ORDER BY p.nom_popular;
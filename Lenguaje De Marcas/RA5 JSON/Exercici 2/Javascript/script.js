// CAPTURA DE LES DADES D'UNA TAULA

// L’objectiu d’aquest exercici és aprendre a llegir les dades d'una taula HTML
// mitjançant JavaScript i convertir-les en un objecte JSON.

// PRIMER CAL ENTENDRE COM FUNCIONA UNA TAULA

// Un element <table> està format per una capçalera <thead> i per les dades <tbody>
// Un <thead> té una fila (row) amb les dades de la capçalera: <th>
// Un <tbody> té vàries files (row) amb les dades de cada fila <td>

// Element	    Significat	Exemple
// <tr>	    Fila de la taula	<tr>...</tr>
// <th>	    Cel·la de capçalera (títols de columna)	<th>Jugador</th>
// <td>	    Cel·la de dades (informació d'un jugador, puntuacions, etc.)	<td>Anna</td>

// +------------+------------+------------+
// |   <th>     |   <th>     |   <th>     |  <-- Fila de capçalera (<tr>)
// |  Posició   |  Jugador   |   Punts    |
// +------------+------------+------------+
// |   <td>     |   <td>     |   <td>     |  <-- Primera fila de dades (<tr>)
// |     1      |   Anna     |    1500    |
// +------------+------------+------------+
// |   <td>     |   <td>     |   <td>     |  <-- Segona fila de dades (<tr>)
// |     2      |   Pau      |    1300    |
// +------------+------------+------------+
// |   <td>     |   <td>     |   <td>     |  <-- Tercera fila de dades (<tr>)
// |     3      |   Jordi    |    1200    |
// +------------+------------+------------+

// ENUNCIAT EXERCICI

// Es proporciona el fitxer index.html, que ja conté:
// - Una taula amb la classificació d’un joc.
// - Un botó per convertir les dades a JSON.
// - Un <pre> on es mostrarà el JSON generat.

// Desenvolupa el codi JavaScript següent

// 1. Crea i enllaça el fitxer script.js
// 2. Captura el botó amb JavaScript i associa-li una funció que:
    // - crei una variable de tipus array amb el nom de "classificacio". En aquest array hi guardarem els
    // diferents objectes "jugador" que convertirem a un arxiu JSON
    // - capturi en una variable "files" de tipus const totes les files de la taula (elements <tr>).
    // - comprova que les has capturades amb un console.log
    // - crea un bucle que recorri una a una les files [i] de la taula (elements <td> d'una fila <tr>). Per cada fila:

        // assigni a una variable "columnes" de tipus let els elements <td> d'aquesta fila [i]
        // ara columnes conté un array de 3 elements <td> per a la fila [i]
        // ara cal crear una variable "jugador" que serà un objecte i que contindrà tres parelles clau:valor
        //      posicio: amb el valor de columnes[0] passat per un Parse
        //      nom: amb el valor de columnes[1] 
        //      punts:  amb el valor de columnes[2] passat per un Parse
        // Quan tenim el primer objecte jugador, li fem un PUSH i el posem com a primer objecte de la matriu "classificació"
        // 

    // Despñ´res del bucle, tindrem un array "classificació" amb 3 objectes

    // Ara cal convertir "classificació" a un arxiu JSON amb JSON.stringify(classificacio, null, 2)
    // Actualitzar l'elemnt <pre> amb el valor del JSON obtingut.

// CAPTURA DE LES DADES D'UNA TAULA

// 1. Capturem el botó i li associem una funció
const boto = document.getElementById("convertir-json");

boto.addEventListener("click", function() {

    // Array buit on guardarem els objectes jugador
    const classificacio = [];

    // Capturem totes les files del <tbody>
    const files = document.querySelectorAll("#taula-classificacio tbody tr");

    console.log("Files capturades:", files);

    // Recorrem una a una les files
    for (let i = 0; i < files.length; i++) {

        let columnes = files[i].querySelectorAll("td");

        const jugador = {
            posicio: parseInt(columnes[0].textContent),
            nom: columnes[1].textContent,
            punts: parseInt(columnes[2].textContent)
        };

        classificacio.push(jugador);
    }

    // Convertim a JSON i mostrem el resultat
    const jsonGenerat = JSON.stringify(classificacio, null, 2);
    document.getElementById("output").textContent = jsonGenerat;
});
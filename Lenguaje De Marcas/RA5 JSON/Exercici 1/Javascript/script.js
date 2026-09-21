// CAPTURA DE LES DADES D'UN FORMULARI

// L’objectiu d’aquest exercici és programar un script en JavaScript que capturi les dades
// d’un formulari HTML, les converteixi en JSON i les mostri a la pantalla.

// Es proporciona el fitxer index.html, que ja conté:

// Un formulari amb els camps nom, email i edat.
// Un botó d’enviament.
// Un element <pre> (preformatted text) on es mostrarà el JSON generat.
// No cal modificar el fitxer HTML. Només has de treballar amb el fitxer JavaScript.

// Desenvolupa el codi JavaScript
// 1. Crea un fitxer script.js i assegura’t que està enllaçat correctament a l'index.html.

// 2. Captura l’esdeveniment submit del formulari i evita que la pàgina es refresqui
        // Per fer això, a la funció del eventlistener li has de passar "event" i al event aplicar-li el mètode event.preventDefault()
        // Per defecte, quan s'envia un formulari, la pàgina es recarrega automàticament.
        // Això impediria poder capturar la informació amb el codi Javascript.
        // Per evitar aquest refresc, fem servir:
        // event.preventDefault(); 
        // Aquest mètode evita el refresc perquè puguem gestionar les dades amb JavaScript sense perdre la informació.
// 3. Obté els valors dels camps del formulari.
// 4. Emmagatzema les dades en un objecte JavaScript.
// 5. Converteix l’objecte en JSON
// 6. Mostra el JSON generat dins de l'element <pre> ja proporcionat a l'index.html.

// CAPTURA DE LES DADES D'UN FORMULARI

// 1. Obtenim la referència al formulari
const formulari = document.getElementById("formulari");

// 2. Capturem l'esdeveniment submit i evitem el refresc de la pàgina
formulari.addEventListener("submit", function(event) {
    event.preventDefault();

    // 3. Obtenim els valors dels camps del formulari
    const nom = document.getElementById("nom").value;
    const email = document.getElementById("email").value;
    const edat = document.getElementById("edat").value;

    // 4. Emmagatzemem les dades en un objecte JavaScript
    const usuari = {
        nom: nom,
        email: email,
        edat: parseInt(edat)
    };

    // 5. Convertim l'objecte en JSON
    const jsonGenerat = JSON.stringify(usuari, null, 2);

    // 6. Mostrem el JSON generat dins de l'element <pre>
    document.getElementById("output").textContent = jsonGenerat;
});
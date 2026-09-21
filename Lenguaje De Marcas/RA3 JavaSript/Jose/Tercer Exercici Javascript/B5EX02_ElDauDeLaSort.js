/*1. Genera un número aleatori entre 1 i 6 (inclosos) i guarda'l en una variable anomenada 'tirada'*/
let tirada = Math.floor(Math.random() * 6 ) + 1; 
/* 2. Mostra el número */
console.log("Has tret un " + tirada);
/* 3. Condicions */
if (tirada === 6) {
    console.log("GUANYES! Captures l'anell!");
} else if (tirada === 1) {
    console.log("PÍFIA! perds el torn.");
} else {
    console.log("Tirada normal. El combat continua.");
}
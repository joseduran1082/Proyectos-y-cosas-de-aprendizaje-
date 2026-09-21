// 1. Preguntem el nom del gos
let nomGos = prompt("Com es diu el teu gos?");

// 2. Preguntem l'edat del gos
let edatGos = prompt("Quants anys té el teu gos?");

// 3. Convertim l'edat a número
edatGos = parseInt(edatGos);

// 4. Calculem l'edat humana
let edatHumana = edatGos * 7;

// 5. Mostrem el resultat per consola
console.log(`Si la ${nomGos} fos humana, tindria ${edatHumana} anys.`);

// 6. Alert final
alert(`Adéu ${nomGos}, gràcies per jugar!`);
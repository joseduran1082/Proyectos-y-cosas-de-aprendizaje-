'use strict';
const producte = {
    nom: "Monitor de 20 polzades",
    disponible: true,
    preu: 30
}

const usuari = {
    nom: "Jose",
    edat: 19,
    email: "jsduran@alumnat.copernic.cat",
    prova: "prova"
}

//Exemple 1, passa aquest format a JSON per a que es pogui intercanviar la informació
const jsonString = JSON.stringify(usuari);
console.log(jsonString);

//Exemple 2, en aquest cas el que fa en json es adquirir l format amb les especificacions.
const jsonString2 = JSON.stringify(usuari, null, 2);
console.log(jsonString2);

// Exemple 3, en aquest exepmple podem veure 
// com es fa un ARRAY per nomes agafar els atributs dessitjats.
const jsonFiltrat = JSON.stringify(usuari, ["nom", "email"]);
console.log(jsonFiltrat)

// Exemple 4, ara en comptes de amb una ARRAY ho farem amb una Funció.
const jsonFiltrat2 = JSON.stringify(usuari, (clau,valor) => {
    if(clau == "email") {
        return undefined;
    }
    return valor;
},2);
console.log("Exemple 4");
console.log(jsonFiltrat2);
// Exemple 5, en aquest cas tornem a utilitzar una funció pero amb el resultat contrari a l'anterior.
const jsonAmbFuncio2 = JSON.stringify(usuari, (clau,valor) => {
    if(clau == "edat") {
        return valor; // Nòmes retorna la edat.
    }
    return undefined; },2);

console.log("Exemple 5");
console.log(jsonAmbFuncio2);
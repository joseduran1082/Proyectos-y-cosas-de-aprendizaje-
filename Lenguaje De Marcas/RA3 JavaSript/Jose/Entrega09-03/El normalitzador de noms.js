let nom = prompt("Introdueix el teu nom: ")

let primeraLletra = nom.charAt(0).toUpperCase();
let restaNom = nom.slice(1).toLowerCase();

let nomFinal = primeraLletra + restaNom;

let longitudNom = nomFinal.length;

console.log("Nombre normalizado: " + nomFinal)
console.log("El nombre tiene " + longitudNom + " letras")
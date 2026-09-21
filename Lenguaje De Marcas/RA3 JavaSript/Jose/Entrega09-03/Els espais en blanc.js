let nom = prompt("Introdueix el teu nom: ")

let longInicial = nom.length;

let nomNet = nom.trim();
let primeraLletra = nomNet.charAt(0).toUpperCase();
let restaNom = nomNet.slice(1).toLowerCase();

let nomFinal = primeraLletra + restaNom;

let longitudNom = nomFinal.length;

console.log("Nombre normalizado: " + nomFinal)
console.log("El nombre tiene " + longitudNom + " letras(y no " + longInicial+ " !)")
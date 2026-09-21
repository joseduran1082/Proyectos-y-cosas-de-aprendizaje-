// 1. Demanar l'edat
let edat = parseInt(prompt("Introdueix la teva edat:"));

// 2. Demanar el nom i netejar espais
let nom = prompt("Introdueix el teu nom:").trim();

// 3. Comprovar si és major d'edat
let esMajorEdat = edat >= 18;

// 4. Comprovar si és VIP
let esElVip = nom === "Brad Pitt" || nom === "Zendaya";

// 5. Mostrar resultats
console.log("L'usuari és major d'edat?: " + esMajorEdat);
console.log("L'usuari és el VIP esperat?: " + esElVip);
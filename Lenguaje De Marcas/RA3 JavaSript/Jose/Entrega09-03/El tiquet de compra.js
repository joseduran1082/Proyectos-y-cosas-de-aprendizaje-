// Variable fixa
let botiga = "SUPERMERCATS JOSE";

// Dades del primer producte
let nomProducte1 = prompt("Quin és el primer producte?");
let preuProducte1 = parseFloat(prompt("Quin és el preu del primer producte?"));

// Dades del segon producte
let nomProducte2 = prompt("Quin és el segon producte?");
let preuProducte2 = parseFloat(prompt("Quin és el preu del segon producte?"));

// Càlcul del total
let total = preuProducte1 + preuProducte2;

// Imprimim el tiquet per consola
console.log("-----------------------------------------");
console.log(`BENVINGUTS A ${botiga}`);
console.log("-----------------------------------------");
console.log(`${nomProducte1} ................. ${preuProducte1} €`);
console.log(`${nomProducte2} ................... ${preuProducte2} €`);
console.log("-----------------------------------------");
console.log(`TOTAL A PAGAR: ${total} €`);
console.log("-----------------------------------------");
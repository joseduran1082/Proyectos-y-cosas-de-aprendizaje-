// 1. Demanar el preu del producte
let preu = parseFloat(prompt("Introdueix el preu del producte:"));

// 2. Demanar la quantitat
let quantitat = parseInt(prompt("Introdueix la quantitat:"));

// 3. Calcular el Subtotal
let subtotal = preu * quantitat;

// 4. Calcular l'IVA (21%)
let iva = subtotal * 0.21;

// 5. Calcular el Total
let total = subtotal + iva;

// 6. Convertir el Total a text
let totalText = total.toString();

// 7. Mostrar el resum amb concatenació clàssica
console.log("Subtotal: " + subtotal + " | Total a pagar: " + totalText);
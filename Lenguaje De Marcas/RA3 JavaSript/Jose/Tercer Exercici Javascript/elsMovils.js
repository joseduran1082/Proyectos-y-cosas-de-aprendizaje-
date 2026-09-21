'use strict';

let nombre = prompt("Dame el nombre del movil: ");

let quantitat = parseInt(prompt("Dame la cantidad de " +nombre + " que quieres: "));

let precio = parseFloat(prompt("Dame el precio por unidad: "));

let precioFinal = precio * quantitat;

let dineroActual = parseFloat(prompt("Dime cuanto dinero tienes actualmente: "));

let si_no = prompt("Quieres comprar ? : Si/No ");



function puedeComprar(dineroActual, precioFinal) {
    return dineroActual >= precioFinal;
}

// Función final de compra
function compraFinal(si_no, dineroActual, precioFinal) {

    if (si_no === "Si") {

        if (puedeComprar(dineroActual, precioFinal)) {
            return "✅ Compra realizada";
        } else {
            return "❌ No tienes suficiente dinero";
        }

    } else {
        return "👋 Saliendo...";
    }
}


console.log("Precio total: " + precioFinal);

console.log(compraFinal(si_no, dineroActual, precioFinal));
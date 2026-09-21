/* 1. Variable global */
let total = 0;
/* Funció per afegir */
function agregarCarret(preu) {
    total += preu;
    return total;
}
/* Funció per calcular impost */
function calcularImpost(sumaTotal) {
    return sumaTotal * 1.21;
}
/* 2. Afegir productes */
agregarCarret(200);
agregarCarret(300);
agregarCarret(400);
/* 3. Mostrar total */
console.log("Total acumulat -> " + total);
/* 4. Calcular total final */
let totalFinal = calcularImpost(total);
/* 5. Mostrar */
console.log("El total a pagar és de " + totalFinal);
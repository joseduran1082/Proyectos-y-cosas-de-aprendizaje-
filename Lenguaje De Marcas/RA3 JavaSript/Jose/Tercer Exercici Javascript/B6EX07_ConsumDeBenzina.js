/* 1. Demanar dades */
let litres = parseFloat(prompt("Introdueix els litres gastats","0"));
let distancia = parseFloat(prompt("Introdueix la distància (km)","0"));
/* 2. Funció */
function calcularConsum(litres, distancia) {
    return (litres / distancia) * 100;
}
/* 3. Cridar funció */
let consum = calcularConsum(litres, distancia);
/* 4. Classificació */
let resultat;
if (consum < 5) {
    resultat = "Molt eficient";
} else if (consum >= 5 && consum <= 8) {
    resultat = "Eficient";
} else {
    resultat = "Consum elevat";
}
/* 5. Mostrar resultats */
alert(resultat + ". El teu consum és de " + consum + " L/100 km.");
console.log(resultat + ". El teu consum és de " + consum + " L/100 km.");
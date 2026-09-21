let nombreSoci = prompt("Dame tu nombre: ");

let edad = parseInt(prompt("Dame tu edad: "));

let codiPromo = prompt("Dame tu codigo promocional: ");

let nombreNet = nombreSoci.trim();

let nombreFinal = nombreNet.charAt(0).toUpperCase() + nombreNet.slice(1).toLowerCase();

const calcularPreuFinal = (edat, codi) => {
    let preu = 50;

    if(edat <= 18 || edat >= 65){
        preu = 30;
    }
    if(codi === "FUNDADOR"){
        preu = preu - 5;
    }
    return preu;


}

let preuFinal = calcularPreuFinal(edad,codiPromo);

console.log("Soci: " + nombreFinal);
console.log("Edad: "+ edad);
console.log("Preu final de la quota: "+ preuFinal+" €");

if(preuFinal === 25){
    console.log("Tens una tarifa super reduida");
}
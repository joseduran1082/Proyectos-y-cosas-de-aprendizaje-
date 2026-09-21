let nomProducte = prompt("Dame el nombre del producto: ");
let quantitatActual = parseInt(prompt("Dime la cantidad: ")); 
let preuPerUnitat = parseFloat(prompt("Precio por unidad: "));

let nomProducteNet = nomProducte.trim();

let primeraLetraMayuscula = nomProducteNet.charAt(0).toUpperCase();

let restaNomMinuscula = nomProducteNet.slice(1).toLowerCase();

let nomFinal = primeraLetraMayuscula + restaNomMinuscula;

let valorEstock = quantitatActual * preuPerUnitat;



function avisarComanda(estoc){
    if(estoc < 10){
        return "URGENT: Cal demanar mes unitats!"
    }else{
        return "Stock suficient."
    }
}

let missatgeAvis = avisarComanda(quantitatActual);

console.log("Producte: " + nomFinal +" | Valor Total:"+valorEstock +"€" );
console.log(missatgeAvis);
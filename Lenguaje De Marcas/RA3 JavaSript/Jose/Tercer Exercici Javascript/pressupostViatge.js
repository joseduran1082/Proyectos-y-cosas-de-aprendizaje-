
let desti = prompt("Cual es tu destino?: ");

let preuTransport = parseFloat(prompt("Precio del transporte: "))

let numeroViatgers = parseInt(prompt("Numero de viajeros: "));

let destiNet = desti.trim();

let destiMayus = destiNet.toUpperCase();

const esGrupGran = (numeroViatgers) => {
    return numeroViatgers >= 5;
};

let preuTotal = preuTransport / numeroViatgers;

if(esGrupGran(numeroViatgers)){
   preuTotal = preuTotal - 50;
}

console.log("Destinacio: "+ desti);
console.log("Preu per persona: "+ preuTotal);
console.log("Teniu decompte de grup?: "+ esGrupGran(numeroViatgers));






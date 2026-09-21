let correo = prompt("Dame el Correo: ");

let anyDNaixement = parseInt(prompt("Dame tu año de nacimiento: "));

let codiDescompte = prompt("Dame un codigo de descuento si tienes: ");

let correoNet = correo.trim();

let esValid = correoNet.includes("@");

let edatActual = 2026- anyDNaixement;

const esPremium = (codiDescompte) => {
    if(codiDescompte === "PROMO2026" || codiDescompte === "VIP"){
        return true;
    } else{
        return false;
    }
};

console.log("Usuari "+ correoNet+ " | Edat "+edatActual+" anys");
console.log("Te un correo valid?: "+ esValid);
console.log("Es un usuari premium?: "+ esPremium(codiDescompte));
let nombre = prompt("Dame tu nombre: ");

let nota1 = parseFloat(prompt("Dame 1 nota: "));

let nota2 = parseFloat(prompt("Dame 2 nota: "));

let nombreNet = nombre.trim();

let nombreDefinitiu = nombreNet.charAt(0).toUpperCase() + nombreNet.slice(1).toLowerCase();

let promedio = (nota1 + nota2) / 2;

function evaluarNota(promedio) {
    if(promedio >= 5)
        return "Coronaste aprobado!!";
    else
        return "RASPAO MMGVOO ";
}

console.log("Alumno: "+ nombreDefinitiu+" | Promedio: " + promedio + " | Estado: " + evaluarNota(promedio));
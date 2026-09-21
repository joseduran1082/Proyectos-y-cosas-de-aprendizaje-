let nom = prompt("Introduce tu nombre: ");
let apellido = prompt("Introduce tu apellido: ");

let edad = prompt("Ahora tu edad: ");

let nombrePartido = nom.slice(0,3);
let apellidoLeng = apellido.length;
let edadX5 = edad * 5;

let nickName = nombrePartido + apellidoLeng + edadX5;

console.log("Hola "+nom+ ", el teu nom de jugador es: "+nickName)


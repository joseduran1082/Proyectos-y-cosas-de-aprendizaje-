'use strict';

let Curreu = prompt("Dame un correo: ");

let anyNaixement = prompt(parseInt("Dame tu fecha de nacimiento: "));

let codiDescompte = prompt("Tienes un codigo de desceunto? :");

let correoNet = Curreu.trim();

let esValid = correoNet.includes("@");

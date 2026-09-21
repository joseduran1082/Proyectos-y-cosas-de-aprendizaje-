// 1. Demanar Preu A
let preuA = parseFloat(prompt("Introdueix el Preu A:"));

// 2. Demanar Preu B
let preuB = parseFloat(prompt("Introdueix el Preu B:"));

// 3. Comparacions
let esMesCar = preuA > preuB;
let sonIguals = preuA === preuB;
let sonDiferents = preuA !== preuB;

// 4. Mostrar informe amb Template Literals
alert(`Anàlisi de preus:
A més car que B? ${esMesCar}.
Són iguals? ${sonIguals}.
Són diferents? ${sonDiferents}.`);
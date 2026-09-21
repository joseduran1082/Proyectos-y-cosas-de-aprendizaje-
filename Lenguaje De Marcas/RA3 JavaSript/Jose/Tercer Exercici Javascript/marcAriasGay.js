/*EX08 – El control d’assistència

Objectiu: Practicar while, objectes i comptadors.

Declara un array alumnes amb aquests objectes:

{ nom: 'Anna', present: true }
{ nom: 'Joan', present: false }
{ nom: 'Marta', present: true }
{ nom: 'Pau', present: true }
{ nom: 'Clara', present: false }
Declara:
let i = 0
let presents = 0
Amb un bucle while, recorre l’array.
Mostra per consola:
"Anna està present"
"Joan està absent"
etc.
Si l’alumne està present, incrementa el comptador presents.
Quan acabi el bucle, mostra:
Total presents: X*/ 

const alumnes = [
{ nom: 'Anna', present: true },
{ nom: 'Joan', present: false },
{ nom: 'Marta', present: true },
{ nom: 'Pau', present: true },
{ nom: 'Clara', present: false }];

let i = 0;
let present = 0;
while(i != alumnes.length){
    if(alumnes[i].present == true){
        present++;
        console.log(alumnes[i].nom + " Esta present");

    }
    else
        console.log(alumnes[i].nom + " Esta absent.");
    i++;
}
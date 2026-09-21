// Exemple 1: Exemple bàsic: Convertir un objecte a JSON


const usuari = {
    nom: "Anna",
    edat: 25,
    email: "anna@example.com"
};


const jsonString = JSON.stringify(usuari);
console.log(jsonString);
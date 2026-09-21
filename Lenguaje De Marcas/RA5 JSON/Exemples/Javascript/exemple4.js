// Exemple 4: Exemple amb arrays i objectes aniuats

const usuari = {
    nom: "Pau",
    edat: 30,
    interessos: ["música", "programació", "esport"],
    adreça: {
        carrer: "Carrer Major, 10",
        ciutat: "Barcelona"
    }
};

const jsonString = JSON.stringify(usuari, null, 0);
console.log(jsonString);



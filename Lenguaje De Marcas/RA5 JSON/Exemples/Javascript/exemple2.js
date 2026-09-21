// Exemple 2: Exemple amb espai per formatar el JSON


const usuari = {
    nom: "Anna",
    edat: 25,
    email: "anna@example.com"
};


const jsonString = JSON.stringify(usuari, null, 2);
console.log(jsonString);

// Aquí 2 indica que volem 2 espais per indentació.

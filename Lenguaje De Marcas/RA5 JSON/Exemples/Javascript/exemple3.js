// Exemple 3: Exemple amb reemplaçador per filtrar propietats

const usuari = {
    nom: "Anna",
    edat: 25,
    email: "anna@example.com"
};

// A. FILTRATGE AMB UN ARRAY

const jsonFiltrat = JSON.stringify(usuari, ["nom", "email"]);
console.log(jsonFiltrat);

// Aquí només s’inclouen nom i email, però no edat.

// B. FILTRATGE AMB UNA FUNCIÓ

// const jsonAmbFuncio = JSON.stringify(usuari, (clau, valor) => {
//     if (clau === "email") {
//         return undefined; // No inclourem l'email
//     }
//     return valor;
// });
// console.log(jsonAmbFuncio);

// L’email s’ha eliminat perquè la funció retorna undefined.

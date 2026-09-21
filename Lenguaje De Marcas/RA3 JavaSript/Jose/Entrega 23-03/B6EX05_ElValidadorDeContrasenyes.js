/* 1. Funció */
function esPasswordValid(password) {
    if (password.length >= 8) {
        return true;
    } else {
        return false;
    }
}
/* 2. Demanar password */
let userPassword = prompt("Introdueix una contrasenya","");
/* 3. Validació final */
if (esPasswordValid(userPassword)) {
    alert("Contrasenya vàlida!");
} else {
    alert("Massa curta!");
}
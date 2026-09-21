let tirada = Math.floor(Math.random() * 6) + 1; // genera 1 a 6
console.log(`Has tret un ${tirada}`);

if (tirada === 6) {
    console.log("GUANYES! Captures l'anell!");
} else if (tirada === 1) {
    console.log("PÍFIA! perds el torn.");
} else {
    console.log("Tirada normal. El combat continua.");
}
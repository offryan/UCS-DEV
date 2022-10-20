"use strict";

let n1 = parseFloat(prompt("Digite a Nota 1: "));
let n2 = parseFloat(prompt("Digite a Nota 2: "));
let n3 = parseFloat(prompt("Digite a Nota 3: "));
let n4 = parseFloat(prompt("Digite a Nota 4: "));

let media = (n1 + n2 + n3 + n4) / 4;

if (media >= 0 && media <= 10) {

    if (media >= 5.75) {
        alert('APROVADO!');
    }

    else if (media < 0.75) {
        alert('REPROVADO!');
    }

    else {
        alert('AF');
    }
}

else {
    alert('NOTA INVÁLIDA')
}


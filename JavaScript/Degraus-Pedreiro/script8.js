"use strict";

let altD = parseFloat(prompt("Digite a altura dos degraus: (em M)"));
let altP = parseFloat(prompt("Digite a altura do pedreiro: (em M)"));
let qtdeDeg = parseInt(prompt("Digite a quantidade de degraus: "));

let res = (altD * qtdeDeg);
let res2 = altP - res;

alert(res2);
console.log(res2);

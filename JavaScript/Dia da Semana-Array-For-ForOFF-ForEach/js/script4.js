"use strict";

let nomes = ["Zoro", "Se", "Perdeu", "De Novo"];
console.log(nomes);
nomes[3] = "max";

let frutas = [];
frutas[0] = "manga";
frutas[1] = "uva";
frutas[2] = "maça";
frutas[3] = "limão";
frutas[4] = "banana";

console.log( frutas[0] );

let meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio",
"Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];
console.log(meses);


let dh = new Date();
alert( meses[dh.getMonth()] );

console.log("FOR CLÁSSICO");
for (let i=0; i < meses.length; i++){
    console.log(meses[i]);
}

console.log("FOR...OF");
for (let mes of meses){
    console.log(mes);
}

console.log("forEach");
meses.forEach( function(mes, i){
    console.log(`${i+1} ${mes}`);
});
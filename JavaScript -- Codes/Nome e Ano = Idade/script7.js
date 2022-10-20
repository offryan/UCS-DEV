"use strict";

let nome = prompt("Digite um nome: ");
let anoA = parseInt(prompt("Digite o ano atual: "));
let ano = parseInt(prompt("Digite ano de nascimento: "));

let idade = anoA - ano;

alert(idade);
alert(nome);

console.log("Nome: ", nome);
console.log("Idade: ", idade);
"use strict";

//let num = parseInt(prompt('Digite um Número: '));

//alert((num % 2 == 0)? 'PAR' : 'ÍMPAR');

let dh = new Date();
let dia_s = dh.getDay();

switch(dia_s){
    case 0: alert('Domingo');
    break;
    case 1: alert('Segunda-Feira');
    break;
    case 2: alert('Terça-Feira');
    break;
    case 3: alert('Quarta-Feira');
    break;
    case 4: alert('Quinta-Feira');
    break;
    case 5: alert('Sexta-Feira');
    break;
    case 6: alert('Sábado');
    break;
}
"use strict";

let botao = document.getElementById('btn');
let div = document.querySelector('#relatorio');

botao.addEventListener('click', function () {

    let tab = Number(prompt('Digite a tabuada: '));
    div.innerHTML = '';

    //console.log(`${tab} x 0 = ${tab * 0}`); --> Forma Ineficaz!
    //console.log(`${tab} x 1 = ${tab * 1}`);
    //console.log(`${tab} x 2 = ${tab * 2}`);
    //console.log(`${tab} x 3 = ${tab * 3}`);
    //console.log(`${tab} x 4 = ${tab * 4}`);
    //console.log(`${tab} x 5 = ${tab * 5}`); --> Forma Ineficaz!

    for (let i = 0; i <= 10; i += 1) {     // --> Forma Eficaz

        div.innerHTML += `${tab} x ${i} = ${tab * i} <br>`;
    }
});
"use strict";
let botao = document.getElementById("btn");
let div = document.querySelector("#res");

botao.addEventListener("click", function(){
    let num = parseInt(prompt("Digite o valor"));
    div.innerHTML = "";
    //console.log(`${tab} x 0 = ${tab * 0}`);
    for (let i=2; i <= 2; i++){
        div.innerHTML += `O dobro é: ${num * i}<br>`;
    }
});
"use strict"

let elem_valor = document.querySelector("#txtvalor");
let elem_parcelas = document.querySelector("#txtparcelas");
let elem_result = document.querySelector("#txtresult");

document.getElementById("botao").addEventListener("click", function () {
    calcular();
});

function calcular() {

    let valor_compra = parseFloat(elem_valor.value);
    let qtde_p = parseInt(elem_parcelas.value);
    let msg = "";
    let valor_final = 0;
    let cor = "";

    if (qtde_p == 1) {
        valor_final = valor_compra;
        msg = `1x R$ ${valor_final}`;
        cor = "#0000ff";

    } else if (qtde_p == 2) {
        valor_final = valor_compra * 1.03;
        msg = `2x R$ ${valor_final / 2}`;
        cor = "#FFFF00";
    } else{
        valor_final = valor_compra * 1.07;
        msg = `4x R$ ${valor_final / 4}`;
        cor = "#FF0000";
    }

    let result = document.querySelector("#txtresult");
    result.value = msg;
    result.style.backgroundColor = cor;
}
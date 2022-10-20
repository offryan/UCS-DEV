"use strict"

document.querySelector("#botao").addEventListener("click", function () {

    let registro = document.querySelector("#txtreg").value;
    let nome = document.querySelector("#txtnome").value;
    let salario = Number(document.querySelector("#txtsalario").value);
    let resultado = document.querySelector("#txtresultado").value;

    if (salario <= 1434) {
        resultado.value = "0% (isento)";
    } else if (salario > 1434 && salario <= 2150) {
        resultado.value = salario * 0.075;
    } else if (salario > 2150 && salario <= 2866) {
        resultado.value = salario * 0.15;
    } else if (salario > 2866 && salario <= 3582) {
        resultado.value = salario * 0.225;
    } else {
        resultado.value = salario * 0.275;
    }

});
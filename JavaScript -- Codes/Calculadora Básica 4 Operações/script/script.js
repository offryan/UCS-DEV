var num1, num2;
window.onload = function(){
    document.getElementById("btnsoma").onclick = calcSoma;
    document.getElementById("btnsub").onclick = calcSubtracao;
    document.getElementById("btnmult").onclick = calcMultiplicacao;
    document.getElementById("btndiv").onclick = calcDivisao;
}

function lerNumeros(){
    num1 = parseFloat(document.getElementById("txtnum1").value);
    num2 = parseFloat(document.getElementById("txtnum2").value);
}

function mostraResultado(res){
    document.getElementById("txtresult").value = res;
}

function calcSoma(){
    lerNumeros();
    mostraResultado(num1+num2);
}
function calcSubtracao(){
    lerNumeros();
    mostraResultado(num1-num2);
}
function calcMultiplicacao(){
    lerNumeros();
    mostraResultado(num1*num2);
}
function calcDivisao(){
    lerNumeros();
    mostraResultado(num1/num2);
}
window.onload = function(){

    document.getElementById("botao").onclick = function(){
        calcular();
    }
}

function calcular(){

    var campo_base = document.getElementById("txtbase");
    var campo_altura = document.getElementById("txtaltura");
    var campo_area = document.getElementById("txtarea");

    var base = parseInt(campo_base.value);
    var altura = parseInt(campo_altura.value);
    var resultado = base * altura;

    campo_area.value = resultado;

}
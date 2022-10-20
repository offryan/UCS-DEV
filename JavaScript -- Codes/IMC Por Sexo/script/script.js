window.onload = function () {

    document.getElementById("botao").onclick = function () {
        calcularIMC();
    }
}

function calcularIMC() {

    var altura = parseFloat(document.getElementById("txtaltura").value);
    var peso = parseFloat(document.getElementById("txtpeso").value);
    var imc = peso / (altura * altura);

    document.getElementById("txtimc").value = imc;

    var sexo = 0;

    if (document.getElementById("sexoM").checked) {
        sexo = 1;
    }
    else if (document.getElementById("sexoF").checked) {
        sexo = 2;
    }

    var msg = conceitoImc(imc, sexo);

    document.getElementById("txtcondicao").value = msg;

    function conceitoImc(imc, sexo) {

        var condicao = "";

        if (sexo == 1) {
            if(imc < 20.7){
                condicao = "Abaixo do peso"
            }
            else if(imc >= 20.7 && imc < 26.4){
                condicao = "No peso normal"
            }
            else if(imc >= 26.4 && imc < 27.8){
                condicao = "Marginalmente acima do peso"
            }
            else if(imc >= 27.8 && imc < 31.1){
                condicao = "Acima do peso ideal"
            }
            else{
                condicao = "Obeso"
            }
        }

        else {
            if (imc < 19.1){
                condicao = "Abaixo do peso"
            }
            else if(imc >= 19.1 && imc < 25.8){
                condicao = "No peso ideal"
            }
            else if(imc >= 25.8 && imc < 27.3){
                condicao = "Marginalmente acima do peso"
            }
            else if(imc >= 27.3 && imc < 32.3){
                condicao = "Acima do peso"
            }
            else{
                condicao = "Obeso"
            }
        }
        return condicao;
    }
}
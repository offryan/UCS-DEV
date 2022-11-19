window.onload = function(){

    document.getElementById("botao").onclick=function(){

        var num1 = parseInt(document.getElementById("txtvalor1").value);
        var num2 = parseInt(document.getElementById("txtvalor2").value);

        if (num1 > num2){
            alert("O número 1 é o maior");
        }
        else if (num2 > num1){
            alert("O número 2 é o maior");
        }
        else {
            alert("Os números são iguais");
        }
    }
}

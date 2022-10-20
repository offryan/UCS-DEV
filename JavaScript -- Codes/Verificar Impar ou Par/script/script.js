
window.onload = function(){
    document.getElementById("botao").onclick=verificarNum;
}

function verificarNum(){
    
    var num = parseInt(document.getElementById("txtvalor").value);

    if (num % 2 == 0){
        alert("É par!");
    }

    else{
        alert("É ímpar!");
    }
}
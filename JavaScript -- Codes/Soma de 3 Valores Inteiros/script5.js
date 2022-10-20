window.onload = function(){
    document.getElementById("btn").onclick=function(){
        soma3();
    }
}


function soma3(){
var n1 = parseInt(document.getElementById("n1").value);
var n2 = parseInt(document.getElementById("n2").value);
var n3 = parseInt(document.getElementById("n3").value);
var res = n1 + n2 + n3;

document.getElementById("res").value = res;
}
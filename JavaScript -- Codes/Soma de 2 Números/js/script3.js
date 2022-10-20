

let elemento1 = document.querySelector("#txtv1");
let elemento2 = document.querySelector("#txtv2");

//arrow function
let validarValor = (event) => {

    return ((event.charCode >= 48 &&
             event.charCode <= 57) || event.charCode == 46)?
             true: event.preventDefault();
};

elemento1.addEventListener("keypress", validarValor);
elemento2.addEventListener("keypress", validarValor);

document.querySelector("#btn").addEventListener("click", function(){

    let v1 = Number(elemento1.value);
    let v2 = Number(elemento2.value);
    document.querySelector("#res").value = v1+v2;
});

const calcular = document.getElementById("calcular");
    
            function calculo() {
                
                let valor = document.getElementById("valor").value;
                let parcela = document.getElementById("parcela").value;
                let resultado = document.getElementById("resultado");
                
                if (valor === "") {
                    resultado.value = "vazio";
                    resultado.style.background = "grey";
                }
                
                if (parcela == 1) {
                    resultado.value = "1 x " + valor;
                    resultado.style.background = "#16c4f8";
                }

                if (parcela == 2) {
                    resultado.value = "2 x " + (valor / 2 + (valor * 0.03) / 2);
                }

                if (parcela == 4) {
                    resultado.value = "4 x " + (valor / 4 + (valor * 0.07) / 4);
                }
            }
            
            calcular.addEventListener("click", calculo);
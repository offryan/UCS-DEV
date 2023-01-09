algoritmo EX4
    inteiro x
    início
        escreva("Digite um valor entre 1 e 12: ")
        leia(x)

        se(x==1){
            escreva("Janeiro")
        }

        se(x==2){
            escreva("Fevereiro")
        }

        se(x==3){
            escreva("Março")
        }

        se(x==4){
            escreva("Abril")
        }

        se(x==5){
            escreva("Maio")
        }

        se(x==6){
            escreva("Junho")
        }

        se(x==7){
            escreva("Julho")
        }

        se(x==8){
            escreva("Agosto")
        }

        se(x==9){
            escreva("Setembro")
        }

        se(x==10){
            escreva("Outubro")
        }

        se(x==11){
            escreva("Novembro")
        }

        se(x==12){
            escreva("Dezembro")
        }

        se(x <= 0 ou x >= 13){
            escreva("Não existe um mês com esse número")
        }
    fim
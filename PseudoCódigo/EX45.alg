algoritmo EX4
    inteiro num, soma, contador, media
    início
        soma = 0
        contador = 0
        enquanto(verdadeiro){
            escreva("Digite um número inteiro: ")
            leia(num)
            soma = soma + num
            contador = contador + 1
            se(num == 0){
                pare
            }
        }
        media = soma/contador
        escreva("A média dos números digitados é: " +media)
    fim
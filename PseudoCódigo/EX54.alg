algoritmo EX3
    real num[i], soma=0, media, maior
    inteiro i, quant=0
    início
        para (i=0; i<10; i++){
            escreva("Digite os número desejados " + (i+1) + ": ")
            leia(num[i])
        }

        para (i=0; i<10; i++){
            soma += num[i]
        }
        media = soma / 10
        escreva("A média dos salários é R$" + media)

        se(num[i] > media){
            escreva("O números armazenados que estão acima da média é: " +num)
        }
    fim
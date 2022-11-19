algoritmo EX3
    real valC, valorP
    início
        escreva("Digite o valor da compra: ")
        leia(valC)

        escreva("Digite o quatidade de parcelas: ")
        leia(valorP)
    fim
void calculaParc(real valC, real valorP)
    inicio
        retorne total = (valC/valorP)*1.05
        escreva("O valor das parcelas é de (5% de juros): " +total+)
    fim

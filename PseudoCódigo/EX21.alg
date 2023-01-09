algoritmo EX8
    real moeda25, moeda10, moeda5
    início
        escreva("Digite a quantidade de moedas de R$0,25 colocadas no cofre: ")
        leia(moeda25)

        escreva("Digite a quantidade de moedas de R$0,10 colocadas no cofre: ")
        leia(moeda10)

        escreva("Digite a quantidade de moedas de R$0,05 colocadas no cofre: ")
        leia(moeda5)
    fim
void valorCofre(inteiro vinteCinco, inteiro dez, inteiro cinco)
    inicio
        vinteCinco = moeda25*0.25
        dez = moeda10*0.10
        cinco = moeda5*0.05

        total = vinteCinco + dez + cinco
        escreva("O valor arrecado no cofre é de: R$ " +total+)
    fim
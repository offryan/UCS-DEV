algoritmo EX1
    real deposito, taxa, rend, totalR
    início
        escreva("Digite o valor do depósito: ")
        leia(deposito)
        escreva("Digite o valor da taxa de juros: ")
        leia(taxa)

        rend = deposito*(taxa/100)
        total = deposito + rend

        escreva("O valor do rendimento é: " +rend+)
        escreva("O valor total após o rendimento é: " +total+)
    fim
algoritmo EX2
    real qtKwh, salM, valorK, valorP, ValorD
    início
        escreva("Digite o valor de kWh")
        leia(qtKwh)
        escreva("Digite o valor de salário mínimo: R$ ")
        leia(salM)

        valorK = salM/(7*100)
        valorP = qtKwh*valorK
        valor0 = valorP*0.9
    fim
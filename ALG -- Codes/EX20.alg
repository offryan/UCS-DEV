algoritmo EX7
    real pregoT, real pregoQ, total1, total2, totalGeral, comis
    início
        escreva("Digite quantos pregos telheiros foram vendidos: ")
        leia(pregoT)
        total1 = pregoT*1.05

        escreva("Digite quantos pregos quadrados foram vendidos: ")
        leia(pregoQ)
        total2 = pregoQ*0.51

        totalGeral = (total1 + total2)
        escreva("O total arrecadado foi de: R$ " +totalGeral+)

        comis = totalGeral*0.10
        escreva("O valor necessário a separar da comissão é: R$ " +comis+)

    fim
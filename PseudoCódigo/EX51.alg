algoritmo EX10
    inteiro num, i
    início
        i=0
        enquanto(i<=10){
            escreva("Digite um número: ")
            leia(num)

            escreva({num} *"X" {i} = {i*num})
            i = i + 1
        }
    fim
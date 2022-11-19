algoritmo EX3
    inteiro n
    real soma
    início
        soma = 0
        para(i=1, i<n){
            escreva("Digite o valor desejado")
            leia(n)

            se(n<=0){
                pare
            }
            soma += 1/i
        }
        escreva("S =" +soma)
    fim
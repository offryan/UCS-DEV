algoritmo EX6
    real positivo, negativo, menor, num
    início
        positivo = 0
        negativo = 0
        menor = 0
        flag = falso
        menor = 0

        enquanto(verdadeiro){
            escreva("Digite um número real: ")
            leia(num)
            se(flag == falso){
                menor = num
                flag = verdadeiro
            }
            se(num < menor){
                menor = num
            }
            se(num > 0){
                positivo += 1
            }
            se(num < 0){
                negativo += 1
            }senao{
                pare
            }
            escreva("Menor número digitado: " +menor)
            escreva("Menor número positivo: " +positivo)
            escreva("Menor número negativo: " +negativo)
        }
    fim
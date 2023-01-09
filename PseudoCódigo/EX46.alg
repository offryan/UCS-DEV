algoritmo EX5
    real media, maior, num
    início
        cont = 0
        maior = 0
        flag = falso
        enquanto(verdadeiro){
            escreva("Digite vários valores: ")
            leia(num)
            cont++
            se(flag == falso){
                maior = num
                flag = verdadeiro
            }
            se(num > maior){
                maior = num
            }
            media = num/cont
            escreva("O maior número foi: " +maior)
            escreva("A média dos valores digitados foi: " +media)
        }
    fim
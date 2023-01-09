algoritmo EX2
    inteiro i, maior
    início
        vet1[1..10]
        vet2[1..10]

        para (i = 1, i<=10){
            escreva("Digite o valor: ")
            leia(vet1[i])
        }
        maior = vet1[i]
        para (i=1, i<=10){
            se(vet[i] > maior){
                maior = vet1[i]
            } 
        }
        para (i=1, i<=10){
            vet2[i] = vet1[i]/maior
        }
        escreva("O maior vetor encontrado foi: "+maior)
        para (i=1, i<=10){
            escreva(vet2[i])
        }
    fim
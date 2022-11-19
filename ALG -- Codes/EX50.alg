algoritmo EX9
    inteiro idade, soma, cont
    caractere sexo
    real salario
    início
        soma = 0
        cont = 0
        enquanto(verdadeiro){
            escreva("Digite a idade da pessoa: ")
            leia(idade)
            se(idade <=0)
                pare
            senao
                soma += idade
                cont++
            escreva("Digite o sexo da pessoa (M/F)")
            leia(sexo)
            escreva("Digite o salário da pessoa")
            leia(salario)
            se(sexo == "m" ou sexo == "M"){
                somaSM += salario
                masc++
            }
        }
        escreva("Média de idade do grupo = " + (soma/cont))
        escreva("Média do salario = " + (soma/cont))
    fim
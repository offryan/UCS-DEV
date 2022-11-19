algoritmo EX8
    real notas, i, cont, media
    início
        cont = 0
        soma = 0
        para(i=0, i<80, i++){
            escreva("Digite a nota do aluno")
            leia(notas)
            se(notas >=6.0)
                cont++
        } 
        soma = notas + cont
        media = soma/cont
        escreva("A quantidade de alunos aprovados foi de: "+cont)
        escreva("A média de notas da turma foi de: "+media)
    fim
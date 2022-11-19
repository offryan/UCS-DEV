algoritmo EX2
    literal nome
    inteiro turno, hTrabalhadas, sal_B
    início
        escreva("Digite seu nome: ")
        leia(nome)

        escreva("Digite 1 - Para 1 Turno: ")
        leia(turno)

        escreva("Digite 2 - Para 2 Turno:  ")
        leia(turno)

        escreva("Digite 3 - Para 3 Turno:  ")
        leia(turno)

        escreva("Digite a quantidade de horas trabalhadas: ")
        leia(hTrabalhadas)

        se(turno==1){
            sal_B = 37,50 * hTrabalhadas
            escreva("O salário bruto é: " +sal_B)
            escreva("o nome do funcionário é: " +nome)
        }

        se(turno==2){
            sal_B = 37,50 * hTrabalhadas
            escreva("O salário bruto é: " +sal_B)
            escreva("o nome do funcionário é: " +nome) 
        }

        se(turno==3){
            sal_B = 45,00 * hTrabalhadas
            escreva("O salário bruto é: " +sal_B)
            escreva("o nome do funcionário é: " +nome) 
        }

        se(turno>3){
            escreva("Opção invalida")
        }
    fim
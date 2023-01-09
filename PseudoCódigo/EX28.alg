algoritmo EX5
    real salario, percentual
    início
        escreva("Digite o valor do salário do funcionário: R$ ")
        leia(salario)

        escreva("Digite o percentual: R$ ")
        leia(percentual)
    fim
void calculaAumento(real salario, real perc)
    real salarioF
    salarioF = salario + (salario*perc/100)
    escreva("Novo salário: R$ " +salarioF)
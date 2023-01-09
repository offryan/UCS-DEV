algoritmo EX1
    real salario, aumento
    inteiro cargo
    início
    escreva("Tabela de Cargos")
    escreva("1 - Escritório")
    escreva("2 - Secretário")
    escreva("3 - Caixa")
    escreva("4 - Gerente")
    escreva("5 - Diretor")

    escreva("Digite o número correspondente ao cargo do funcionário: ")
    leia(cargo)

    escolha cargo
    caso 1
        aumento = salario * 0.5
        escreva("O cargo escolhido foi: Escritório")

    caso 2
        aumento = salario * 0.35
        escreva("O cargo escolhido foi: Secretário")

    caso 3
        aumento = salario * 0.2
        escreva("O cargo escolhido foi: Caixa")

    caso 4
        aumento = salario * 0.10
        escreva("O cargo escolhido foi: Gerente")

    caso 5
        escreva("Não tem aumento")
        escreva("O cargo escolhido foi: Diretor")
    
    se(cargo >= 1 e cargo <=5){
        escreva("O novo salário é: " salario + aumento)
        escreva("O valor do aumento é: " +aumento)
    } 

    fim
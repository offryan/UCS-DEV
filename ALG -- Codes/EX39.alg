algoritmo EX3
    caractere dig
    inteiro val1, val2
    início
        escreva("Digite o primeiro número: ")
        leia(val1)

        escreva("Digite o segundo valor: ")
        leia(val2)

        escreva("Digite o caractere da operação que deseja(+, -, *, /")
        leia (dig)

        escolha dig

        caso +
            soma = val1 + val2
            escreva("A soma é: " +soma)
        
        caso -
            sub = val1 - val2
            escreva("A soma é: " +sub)

        caso *
            mult = val1 * val2
            escreva("A soma é: " +mult)

        caso /
            div = val1 / val2
            escreva("A soma é: " +div)

    fim
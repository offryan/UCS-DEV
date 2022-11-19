algoritmo EX5
    real a, b, c, x1, x2, delta
    início
        escreva("Digite o valor de A: ")
        leia(a)
        escreva("Digite o valor de B: ")
        leia(b)
        escreva("Digite o valor de C: ")
        leia(c)

        delta = b^^2 - 4*a*c
        leia(delta)
        x1 = -b + (delta^^2)/2*a
        leia(x1)
        x2 = -b - (delta^^2)/2*a
        leia(x2)
    fim
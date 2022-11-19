algoritmo EX4
    real h, r, volume, area
    constante PI = 3.14
    início
        escreva("Digite o raio do cilindro em cm: ")
        leia(r)
        escreva("Digite a altura do cilindro em cm: ")
        leia(h)
        area = PI * r^2
        volume = area * h
        escreva("A área da base é: " + area + "cm²")
        escreva("O volume do cilindro é: " + volume + "cm³")
    fim
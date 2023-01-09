algoritmo EX6
    real r, area 
    início
        escreva("Digite o raio do círculo: ")
        leia(r)

        area = calculaArea(r)
    fim
real calculaArea(real r)
    constante real PI = 3.14
    real area = PI * r^2
    retorne area
    fim

    
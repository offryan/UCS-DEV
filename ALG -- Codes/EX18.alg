algoritmo EX5
    real desloc, tempo
    início
        inteiro contador
        contador = 3
        enquanto(contador >= 1){
            escreva(contador)
            contador++
            escreva("Digite a distância percorrida: ")
            leia(desloc)

            escreva("Digite o tempo gasto: ")
            leia(tempo)
        }
    fim
void calculaDist(real desloc, real tempo)
    inicio
        retorne veloO = desloc/tempo
        escreva("A velocidade do objeto foi de: " +veloO+)
    fim
algoritmo name
    real bolsa, tempo
    início
        escreva ("Digite o valor da bolsa (R$): ")
        leia(bolsa)
        escreva ("Digite o tempo de estágio (anos): ")
        leia(tempo)
    se(bolsa >= 750.00 && bolsa <= 950.00) && (tempo >= 2){
        escreva("Participará do treinamento")
    }senao{
        escreva("Não participará")
    }

    fim
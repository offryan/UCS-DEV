algoritmo EX5
    inteiro idavolta
    início
        escreva("A viagem é apenas ida ou ida e volta(1-Ida, 2-Ida e volta")
        leia(idavolta)

        se(idavolta == 1 ou == 2){
            escolha idavolta
            caso 1
                escreva("Preços só de ida:")
                escreva("Região Norte: R$500,00")
                escreva("Região Norte: R$350,00")
                escreva("Região Norte: R$350,00")
                escreva("Região Norte: R$600,00")
            
            caso 2
                escreva("Preços ida e volta:")
                escreva("Região Norte: R$900,00")
                escreva("Região Norte: R$650,00")
                escreva("Região Norte: R$600,00")
                escreva("Região Norte: R$550,00")
        }
    fim
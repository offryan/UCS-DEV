algoritmo EX8
    inteiro alt_deg, alt_desj, qtde_de
    início
        escreva("Digite a altura do degrau: ")
        leia("alt_deg")
        
        escreva("Digite a altura que quer subir com a escada")
        leia("alt_desj")

        escreva("Para atingir a altura de ")
        escreva("alt_desj")

        escreva(" Serão necessários ")
        qtde_degraus <- 1+ inteiro(alt_desj/alt_deg)
        escreva("qtde_de")
        escreva(" degraus de ", alt_deg)
    fim
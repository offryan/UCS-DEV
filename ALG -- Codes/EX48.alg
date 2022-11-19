algoritmo EX7
    inteiro alt, masc, fem
    caractere sexo
    início
        masc = 0
        fem = 0
        contadorM = 0
        contadorF = 0

        enquanto(verdadeiro){
            escreva("Digite o sexo da pessoa: ")
            leia(sexo)
            escreva("Digite a altura da pessoa em m")
            leia(alt)

            se (altura==0): pare
            se (sexo == "mM"){
                masc += altura
                contadorM += 1
            }
            se(sexo == "fF"){
                fem += altura
                contadorF += 1
            }else{
                escreva("Sexo inválido")
            }
            mediaM = masc/contadorM
            mediaF= fem/contadorF

            escreva("A média de altura masculina é: " +masc)
            escreva("A média de altura feminina é: " +fem)
        }
    fim
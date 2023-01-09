algoritmo EX5
    real idade
    início
        escreva("Digite sua idade: ")
        leia(idade)

        se(idade < 16){
            escreva("Não eleitor")
        }
        se(idade > 18 e idade <65){
            escreva("Eleitor Obrigatório")
        }
        se(idade == 16 ou idade <=18 ou idade > 65){
            escreva("Eleitor não obrigatório")
        }
    fim
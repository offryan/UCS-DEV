algoritmo EX3
    inteiro data, dia, mes, ano
    início
        escreva("Digita a data sem barras ou espaços: ")
        leia(data)
        ano = data%10000
        mes = data/10000%100
        dia = data/10000/100
        escreva("Dia: " +dia)
        escreva("Mês: " +mes)
        escreva("Ano: " +ano)
    fim
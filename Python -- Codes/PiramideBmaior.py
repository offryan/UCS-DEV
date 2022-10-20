#1- Faça um programa em Python que calcule e mostre o valor do volume dotronco de uma pirâmide, para isso o programa deve solicitar ao usuário os valores da altura do tronco da pirâmide (h), o valor da base menor (Bmenor) e o da base maior (Bmaior) e calcular a seguinte expressão: volume = h/3*(Bmaior**2 + Bmenor**2 + (Bmaior**2 * Bmenor**2)**0.5)

print('Calculo da base de uma pirêmide')
h = int(input('Digite o valor da altura: '))
Bmenor = int(input('Digite o valor da base menor: '))
Bmaior = int(input('Digite o valor da base maior: '))

volume = h/3*(Bmaior**2 + Bmenor**2 + (Bmaior**2 * Bmenor**2)**0.5)
print('Volume de: ' , volume)

#2- Crie um programa em Python que solicite o valor em horas para o usuário, calcule e mostre o valor em minutos, sabendo que 1 hora tem 60 minutos.

print('Conversão de horas para minutos')
hr = int(input('Digite um valor em horas: '))

min = 60
mp = min * hr
print(mp, 'minutos')

#3- Crie um programa em Python que solicite ao usuário a sua idade expressa em anos, meses e dias (variáveis separadas). Calcule e mostre a idade expressa apenas em dias. Para isso considere 1 ano = 365 dias, 1 mês = 30 dias.

print('Conversão de anos, meses e dias para dias')
anos = int(input('Digite o valor em anos: '))
meses = int(input('Digite o valor em meses : '))
dia = int(input('Digite o valor em dias: '))

ano = 365 * anos
mes = meses * 30
idade = ano + mes + dia
print(idade , 'dias')

#4- Escreva um programa em Python para calcular o valor de uma prestação em atraso (prestacao). Para isso, obtenha o valor da prestação (valorPrestacao), a porcentagem de multa pelo atraso (multa) e a quantidade de dias de atraso (qtdeDias). Calcular e mostrar o valor da prestação atualizado, sabendo que: prestação = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)

print('Calculo da prestação em atraso')
valorPrestacao = int(input('Digite o valor da prestação: '))
qtdeDias = int(input('Digite a quantidade de dias: '))
multa = int(input('Digite a porcentagem da multa: '))

prestacao = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)
print('Multa igual a: ' , prestacao) 

#5- Faça uma programa em Python que peça do usuário um valor em graus para um ângulo. Converta-o para radianos e, usando funções da biblioteca math, imprima o seno, cosseno e tangente deste ângulo.

import math
angulo = int(input('Digite o valor em graus para um ângulo: '))
converte = math.radians (angulo)

print('Seno: ' , math.sin(angulo))
print('Cosseno: ' , math.cos(angulo))
print('Tangente: ' , math.tan(angulo))
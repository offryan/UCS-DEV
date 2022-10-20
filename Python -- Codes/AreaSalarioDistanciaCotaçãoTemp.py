#------------ Exercícios aula 1 ---------------------
#Part.1 ---------------------------------------------- 
print("Ciência da Computação - Unicsul")
#Part.2 ---------------------------------------------- 
profissao = input("Digite sua profissão: ")
print("Sua profissão é: ", profissao)
#Part.3 ---------------------------------------------- 
idade = input("Digite sua idade: ")
print("Sua idade é: ", idade)
#Part.4 ---------------------------------------------- 
sobrenome = input("Digite seu último sobrenome: ")
print("Fámilia: ", sobrenome)
#Part.5 ---------------------------------------------- 
esporte = input("Digite seu esporte favorito: ")
print("O esporte é: ", esporte)


#------------ Exercícios de Aplicação ----------------
#Part.1 ---------------------------------------------- 
base = float(input("Digite o valor da base: "))
altura = float(input("Digite a altura :"))
area = base * altura
print("A área mede : ", area , "cm")
perimetro = 2*(base + altura)
print("O perímetro é: ", perimetro)

#Part.2 ---------------------------------------------- 
s1 = float(input ("Digite seu atual salário: "))
s2 = s1 / 100
print('Valor original:     R$', s1)
print('Desconto ganho:     R$', s2 * 5)

#Part.3 ---------------------------------------------- (Finalizar)
c1 = float(input("Digite a distância em metros da 1° cidade: "))
c2 = float(input("Digite a distância em metros da 2° cidade: "))
vm = float(input("Digite a velocidade média: "))
distancia = c1 + c2
print("Distância de: ", distancia)
t = 60
vm = distancia / t
print("Velocidade média igual: ", vm)

#Part.4 ---------------------------------------------- (Finalizar)
print('Calculo de equação do 2° grau: ')
a = input('Primeiro valor: ')
b = input('Segundo valor: ')
c = input('Terceiro valor: ')
delta = b**2 - 4*a*c
print (delta) 

if delta > 0:
    x1 = -b + delta**0.5 / 2.0 * a
    x2 = -b - delta**0.5 / 2.0 * a
    print (x1 , x2)
else: 
    print ('Não pode ser calculado')
    
#Part.5 ---------------------------------------------- (Finalizar)
print("Conversão de dólar para reais")
dolar = float(input("Quantidade em dólares: US$ "))
cotacao = float(input ("Valor da cotação do dólar: R$ "))
conversao = dolar*cotacao
print('A quantidade de dólar convertido em real é: R$', conversao)

#Part.6 ---------------------------------------------- (Finalizar)

#Part.7 ----------------------------------------------
print("Conversor de Temperatura")
tC = float(input('Entre com a temperatura em graus Celsius: '))
tF = 1.8 * tC + 32
tK = tC + 273
print("Valor em Fahrenheit: " , tF)
print("Valor em Kelvin" , tK)


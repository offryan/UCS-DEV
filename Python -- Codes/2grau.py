#Escreva um programa em Python que obtenha uma temperatura em graus Celsius, calcule e mostre a respectiva temperatura nas escalas Fahrenheit e Kelvin. Utilize as fórmulas abaixo:

#print("Conversor de Temperatura")
#tC = float(input('Entre com a temperatura em graus Celsius: '))
#tF = 1.8 * tC + 32
#tK = tC + 273
#print("Valor em Fahrenheit: " , tF)
#print("Valor em Kelvin" , tK)


6 #Escreva um programa em Python que leia um valor representando o gasto realizado por um cliente do restaurante ComaBem e visualize o valor total a ser pago, considerando os 10% do garçom.

4 #Escreva um programa em Python que calcule as duas raízes de uma equação de 2º grau ax²+bx+c, conhecendo os valores dos coeficientes da mesma (a, b, c). Suponha que as raízes são reais. Lembre-se que para calcular as duas raízes:

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

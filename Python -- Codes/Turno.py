#1- Escreva um algoritmo que solicite um número ao usuário. Caso seja digitado um valor entre 0 e 9, mostre: “valor correto”, caso contrário mostre: “valor incorreto”.

num = int(input('Digite um valor de 1 á 9: '))

if num >=0 and num <=9:
    print('Valor correto')
else:    
    print('Valor incorreto')
    
#2- Crie um algoritmo que solicite ao usuário o seu turno de trabalho e a quantidade de horas trabalhadas, calcule e mostre o valor do salário. Considere os valores de horas a seguir, de acordo com o turno de trabalho. Caso o turno seja igual a ‘N’ (utilize um caractere para representar) o valor da hora trabalhada é R$ 45,00, caso contrário é R$ 37,50

turno = input('Digite seu turno de trabalho (N/D): ')
horas = int(input('Digite a quantidade de horas trabalhadas: '))

if turno == 'n' or turno == 'N':
    valor = 45
else:
    valor: 37.50

salario = valor * horas
print('Salário = R$: ' , salario)

#3- Faça um programa em Python que obtenha o valor de uma compra, calcular e mostrar o valor da compra considerando o desconto, conforme descrito abaixo: • para compras acima de R$ 200 a loja dá um desconto de 20% • para as abaixo disso não tem desconto, mostre o valor da compra.

valorCompra = float(input('Digite o valor da compra: '))

if valorCompra > 200:
    desconto = valorCompra*0.2
else:
    desconto = 0
print('Valor a pagar R$: ' , valorCompra-desconto)

#4- Escreva um programa em Python que solicite ao usuário os valores de três contas de consumo (p.ex. água, luz e telefone) e o valor de seu salário. Verifique se o salário é suficiente para pagar as três contas, caso não seja apresente a mensagem “Salário insuficiente!”. Caso seja, apresente o valor que restou do salário após pagar as contas.

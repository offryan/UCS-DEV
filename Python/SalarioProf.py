valorH = float(input('Digite o valor de horas por aula: '))
valorS = int(input('Digite a quantidade de semanas trabalhadas: '))


salarioB = valorH * valorS * 4.5
adicional = salarioB * 1/6
salarioF = salarioB + adicional
print(f'Salário Final: R$ {salarioF:.2f}')

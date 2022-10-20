salario = []
soma = 0
meses = []

for i in range(12):
    sal = float(input(f'Digite o sálario no mês {meses[i]}: '))
    #armazenar os salários
    salario.append(sal)
    print(salario)

for i in range(12):
    soma += salario[i]
decimo13 = soma/12
umTerco = decimo13/3
print(f'Décimo terceiro salário: R$: {decimo13}')
print(f'Um terço de férias: R$: ')



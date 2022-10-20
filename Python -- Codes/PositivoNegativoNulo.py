print('Verificador de números positivos e negativos ou nulos')

num = int(input('Digite um número (Positivo|Negativo|Nulo): '))

if num >= 1:
    print(f'Número positivo: {num}')
elif num <= 0:
    print(f'Número Negativo: {num}')
else:
    print(f'Número Nulo: {num}')
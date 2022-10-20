soma = 0
qtR = 0
qtB = 0
 
for i in range(10):
    idade = float(input(f'Digite a sua idade: '))
    op = int(input('Digite sua opinião sobre o filme:\n[1]Exelente\n[2]Bom\n[3]Regular\n'))
    
    soma += idade
    if idade > 40 and op == 3: qtR += 1
    if op == 2: qtB += 1
    
    media = soma/10
    
print(f'Média das idades: {media:.2f} anos')
print(f'Quantidade de pessoas maiores de 40 anos que responderam regular: {qtR}')
print(f'Quantidade de pessoas que responderam bom: {qtB}')
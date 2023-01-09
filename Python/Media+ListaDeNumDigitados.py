#Calcule e mostre a média de uma quantidade indeterminada de números que o usuário digitar. Use a lista e exiba no final os números digitados

lista = []
soma = 0

while True:
    n = int(input(f'Digite o número: (0 para sair)'))
    
    if n == 0: break
    else: lista.append(n)

for n in lista:
    soma += n
    
media = sum(lista)/len(lista)
print(f'Média: {media:.2f}')
print(f'Minha lista: {lista}')

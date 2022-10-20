nomes = []
notas = []
maior = 0
achei = -1

for i in range(4):
    nome = input('Digite um nome ')
    nomes.append(nome)
    nota = float(input(f'Digite a nota de: {nome}'))
    notas.append(notas)
    
posicao = float(input('Digite o índice que você quer exibir (0-4)'))    
print(nome[posicao])

for i in range(len(nota)):
    if nota[i] > maior:
        maior = notas[1]
        achei = 1
    else: break
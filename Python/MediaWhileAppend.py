notas = []

while True:
    nota = float(input('Digite a qiantidade de notas: (-1 para sair)'))
    if nota == -1: break
    else: notas.append(nota)
    
media = sum(notas)/len(notas)
print(f'A média é {media:.2f}')
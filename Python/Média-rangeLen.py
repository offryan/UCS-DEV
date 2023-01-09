notas = [6,7,6.5,4.8,8]
soma = 0

for i in range(len(notas)):
    soma += notas[i]
    
media = soma/len(notas)
print(f'A média é {media:.2f}')
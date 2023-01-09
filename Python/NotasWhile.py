contador = 0
while contador <= 10:
    
    nota1 = float(input(f'Digite a nota1 do {contador}° aluno:'))
    nota2 = float(input(f'Digite a nota2 do {contador}° aluno:'))
    media = (nota1+nota2)/2
    
    print(f'A média do {contador}° aluno é {media:.2f}')
    
    contador = contador + 1
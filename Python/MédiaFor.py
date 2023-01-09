nota1 = float(input('Digite a 1° nota: '))
nota2 = float(input('Digite a 2° nota: '))
nota3 = float(input('Digite a 3° nota: '))

media = (nota1+nota2+nota3)/3

print(f'A média do aluno é {media}')

#---------------------------------------------------------#

soma = 0

for i in range(3):
    
    nota = float(input(f'Digite a {i+1}° nota: '))
    soma = soma + nota
    media = soma/3

print(f'A média do aluno é {media}')
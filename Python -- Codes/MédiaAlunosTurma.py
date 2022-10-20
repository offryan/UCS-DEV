import math
soma = 0

turmas = int(input('Digite a quantidade de turmas: '))

#Alt Gr + chave (ª) #

for i in range(turmas):
    num = int(input(f'Digite a quantidade de alunos da {i+1}ª turma: '))
    soma += turmas

media = math.ceil(soma/turmas)
print(f'As turmas tem em média{media} alunos.')
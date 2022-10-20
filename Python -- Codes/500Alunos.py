eleitores = 0
nEleitores = 0
soma = 0


for i in range(500):
    idade = int(input(f'Digite a idade do aluno: '))
    
if idade >= 16:
    eleitores += 1
    
else:
    soma += idade
    nEleitores += 1
    
    media = soma/nEleitores



print(f'Quantidade de alunos que podem votar: {eleitores}.')
print(f'Idade média dos alunos não eleitores: {media} anos')
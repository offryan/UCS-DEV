nomes = []
salarios = []
gratificacoes = []

while True:
    nome = input("Digite o nome do funcionário <ENTER> sair: ").title()
    if nome == "": break
    salario = float(input(f"Digite o salário do {nome}: R$"))
    nomes.append(nome)
    salarios.append(salario)
    gratificacao = float(input(f"Digite a gratificação do {nome}: R$"))
    gratificacoes.append(gratificacao)
    if salario < 1000: gratificacoes.append(200)
    elif salario >= 1001 and salario <= 1500: gratificacoes.append(150) 
    elif salario >= 1501 and salario <= 2500: gratificacoes.append(100) 
    else: gratificacoes.append(50)

    salarios = salarios.replace(".", ",").replace("_", ".")
    gratificacoes = gratificacoes.replace(".", ",").replace("_", ".")

s = input("Digite um nome para pesquisar: ").title()

if s in nomes: 
    i = nomes.index(s)
    print(f"O funcionário {nomes[i]:_.2f} recebe R$ {salarios[i]:_.2f} e de gratificação R$ {gratificacoes[i]:_.2f}")
else:
    print(f"O funcionário {s} não existe")

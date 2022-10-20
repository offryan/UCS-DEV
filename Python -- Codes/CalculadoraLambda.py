print('Calculadora Lambda')

soma = lambda a,b: a+b
subtracao = lambda a,b: a-b
multiplicacao = lambda a,b: a*b
divisao = lambda a,b: a/b

print('[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[0]Sair')

while True:
    
    op = int(input('Digite a opção desejada: '))
    
    if op == 0:
        print('Adeus meu sócio')
        break
    
    elif str(op) not in '1234':
        print('Opção inválida!')
        
    else:
        a = float(input('Digite o 1º número: '))
        b = float(input('Digite o 2º número: '))
    
    if op == 1: print(soma(a,b))
    if op == 2: print(subtracao(a,b))
    if op == 3: print(multiplicacao(a,b))
    
    else: print(divisao(a,b))
    
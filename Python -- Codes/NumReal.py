positivo = 0
negativo = 0
menor = 0
flag = False

while True:
    
    num = float(input('Digite um número real (0 para sair)'))
    
    if flag == False:
        menor == num
        flag = True
        
    elif num < menor:
        
        menor = num
        
    if num > 0:
        positivo += 1
        
    elif num < 0:
        negativo += 1
        
    else: break
    
    print(f'Menor número digitado: {menor}')
    print(f'Quantidade de números positivos: {positivo}')
    print(f'Quantidade de números negativos: {negativo}')
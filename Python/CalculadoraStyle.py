num1 = int(input('Digite o primeiro número: '))
num2 = int(input('Digite o segundo número: '))


print('[1]: Média;')
print('[2]: Diferença;')
print('[3]: Produto;')
print('[4]: Divisão.')

escolha = int(input('Agora escolha uma opção: [1].[2].[3].[4] '))

if escolha not in (1, 2 , 3, 4):
    print('Escolha inválida')
if escolha == 1:
        result = (num1+num2)/2
        print(f'Resposta é: {result}')

elif escolha == 2:
    result =  num1 - num2
    print(f'Resposta é: {result}')

elif escolha == 3:
    result = num1 * num2
    print(f'Resposta é: {result}')

elif escolha == 4:

    if escolha == 0:
        print('Impossível dividir por 0')
    else:
            result = num1/num2
            print(f'Resposta é: {result}')
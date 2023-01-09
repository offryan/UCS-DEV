



import trigonometria

catO = float(input('Digite o valor do cateto oposto: '))

catA = float(input('Digite o valor do cateto adjacente: '))

print('O seno é: %.2f'%trigonometria.seno(catO,catA))
print('O cosseno é: %.2f'%trigonometria.cosseno(catO,catA))
print('A tangente é: %.2f'%trigonometria.tangente(catO,catA))

import trigonometria

catO = float(input('Digite o valor do cateto oposto: '))

catA = float(input('Digite o valor do cateto adjacente: '))

print(f'seno = ' , {trigonometria.seno(catO,catA)})
print(f'cosseno = ' , {trigonometria.cosseno(catO,catA)})
print(f'tangente = ' , {trigonometria.tangente(catO,catA)})

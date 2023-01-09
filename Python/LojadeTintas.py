print('Loja de tintas')

import math

areaP = int(input("Digite o valor em m² da area pintada: "))
qTinta = areaP / 3
qLatas = qTinta / 18
qLatas = math.ceil(qLatas)

print(f'Quantidade de Latas a comprar: {qLatas}')
print(f'Valor das latas: {qLatas*80}')
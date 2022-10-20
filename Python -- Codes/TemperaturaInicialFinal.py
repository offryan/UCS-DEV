tempInicial = float(input('Digite a temperatura inicial em °C: '))
tempFinal = float(input('Digite a temperatura final em °C: '))

tC = tempFinal - tempInicial
tF = tC * 1.8

print(f'Variação da temperatura em °C {tC}')
print(f'Variação da temperatura em °C {tF}')
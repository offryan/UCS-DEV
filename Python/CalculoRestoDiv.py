conta = input('Digite a conta com 4 algarismos: ')
soma = 0

for d in conta:
    soma += int(d)

dig = conta % 10

print(dig)
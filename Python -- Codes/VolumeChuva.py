volume = []
dias = []
soma = 0
for i in range(10):
    dia = input("Digite o dia da semana (seg|ter|qua|qui|sex|sab|dom): ")
    vol = float(input('Digite o volume de chuva no dia em m³: '))
    dias.append(dia)
    volume.append(vol)
    soma += volume

sQuarta = 0
n = 0
for i in range(10):
    if dias[i] == "qua":
        sQuarta += volume[i]
        n +=1
media = sQuarta/n
print(f"Volume total = {soma} m³")
print(f"Volume médio na quarta-feira é: {media}")
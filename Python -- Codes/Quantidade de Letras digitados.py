palavra = input("Digite uma palavra: ").upper()
temp = ""

for letra in palavra:
    if letra in temp: continue #Verifica se a letra já foi contada
    n = palavra.count(letra)
    print(f"{letra} - {n}")
    temp = temp + letra #Armazena a letra contada na variável temp
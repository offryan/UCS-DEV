nome = input("Qual o seu nome?: ")
hora = int(input("Que horas são? [0-23]: "))

if hora not in range (23):
    print("Hora inválida")

elif hora >=5 and hora <=12:
    print(f"Bom dia {nome}")
elif hora >=13 and hora <=18:
    print(f"Boa tarde {nome}")
else:
    print(f"Boa noite {nome}")
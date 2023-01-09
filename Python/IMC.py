nome = input("Digite seu nome:")
peso = float(input("Digite seu peso em Kg:"))
altura = float(input("Digite seu altura em metros:"))

IMC = peso/(altura **2)

if IMC <= 20:
    resultado = ("Abaixo do peso")  
elif IMC <25:
    resultado = ("Peso normal")
elif IMC <30:
    resultado = ("Sobrepeso")
elif IMC <40:
    resultado = ("Obeso")
else:
    resultado = ("Obeso Mórbido")
    
print(f"{nome} o valor do seu IMC é {IMC:.2f} que te coloca na categoria: {resultado}")

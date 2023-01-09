n1 = int(input("Digite o primeiro número:"))
n2 = int(input("Digite o segundo número:"))
n3 = int(input("Digite o terceiro número:"))

if n1>n2 and n1>n3:
    print("Número 1 é o maior")
elif n2>n1 and n2>n3:
    print("Número 2 é o maior")
else:
    print("O terceiro é maior")
    
v1 = float(input ("Digite o primeiro número: "))
v2 = float(input ("Digite o segundo número: "))
operador = (input("Digite qual tipo de conta deseja fazer (+ - * /): "))

if operador not in "+ - * /":
    print("Operador não suportado")

elif operador == "+":
    soma =  v1 + v2
    print(f"{v1} + {v2} = {soma}")
elif operador == "-":
    subtracao = v1 - v2
    print(f"{v1} - {v2} = {subtracao}")
elif operador == "*":
    multiplicacao = v1 * v2
    print(f"{v1} * {v2} = {multiplicacao}")
elif operador == "/":
    divisao = v1 / v2
    print(f"{v1} / {v2} = {divisao}")
    resto = v1 % v2
    print(f"{v1} % {v2} = {resto}")
    print(f"O resto da divisão de {v1} por {v2} é {resto}")
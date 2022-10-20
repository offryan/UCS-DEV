print("Digite cordenadas de um ponto P(x, y)")
x= float(input("Digite a coordernada x: "))
y= float(input("Digite a coordernada y: "))

if x >0 and y >0:
    print(f"O ponto P({x}, {y}) pertence ao 1º Quadrante")
elif x <0 and y >0:
    print(f"O ponto P({x}, {y}) pertence ao 2º Quadrante")
elif x <0 and y <0:
    print(f"O ponto P({x}, {y}) pertence ao 3º Quadrante")
elif x >0 and y <0:
    print(f"O ponto P({x}, {y}) pertence ao 4º Quadrante")
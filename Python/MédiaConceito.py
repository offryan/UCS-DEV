nnotaP1 = float(input("Digite a primeira nota parcial: "))
notaP2 = float(input("Digite a segunda nota parcial: "))

media = (notaP1 + notaP2) /2

if media >= 9:
    print("Conceito: A\nMensagem: Aprovado") 
elif media >= 7.5:
    print("Conceito: B\nMensagem: Aprovado")
elif media >= 6.0:
    print("Conceito: C\nMensagem: Aprovado")
elif media >=4.0:
    print("Conceito: D\nMensagem: Reprovado")
else:
    print("Conceito: E\nMensagem: Reprovado")

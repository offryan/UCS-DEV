print("\nCurso: Ciência da Computação")
print("\nCampus: São Miguel Paulista")

print("Ryan Gomes dos Santos")

print("\nCalculadora para base 10(Decimal)")

print("[1]: Binário para decimal")
print("[2]: Octal para decimal")
print("[3]: Hexadecimal para decimal")
print("[0]: Sair")
decimal=0
opcao=int(input('Digite uma opção: '))
if opcao==0:
     print("Você selecionou sair!")
else:
    num=input('Digite o número a ser convertido:')
if opcao== 1:
    n = len(num)-1
    for d in num:
        decimal = decimal+int(d)*2**n
        n = n-1
    print(f'O número {num} é {decimal} em decimal')
elif opcao==2:
    n = len(num)-1
    for d in num:
        decimal = decimal+int(d)*8**n
        n = n-1
    print(f'O número {num} é {decimal} em decimal')
elif opcao==3:
    t=[X for X in num]
    n=len(t)-1 
    HEXA=0 
    for i in range(len(t)):
        if t[i]== "A" or t[i]== "a":
            t[i]=10
        elif t[i]== "B" or t[i]== "b":
            t[i]=11
        elif t[i]== "C" or t[i]== "c":
            t[i]=12
        elif t[i]== "D" or t[i]== "d":
             t[i]=13
        elif t[i]== "E" or t[i]== "e":
            t[i]=14
        elif t[i]== "F" or t[i]== "f":
            t[i]=15
        else:
            t[i]=int(t[i])
        add=t[i]*(16**n)
        decimal+=add
        n-=1
    print(f'O número {num} é {decimal} em decimal')


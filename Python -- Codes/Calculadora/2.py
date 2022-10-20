print("\nCurso: Ciência da Computação")
print("\nCampus: São Miguel Paulista")
print("\nIntegrantes do grupo:")

print("Ryan Gomes dos Santos")

print("\nCalculadora para base 10(Decimal)")

print("[1]: Decimal para Binário")
print("[2]: Decimal para Octal")
print("[3]: Decimal para Hexadecimal")
print("[4]: Sobre o sistema")
print("[0]: Sair")

esc = int(input("Escolha a operação: "))

if esc == 0:
     print("Você selecionou sair!")
else:
    conv = int(input("Digite o valor em Decimal que deseja ser convertido: "))
if esc == 1:
    bin = ''
    while conv !=0:
        r = conv%2
        bin = str(r) + bin 
        conv = conv//2
    print(bin)
elif esc == 2: 
    r = []
    while conv > 0:
        r.append(conv % 8)
        conv = conv // 8
    for i in range(len(r)-1,-1,-1):
        print("%X"%r[i],end="")
elif esc == 3:
    r = []
    while conv > 0:
        r.append(conv % 16)
        conv = conv // 16
    for i in range(len(r)-1,-1,-1):
        print("%X"%r[i],end="")
elif esc == 4:
    print("O programa desenvolvido executa calculos de convesão de bases utilizando a linguagem de programação Python")

else:
    conv = int(input("Digite o valor em Decimal que deseja ser convertido: "))

freq = int(input("Digite sua frequência:"))
media = int(input("Digite sua média:"))

#Aprovado freq >=75 e media >=6
if freq<75:
    print("Reprovado por falta")
else:
    if media <6:
        print("Reprovado por nota")
    else:
        print("Aprovado")
        

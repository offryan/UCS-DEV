cod = input("Digite o código da hospedagem (S|D|T):")
diarias = int(input("Digite a quantidade de diárias:"))

if cod not in "SsDdTt":
    print("Tipo de diária inválido")
else:
    diarias = int(input("Digite a quantidade de diárias"))
    valor = 255.50
if cod in "Ss":
    valor = 255.5
elif cod in "Dd":
    valor = 305.50
elif cod in "Tt":
    valor = 360.50
else: 
    valor = 360.50
print(f"Valor a pagar: R$ {diarias*valor}")
    
            
         
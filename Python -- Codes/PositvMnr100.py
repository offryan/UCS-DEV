cont1= 0
cont2= 0
cont3= 0
cont4= 0
num = 0

while True:
    
    num = int(input('Digite um número inteiro entre 0 e 100: '))

    if num >= 0 and num <=25: cont1 += 1

    elif num <= 50: cont2 += 1
    elif num <= 75: cont3 += 1
    elif num <= 100: cont4 += 1
    
    else: 
        break

print(f'[0-25]')
print(f'[26-49]')
print(f'[50-74]')
print(f'[75-100]')
import math

a = float('Digite o coeficiente a:')
b = float('Digite o coeficiente b:')
c = float('Digite o coeficiente c:')

if a == 0:
    print('não é uma equação de 2° grau')
else:
    delta = b**2 - 4*a*b
    if delta < 0:
        print('Não há raizes reais')
    elif delta == 0:
        x = (-b + math.sqrt(delta))/2*a
        print(f'x1 = x2 = {x}')
    else:
        x1 = (-b + math.sqrt(delta))/2*a
        x2 = (-b + math.sqrt(delta))/2*a
        print(f'x1 = {x1}\nx2 = {x2}')
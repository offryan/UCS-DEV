import math 

raio = float(input('Digite o raio da circunferência em cm: '))
area = math.pi * raio**2
comprimento = 2 * math.pi

print(f'Área = {area:.2f} cm')
print(f'Comprimento = {comprimento:.2f} cm')
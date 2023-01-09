from cmath import tan
import math

angulo = math.radians(float(input('Digite o comprimento :')))
tS = float(input('Digite o tamanho da sombra em metros :'))
h = tS * math.tan(angulo)
print('Altura igual %.2f m' % (h))
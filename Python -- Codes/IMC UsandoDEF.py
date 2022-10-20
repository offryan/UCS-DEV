


def imc(p, h):
    res = p / h**2
    return(res)
    
    
p = float(input('Digite o peso em Kg: '))
h = float(input('Digite a altura em metros: '))
print('O IMC é: ', imc(p,h), 'Kg/m')


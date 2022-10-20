bin = input('Digite um número Binário: ')

n = len(bin) - 1 #\ Exemplo '1010' tem (4) caracteres n = 4-1 = 3 /#

decimal = 0

for d in bin:
    decimal - decimal + int(d)*2**n
    n = n - 1
    
print(f'O binário {bin} é igual a {decimal} na base 10')
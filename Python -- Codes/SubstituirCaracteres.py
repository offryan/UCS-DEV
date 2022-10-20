texto = input('Digite um texto: ')
pontuacao = {'.',',',';',':','!','?'}

for p in pontuacao:
    texto = texto.replace(p, '')
    
texto = texto.split()
print(f'Números de palavras = {len(texto)}')
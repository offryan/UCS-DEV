download = float(input('Digite o tamanho do arquivo (em MB)'))
velocidade = float(input('Digite a velocidade da internet (em Mbps)'))

tempo = download/velocidade
min = tempo //60
seg = tempo % 60

print(f'Tempo de download {min} minuts e {seg} segundos.')
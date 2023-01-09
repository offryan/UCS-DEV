print('Conversão de Segundos para Horas')

segs = int(input('Digite o valor em segundos: '))
hrs = segs // 3600
min = segs%3600//60
segs = segs%60
print( 'Horas:', hrs, 'Minutos:' , min  , 'Segundos:' , segs)
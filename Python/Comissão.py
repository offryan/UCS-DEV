#Entrada

salario = float(input('Digite o salário fixo R$: '))
vendas = float(input('Digite o valor das vendas R$: '))

#Processamento
comissao = vendas * 0.04
salario += comissao

print(f'Comissão: R$ {comissao:.2f}')
print(f'Salário Final: R$ {salario:.2f}')
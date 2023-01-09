nota1 = float(input("Digite a primeira nota:"))
nota2 = float(input("Digite a segunda nota:"))
frequencia = float(input("Digite sua frequência:"))

media = (nota1+nota2)/2
    
resultado = "APROVADO" if media >= 6 and frequencia >=75 else "REPROVADO" 

print(f"A situação do aluno é: {resultado} com média de {media:.2f}")


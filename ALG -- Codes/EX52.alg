algoritmo name
    inteiro i, maisVedido, quant[10]
    real valorTotal, valorParcial, valor[10]

    início
    maisVedido = 0
    valorTotal = 0
    para(i = 0; i < 10; i++){
        escreva("Digite valor unitario e quantidade vendida: ");
        leia(valor[i], quant[i]);
    }


    para(i = 0; i < 10; i++){
        valorParcial = quant[i] * valor[i];
        printf("Vendido: Valor unitario R$ Valor total R$", quant[i], valor[i], valorParcial);
        valorTotal += valorParcial;
    }
    escreva("Valor Total das vendas R$", valorTotal);
    escreva("Comissao paga ao vendedor R$", valorTotal * 0.05);

    
    para(i = 0; i < 10; i++){
        se(quant[i] > maisVedido)
            maisVedido = quant[i];
    }

    para(i = 0; i < 10; i++){
        se(quant[i] == maisVedido){
            escreva("Posicao: Valor R$", i, valor[i]);
        }
    }

    retorne 0;

    fim

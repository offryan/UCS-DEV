/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurosempilhados;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class JurosEmpilhados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input  = new Scanner(System.in);
    double valor_parcela, valor_compra, valor_final, juros;
    int qtde_parcelas;
        
    System.out.printf("Digite o valor da compra: ");
    valor_compra = input.nextDouble();
    System.out.printf("Digite a quantidade de parcelas: ");
    qtde_parcelas = input.nextInt();     
    
    switch (qtde_parcelas){
        case 1:
            juros = 0;
            break;
        case 2:
        case 4:
        case 6:
        case 12:
            juros = 18;
            break;
        case 24:
            juros = 26;
            break;
        default:
            juros = -1;
                  
    }
    if (juros == -1){
        System.out.printf("Quantidade de parcelas incorreta! \n");
    }
    else {
        valor_final = valor_compra + valor_compra * juros / 100;
        valor_parcela = valor_final / qtde_parcelas;
        System.out.printf("O valor da parcela eh: %.2f \n", valor_parcela);
    }
    }
    
}

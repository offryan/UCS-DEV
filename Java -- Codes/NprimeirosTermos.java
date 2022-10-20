/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programanprimeirostermos;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaNprimeirosTermos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, num, aux, cont;
        
        System.out.printf("Digite o número de termos da sequêcia");
        num = input.nextInt();
        a = 1;
        b = aux = 2;
        System.out.printf("%d \t",a);
        
        for (cont = 0; cont < num-1; cont++) {
            System.out.printf("%d \t", aux);
            aux = a * b;
            a = b;
            b = aux;
        }
    }
    
}

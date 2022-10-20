/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaaumentocomprintf;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaAumentoComPrintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sal, novosal;
        
        System.out.printf("Digite seu salário: ");
        sal = input.nextFloat();
        
        if (sal < 500) {
            novosal = sal * 1.15 ;
        }
        else if (sal <= 1000){
            novosal = sal * 1.1;
        }
        else {
            novosal = sal * 1.05;
        }
        
        System.out.printf("O novo salário é: %.2f \n", novosal);
        
    }
    
}

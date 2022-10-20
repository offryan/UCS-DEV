/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaacumuladorcomwhile;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaAcumuladorComWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num, acc;
        num = 0 ;
        acc = 0;
        
        do {
            System.out.printf("Digite um número: ");
            num = input.nextInt();
            acc = acc + num;
        } while (num != 0);
        System.out.printf("Total acumulador: %d \n", acc);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaentre50e100comprintf;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaEntre50e100ComPrintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, res;
        
        System.out.printf("Digite um valor para a: ");
        a = input.nextInt();
        System.out.printf("Digite um valor para b: ");
        b = input.nextInt();
        
        res = a * b;
        
        if (res >= 50 && res <= 100) {
            System.out.printf("O resultado é: %d", res);
        }
    }
    
}

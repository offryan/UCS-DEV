/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadecrescentefor;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaDecrescenteFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont;
        Scanner input = new Scanner(System.in);
        for (cont = 10; cont >= 1; cont--) {
            
            System.out.printf("Contador: %d \n", cont);
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacontadorsimples;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaContadorSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cont;
        
        cont = 0;
        while (cont < 10) {
            System.out.printf("Contador: %d \n", cont);
            cont = cont + 1;
                 
        }
    }
    
}

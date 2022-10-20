/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuadacomfor;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class TabuadaComFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cont, tab, res;
        
        System.out.printf("Digite a tabuada: ");
        tab = input.nextInt();
        
        for (cont = 1; cont <= 10; cont++){
            res = cont * tab;
            System.out.printf("%d x %d = %d \n", tab, cont, res);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidadecomprintf;
import java.util.Scanner;
/**
 *
 * @author valvu
 */
public class ProgramaIdadeComPrintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.printf ("Digite sua idade: ");
        idade = input.nextInt();
        
        if (idade >= 18){
            System.out.printf("Você é de maior ");
        }
        else{
            System.out.printf("Você é de menor! ");
        }
        
    }
    
}

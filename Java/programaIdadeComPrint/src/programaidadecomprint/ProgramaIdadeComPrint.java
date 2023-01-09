/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidadecomprint;
import java.util.Scanner;

/**
 *
 * @offryan
 */
public class ProgramaIdadeComPrint {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.printf("Digite sua idade: ");
        idade = input.nextInt();
        
        if (idade >= 18) {
            System.out.printf("Você é de maior");
        }

        else{
            System.out.printf("Você é de menor!");
    }
  }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog_vetor3;
import java.util.Scanner;

public class Prog_vetor3 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
       int cb [] = new int [10];
       int i;

       for(i = 1; i <= 9; i += 2){
       System.out.printf("Digite um valor a posição %d do vetor CB: ", i);
       cb[1] = input.nextInt() * 2;
    }
       for(i = 1; i <= 9; i += 2){
       System.out.printf("Digite um valor a posição %d do vetor CB: ", i);
       cb[1] = input.nextInt() + 9;
    }

       for(i = 1; i <= 9; i++){
       System.out.printf("Valor na posição %d do vetor CB: %d \n ", i, cb[i]);
    }
  }    
}

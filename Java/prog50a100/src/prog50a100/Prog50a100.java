/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog50a100;
import java.util.Scanner;

/**
 *
 * @offryan
 */
public class Prog50a100 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a, b , res;

        System.out.printf("Digite o 1° valor: ");
        a = input.nextInt();

        System.out.printf("Digite o 2° valor: ");
        b = input.nextInt();

        res = a * b;

        if (res >= 50 && res <= 100){
            System.out.printf("O resultado é: %d", res);
        }

        else{
            System.out.printf("O valor não está entre 50 e 100!!!");
    }
  }
}
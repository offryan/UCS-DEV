/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa50a100;
import java.util.Scanner;

public class programa50a100 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b ,res;
        System.out.printf("Digite o valor para A: ");
        a = input.nextInt();

        System.out.printf("Digite o valor para B: ");
        b = input.nextInt();

        res = a + b;

        if (res >= 10){
            System.out.printf("O resultado é: %d", res);
    }
  }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog_vetor2;

import java.util.Scanner;

public class Prog_vetor2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a [] = new int[8];
        int b [] = new int[8];
        int i;

        for (i = 0; i <= 7; i++) {
            System.out.printf("Posição %d de a: ", i);
            a[i] = input.nextInt();
        }

        for (i = 0; i <= 7; i++){
            b[i] = a[i] * 3;   
        }

        for (i = 0; i <= 7; i++){
            System.out.printf("Posição %d de b: %d \n", i, b[i]);   
        }
    }
}

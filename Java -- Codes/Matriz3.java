/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3;

import java.util.Scanner;

/**
 *
 * @author OFFRyan
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int a[][] = new int[3][2];
        int b[][] = new int[3][2];
        int c[][] = new int[3][2];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para linha %d, da coluna %d da matriz: ", i, j);
                a[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para linha %d, da coluna %d da matriz: ", i, j);
                b[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("%d \t", c[i][j]);
            }
            System.out.printf("\n");
        }
    }
}

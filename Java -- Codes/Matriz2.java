/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author logon
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in).reset();
        int mat[][] = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para linha %d, da coluna %d da matriz: ", i, j);
                mat[i][j] = ler.nextInt();
            }
        }
        System.out.printf("A minha matriz é: \n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf(" O valor da linha %d, coluna %d da matriz é: %d \n", i, j, mat[i][j]);
            }
        }
    }
}

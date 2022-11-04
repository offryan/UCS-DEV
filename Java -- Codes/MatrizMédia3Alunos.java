/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizmédia3alunos;
import java.util.Scanner;

/**
 *
 * @author logon
 */
public class MatrizMédia3Alunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner entrada = new Scanner(System.in);
    double notas[][] = new double [4][4];
    int i, j;

    for(i = 0; i < 3; i++){
    
        for (j = 0; j < 4; j++){
            System.out.printf("Digite a nota %d para o aluno %d: ", i+1, j+1);
            notas[i][j] = entrada.nextDouble();
        }

        for (j = 0; j < 4; j++){
            notas[i][j] = (notas[2][j] + notas[1][j] + notas[0][j]/3);
        }

        for(i = 0; i < 3; i++){
            for (j = 0; j < 4; j++){
                notas[i][j] = (notas[2][j] + notas[i][j] + notas[0][j]/3);
                System.out.printf("%.2f \t", notas[i][j]);
            }
        System.out.printf("\n");
      }
    }
  }
}

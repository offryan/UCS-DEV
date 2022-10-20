/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog_vertor1;

import java.util.Scanner;


/**
 *
 * @author logon
 */
public class Prog_vertor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
          Scanner input = new Scanner(System.in);
          int vet[] = new int[5];
          int i;

          for (i = 0; i <= 4; i++) {
              System.out.printf("Digite um valor para a posição %d do  vetor: ", i);
              vet[i] = input.nextInt();
          }
          for (i = 0; i <= 4; i++) {
              System.out.printf("Valor para a posição %d do vetor VET: ", i, vet[i]);
          }
      }
}


package prog_vertor1;

import java.util.Scanner;

public class Prog_vertor1 {

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


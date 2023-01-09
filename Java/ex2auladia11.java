package ex2auladia11;
import java.util.Scanner;

public class ex2auladia11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int k [] = new int [5];
        int v [] = new int [5];
        int z [] = new int [10];
        int i;

        for (i = 0; i < 5; i++){
            System.out.printf("Digite o valor para a posição %d do vetor k: ", i);
            k[i] = entrada.nextInt();
            z[i] = k[i] - 2;
        }
        for (i = 0; i < 5; i++){ 
            System.out.printf("Digite o valor para a posição %d do vetor v: ", i);
            v[i] = entrada.nextInt();
            z[i + 5] = v[i] + 3;
        }
        for (i = 0; i < 10; i++){
            System.out.printf("%d \t ", z[i]);
        }
    }
}

package ex3auladia11;
import java.util.Scanner;

public class ex3auladia11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int h[] = new int [10];
        int i, aux;

        for (i = 0; i < 10; i++){
            System.out.printf("Digite um valor para a posição %d do vetor h: ", i);
            h[i] = entrada.nextInt();
        }
        for (i = 0; i < 9; i++){ 
            if (h[i] > h[i + 1]){
                aux = h[i];
                h[i] = h[i + 1];
                h[i + 1] = aux;
            }
            
        }
        
    }
}

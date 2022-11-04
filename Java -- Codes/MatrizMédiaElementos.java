package matrizmédiaelementos;
import java.util.Scanner;

public class MatrizMédiaElementos {

public static void main(String[] args) {
        

    Scanner entrada = new Scanner(System.in);
    double numeros[][] = new double [5][5];
    double media, soma = 0;
    int i, j;

    for(i = 0; i < 5; i++){
        for (j = 0; j < 5; j++){
            System.out.printf("Digite o valor para a linha %d, coluna %d da matriz", i, j);
            numeros[i][j] = entrada.nextDouble();
        }
        System.out.printf("\n");
    }

    for(i = 0; i < 5; i++){
        for (j = 0; j < 5; j++){
            System.out.printf("%2.f \t", numeros[i][j]);
        }
        System.out.printf("\n");
    }

    for (i = 2; i < 5; i++){
        soma = soma + numeros[i][1];
        }

    for (i = 3; i < 5; i++){
        soma = soma + numeros[i][2];
    }

    soma = soma + numeros [4][3];
    media = soma / 6;

    System.out.printf("Média dos elementos %.2f", media);

    }
}
  


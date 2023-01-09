package programawhile_media;

import java.util.Scanner;

public class ProgramaWhile_Media {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        int contador;
        contador = 1;

        while (contador <= 10) {

            System.out.printf("Digite a 1° nota: ");
            nota1 = input.nextDouble();

            System.out.printf("Digite a 2° nota: ");
            nota2 = input.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.printf("A sua média é: %.2f \n", media);

            contador = contador + 1;


        }
    }   
}

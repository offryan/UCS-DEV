package programacontadorsimples;

import java.util.Scanner;

public class ProgramaContadorSimples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador;

        contador = 0;

        while (contador < 10) {
            System.out.printf("Contador: %d \n", contador);
            contador = contador + 2;

        }
    }
}

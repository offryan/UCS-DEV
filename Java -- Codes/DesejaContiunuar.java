package programadesejacontiunuar;
import java.util.Scanner;

public class ProgramaDesejaContiunuar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int acumulador;
        char resposta;

        acumulador = 0;
        resposta = 's';

        while (resposta == 's' || resposta == 'S') {
            System.out.printf("Deseja Contiunuar? s/n \n");
            resposta = input.next().charAt(0);

            System.out.printf("Acumulador: %d \n", acumulador);
            acumulador = acumulador + 1;
        }
    }
}

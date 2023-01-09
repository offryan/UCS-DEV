package programadesejacontinuar_comdo;
import java.util.Scanner;

public class ProgramaDesejaContinuar_ComDo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int acumulador;
        char resposta;
        
        acumulador = 0;
        resposta = 's';
        
        do {
            System.out.printf("Deseja continuar? s/n \n");
            resposta = input.next().charAt(0);
            System.out.printf("Acumulador: %d \n", acumulador);
            acumulador = acumulador + 1;
          
        } while (resposta == 's' || resposta == 'S');
    }
    
}

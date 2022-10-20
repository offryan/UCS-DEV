
package programaacumuladorcomwhile;
import java.util.Scanner;

public class ProgramaAcumuladorComWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num, acc;
        num = 0 ;
        acc = 0;
        
        do {
            System.out.printf("Digite um número: ");
            num = input.nextInt();
            acc = acc + num;
        } while (num != 0);
        System.out.printf("Total acumulador: %d \n", acc);
    }
    
}

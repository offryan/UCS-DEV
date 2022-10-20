package programanprimeirostermos;
import java.util.Scanner;

public class ProgramaNprimeirosTermos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, num, aux, cont;
        
        System.out.printf("Digite o número de termos da sequêcia");
        num = input.nextInt();
        a = 1;
        b = aux = 2;
        System.out.printf("%d \t",a);
        
        for (cont = 0; cont < num-1; cont++) {
            System.out.printf("%d \t", aux);
            aux = a * b;
            a = b;
            b = aux;
        }
    }
    
}

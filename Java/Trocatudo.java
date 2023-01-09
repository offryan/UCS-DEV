package programatrocatudo;
import java.util.Scanner;

public class ProgramaTrocatudo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a, b;

        System.out.printf("Digite o primeiro valor: ");
        a = input.nextInt();

        System.out.printf("Digite o segundo valor: ");
        b = input.nextInt();

        System.out.println("Valores Reais");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b ^ (b = a);

        System.out.println("Valores Trocados");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close(); //input close usado para apagar o sublinhado de possível erro, mesmo que o código funcione

        //println foi usado para facilitar a formatação por linhas

    }
    
}

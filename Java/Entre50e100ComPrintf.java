package programaentre50e100comprintf;
import java.util.Scanner;

public class ProgramaEntre50e100ComPrintf {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, res;
        
        System.out.printf("Digite um valor para a: ");
        a = input.nextInt();
        System.out.printf("Digite um valor para b: ");
        b = input.nextInt();
        
        res = a * b;
        
        if (res >= 50 && res <= 100) {
            System.out.printf("O resultado é: %d", res);
        }
    }
    
}

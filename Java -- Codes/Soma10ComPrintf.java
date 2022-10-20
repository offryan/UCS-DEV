
package programasoma10comprintf;
import java.util.Scanner;

public class ProgramaSoma10ComPrintf {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, res;
        
        System.out.printf("Digite um valor para A: ");
        a = input.nextInt();
        System.out.printf("Digite um valor para B: ");
        b = input.nextInt();
        
        res = a + b;
        
        if (res >= 10) {
            System.out.printf("O resultado é: %d", res);
        }
        
    }
    
}

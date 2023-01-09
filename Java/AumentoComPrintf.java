
package programaaumentocomprintf;
import java.util.Scanner;

public class ProgramaAumentoComPrintf {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sal, novosal;
        
        System.out.printf("Digite seu salário: ");
        sal = input.nextFloat();
        
        if (sal < 500) {
            novosal = sal * 1.15 ;
        }
        else if (sal <= 1000){
            novosal = sal * 1.1;
        }
        else {
            novosal = sal * 1.05;
        }
        
        System.out.printf("O novo salário é: %.2f \n", novosal);
        
    }
    
}

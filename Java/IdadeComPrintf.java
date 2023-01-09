package programaidadecomprintf;
import java.util.Scanner;

public class ProgramaIdadeComPrintf {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.printf ("Digite sua idade: ");
        idade = input.nextInt();
        
        if (idade >= 18){
            System.out.printf("Você é de maior ");
        }
        else{
            System.out.printf("Você é de menor! ");
        }
        
    }
    
}

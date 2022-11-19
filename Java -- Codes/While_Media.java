package programawhile_media;
import java.util.Scanner;

public class ProgramaWhile_Media {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        int cont = 1;        
        
        while (cont <= 10){
            System.out.printf("Digite a primeira nota: ");
            nota1 = input.nextDouble();
            System.out.printf("Digite a segunda nota: ");
            nota2 = input.nextDouble();
            media = (nota1 + nota2) / 2;
            System.out.printf("A sua média é: %.2f \n", media);
            cont = cont + 1;
        }
    }
    
}
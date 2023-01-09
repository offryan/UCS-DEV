package programaperimetro;
import java.util.Scanner;

public class ProgramaPerimetro {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int a, b, c, d, total, area;

        System.out.printf("Digite o valor do primeiro lado: ");
        a = input.nextInt();

        System.out.printf("Digite o valor do segundo lado: ");
        b = input.nextInt();

        System.out.printf("Digite o valor do terceiro lado: ");
        c = input.nextInt();

        System.out.printf("Digite o valor do quarto lado: ");
        d = input.nextInt();

        total = CalculaPerimetro(a, b, c, d);
        System.out.printf("Perímetro: %d ", + total);

        area = CalculaPerimetro(a, b);
        System.out.printf("- Area: %d", + area); //Por algum motivo o letra "Á" maiscula com acento agudo aparece como(?) na saída

        input.close();

    }
    static int CalculaPerimetro(int a, int b, int c, int d){
        int total;
        total = a + b + c + d;
        return(total);
    }

    static int CalculaPerimetro(int a, int b){
        int area;
        area = a * b;
        return(area);
    }}
    

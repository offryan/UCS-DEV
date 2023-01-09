package tabuadacomfor;
import java.util.Scanner;

public class TabuadaComFor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int cont, tab, res;
        
        System.out.printf("Digite a tabuada: ");
        tab = input.nextInt();
        
        for (cont = 1; cont <= 10; cont++){
            res = cont * tab;
            System.out.printf("%d x %d = %d \n", tab, cont, res);
        }
    }
    
}

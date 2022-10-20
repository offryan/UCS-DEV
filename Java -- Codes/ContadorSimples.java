package programacontadorsimples;
import java.util.Scanner;

public class ProgramaContadorSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cont;
        
        cont = 0;
        while (cont < 10) {
            System.out.printf("Contador: %d \n", cont);
            cont = cont + 1;
                 
        }
    }
    
}

package ex1auladia11;
import java.util.Scanner;

public class ex1auladia11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int na, nb, nc, media;

        System.out.printf("Digite a primeira nota: ", na);
        na = input.nextInt();

        System.out.printf("Digite a primeira nota: ", nb);
        nb = input.nextInt();

        System.out.printf("Digite a primeira nota: ", nc);
        nc = input.nextInt();

        media = (na + nb + nc) * 7;
        System.out.printf("O resultado: ", media);
    }
    
}

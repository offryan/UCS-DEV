package programasegundos;
import java.util.Scanner;

public class ProgramaSegundos {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
    
        double dia, horas, minutos, segundos, segundosT;

        System.out.printf("Por favor, entre com o número de segundos que deseja converter: ");
        segundosT = input.nextInt();

        dia = Math.floor(segundosT/60/Math.floor(60) /Math.floor(24));
        horas = Math.floor(segundosT/60/Math.floor(60)%24);
        minutos = Math.floor(segundosT/60)%60;
        segundos = segundosT % 60;
        System.out.println("" +dia+ " dias " +horas+ " horas " + minutos + " minutos " +segundos+ " segundos.");

    input.close(); 
}
}

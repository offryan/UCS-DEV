/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programasegundos;
import java.util.Scanner;
/**
 *
 * @author nextr
 */
public class ProgramaSegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

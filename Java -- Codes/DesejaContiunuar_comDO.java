/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programadesejacontiunuar_comdo;

/**
 *
 * @author logon
 */
public class ProgramaDesejaContiunuar_comDO {

  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int acumulador;
        char resposta;

        acumulador = 0;
        resposta = 's';

        do{ 
            System.out.printf("Deseja Contiunuar? s/n \n");
            resposta = input.next().charAt(0);

            System.out.printf("Acumulador: %d \n", acumulador);
            acumulador = acumulador + 1;
        }
    
        while(resposta == 's' || resposta == 'S');
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog_vetor1part2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prog_vetor1part2 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int a[] = new int[5];
        int i;
        
        for (i = 0; i <= 4; i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite um valor para a posição " + i + " do vetor",
                                                      "Dado", JOptionPane.INFORMATION_MESSAGE));
            }
        for (i = 0; i <= 4; i++) {
            JOptionPane.showInputDialog(null, "Valor para a posição " + i + "do vetor: ",
                                                        JOptionPane.INFORMATION_MESSAGE);
    }
  }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programahorasint;
import javax.swing.*;
/**
 *
 * @author logon
 */
public class ProgramaHorasInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas, minutos, total;
        horas = Integer.parseInt(
            JOptionPane.showInputDialog(null,
            "Digite as horas: ", "Horas", JOptionPane.INFORMATION_MESSAGE)); 
        minutos = Integer.parseInt(
           JOptionPane.showInputDialog(null,
            "Digite os minutos: ", "Minutos", JOptionPane.INFORMATION_MESSAGE));

        total = HorasMinutos (horas, minutos);
        JOptionPane.showMessageDialog(null, "O total de minutos que se passaram é: " + total+ " minutos",
            "Total", JOptionPane.INFORMATION_MESSAGE);   
    }
    static int HorasMinutos (int a, int b){
        int tot;
        tot = b + (a * 60);
        return (tot);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author valvu
 */
public class ProgramaHorasParaMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int horas, minutos, total;
        
        horas = Integer.parseInt(
        JOptionPane.showInputDialog (null,
        "Digite as horas: ",
        "Horas", JOptionPane.INFORMATION_MESSAGE) );
        
        minutos = Integer.parseInt(
        JOptionPane.showInputDialog (null,
        "Digite os minutos: ",
        "Minutos", JOptionPane.INFORMATION_MESSAGE) );
        
        total = HorasMinutos(horas, minutos);
        
        JOptionPane.showMessageDialog (null,
        "O total de minutos é: " + total,
        "Total", JOptionPane.INFORMATION_MESSAGE);
        }
    
    static int HorasMinutos (int a, int b) {
        int tot;
        tot = b + (a * 60);
        return (tot);
    }
}

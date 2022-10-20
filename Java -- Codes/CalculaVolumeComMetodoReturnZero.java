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
public class ProgramaCalculaVolumeComMetodoReturnZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        float alt, larg, prof, volume;
        
        alt = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura",
                "ALTURA", JOptionPane.QUESTION_MESSAGE));
        larg = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura",
                "LARGURA", JOptionPane.QUESTION_MESSAGE));
        prof = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a profundidade",
                "PROFUNDIDADE", JOptionPane.QUESTION_MESSAGE));
        
        CalculaVolume (alt, larg, prof);
               
    }
    
    public static float CalculaVolume (float a, float b, float c){
        float vol;
        vol = a * b * c;
        
        JOptionPane.showMessageDialog(null, "O volume é: " + vol, "VOLUME",
                JOptionPane.WARNING_MESSAGE);
        
        return (0);
    }
}

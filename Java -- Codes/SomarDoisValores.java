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
public class SomarDoisValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    float x, y;
    x = Float.parseFloat(
        JOptionPane.showInputDialog (null,
        "Digite o primeiro valor ",
        "Dado", JOptionPane.INFORMATION_MESSAGE) );
    y = Float.parseFloat(
        JOptionPane.showInputDialog (null,
        "Digite o segundo valor ",
        "Dado", JOptionPane.INFORMATION_MESSAGE) ); 
    JOptionPane.showMessageDialog (null,
        "A soma é " + somaDoisValores (x, y),
        "Soma", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static float somaDoisValores (float a, float b) {
        float result;
        result = a + b;
        return (result);        
    }
    
}

import javax.swing.*;

public class SomarDoisValores {

    public static void main(String args[]) {

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

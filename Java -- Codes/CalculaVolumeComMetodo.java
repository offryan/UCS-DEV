import javax.swing.*;

public class ProgramaCalculaVolumeComMetodo {

    public static void main(String args[]) {
        // TODO code application logic here
        float alt, larg, prof, volume;
        
        alt = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura",
                "ALTURA", JOptionPane.QUESTION_MESSAGE));
        larg = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura",
                "LARGURA", JOptionPane.QUESTION_MESSAGE));
        prof = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a profundidade",
                "PROFUNDIDADE", JOptionPane.QUESTION_MESSAGE));
        
        volume = CalculaVolume (alt, larg, prof);
        
        JOptionPane.showMessageDialog(null, "O volume é: " + volume, "VOLUME",
                JOptionPane.WARNING_MESSAGE);
    }
    
    static float CalculaVolume (float a, float b, float c){
        float vol;
        vol = a * b * c;
        return (vol);
    }
}

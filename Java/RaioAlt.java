package programaraioalt;
import javax.swing.*;

public class ProgramaRaioAlt {

    public static void main(String[] args) {

        int raio, alt; 
        double total;

        raio = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o valor do raio: ", 
            "Raio", JOptionPane.INFORMATION_MESSAGE));
        
        alt = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o valor da altura: ", 
            "Altura", JOptionPane.INFORMATION_MESSAGE));
        
        total = CalculaVolumeTonel(raio, alt);
        JOptionPane.showMessageDialog(null, "O volume total é: " + total,
        "Total", JOptionPane.INFORMATION_MESSAGE);
       
    }
    static double CalculaVolumeTonel(int raio, int alt){
        double total;
        total =  3.1415* (raio * raio) *alt;
        return (total);
    }

}



package projetovolcaixa;
import javax.swing.*;

public class ProjetoVolCaixa {

    public static void main(String[] args) {
        // TODO code application logic here
        int compr, larg, alt; 
        int total;

        compr = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o valor do comprimento: ", 
            "Comprimento", JOptionPane.INFORMATION_MESSAGE));
        
        larg = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o valor da largura: ", 
            "Largura", JOptionPane.INFORMATION_MESSAGE));
        
        alt = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o valor da altura: ", 
            "Altura", JOptionPane.INFORMATION_MESSAGE));
            

        total = CalculaVolumeCaixa(compr, larg, alt);
        JOptionPane.showMessageDialog(null, "O volume total é: " + total,
        "Total", JOptionPane.INFORMATION_MESSAGE);
       
    }
    static int CalculaVolumeCaixa(int compr, int alt, int larg){
        int total;
        total =  compr * larg *alt;
        return (total);
    }

}

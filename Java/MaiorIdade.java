package programamaioridade;
import javax.swing.*;

public class ProgramaMaiorIdade {

    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        
        idade = Integer.parseInt(
            JOptionPane.showInputDialog (null, "Digite sua idade:",
            "Idade", JOptionPane.INFORMATION_MESSAGE));
        
        if (idade >= 18){
            JOptionPane.showMessageDialog (null, "Você é maior de idade!",
            "De Maior", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog (null, "Você é menor de idade!",
            "De Menor", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}

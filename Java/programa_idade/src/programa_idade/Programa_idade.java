/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa_idade;
import javax.swing.*;

/**
 *
 * @offryan
 */
public class Programa_idade {

    public static void main(String[] args) {

    int idade;

    idade = Integer.parseInt(
        JOptionPane.showInputDialog(null, "Digite sua idade: ", 
        "idade", JOptionPane.INFORMATION_MESSAGE));

    if (idade >=18){
        JOptionPane.showMessageDialog(null, "Você é maior de idade: ", 
        "De maior", JOptionPane.WARNING_MESSAGE);
    } 

    else{
        JOptionPane.showMessageDialog(null, "Você é menor de idade: ", 
        "De menor", JOptionPane.WARNING_MESSAGE);
    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.lab03;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Xavier
 */
public class TestaFor {

    public static void main(String[] args) {

        String nomes[] = {"Beth", "Bianca", "Luiz", "Bela", "Nico", "Ilza", "Geronimo", "Rafa"};

        String procuraNome = JOptionPane.showInputDialog("Digite \"Ilza\" ou \"sem nome\" !");

        boolean acheiNome = false;

        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(procuraNome)){
                acheiNome = true;
                break;
            }
        }
        
        if (acheiNome)
            JOptionPane.showMessageDialog(null, procuraNome + " encontrado!");
        else
            JOptionPane.showMessageDialog(null, procuraNome + " não encontrado!");
    }

}

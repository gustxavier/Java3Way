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
public class MediaNota {
    public static void main(String[] args){
        int notaIPD = 0;
        int notaIngles = 0;
        int notafisica = 0;
        double media = 0;
        
        String snota;
        
        snota = JOptionPane.showInputDialog("Nota IPD entre 0 e 100!");
        notaIPD = Integer.parseInt(snota);
        snota = JOptionPane.showInputDialog("Nota Inglês entre 0 e 100!");
        notaIngles = Integer.parseInt(snota);
        snota = JOptionPane.showInputDialog("Nota Física entre 0 e 100!");
        notafisica = Integer.parseInt(snota);
        
        media = (notaIPD + notaIngles + notafisica) / 3;
        
        if (media > 90) {
            JOptionPane.showMessageDialog(null, "Estrela dourada! Sua media eh " + media);
        } else if (media > 50 && media < 90) {
            JOptionPane.showMessageDialog(null, "Estrela prateada! Sua media eh " + media);
        } else if (media < 50) {
            JOptionPane.showMessageDialog(null, "Não ganha estrela! Sua media eh " + media);
        } 
    }
}

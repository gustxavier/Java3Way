/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO04;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Xavier
 */
public class MaiorNumero {

    public static void main(String[] args) {

        int[] num = new int[10];
        int contador;
        int max = 0;
        int min = 0;
        int numerosTotal = 3;

        for (contador = 0; contador < numerosTotal; contador++) {
            num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com números até " + numerosTotal + " no total"));
            if ((contador == 0) || (num[contador] > max)) {
                max = num[contador];
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número eh " + max);
        
        for (contador = 0; contador < numerosTotal; contador++) {
            num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com números até " + numerosTotal + " no total"));
            if ((contador == 0) || (num[contador] < min)) {
                min = num[contador];
            }
        }

        JOptionPane.showMessageDialog(null, "O menor número eh " + min);
    }

}

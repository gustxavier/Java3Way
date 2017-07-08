/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO03;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Xavier
 */
public class NumeroExtrenso {

    public static void main(String[] args) {

        String message = "";
        int input = 0;

        input = Integer.parseInt(JOptionPane.showInputDialog("Entre numero 1 e 10"));

        switch (input) {
            case 1:
                message = "um";
                break;
            case 2:
                message = "dois";
                break;
            case 3:
                message = "tres";
                break;
            case 4:
                message = "quatro";
                break;
            case 5:
                message = "cinco";
                break;
            case 6:
                message = "seis";
                break;
            case 7:
                message = "sete";
                break;
            case 8:
                message = "oito";
                break;
            case 9:
                message = "nove";
                break;
            case 10:
                message = "dez";
                break;
            default:
                message = "Numero invalido!";
                break;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.lab04;

/**
 *
 * @author Gustavo Xavier
 */
public class TriDArray {

    public static void main(String[] args) {
        int[][][] arrayTridmensional = new int[10][5][2];
        int valor = 1000;

        System.out.println("idades.length =" + arrayTridmensional.length);
        System.out.println("idades.length[1] =" + arrayTridmensional[1].length);
        System.out.println("idades.length[2] =" + arrayTridmensional[2].length);

        for (int i = 0; i < arrayTridmensional.length; i++) {
            System.out.println("\n Linha " + i);

            for (int j = 0; j < arrayTridmensional[i].length; j++) {
                for (int k = 0; k < arrayTridmensional[i][j].length; k++) {
                    arrayTridmensional[i][j][k] = valor;
                    System.out.print(arrayTridmensional[i][j][k] + " ");
                    valor++;
                }
            }
        }
    }

}

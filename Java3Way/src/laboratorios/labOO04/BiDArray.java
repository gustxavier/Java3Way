/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO04;

/**
 *
 * @author Gustavo Xavier
 */
public class BiDArray {
    
    public static void main(String[] args) {
        
        int[][] idades = new int[10][5];
        
        System.out.println("idades.length =" + idades.length);
        System.out.println("idades.length[1] =" + idades[1].length);
        
        for (int i = 0; i < idades.length; i++){
            System.out.println("\n Linha " +i);
            
            for(int j = 0; j < idades[i].length; j++){
                idades[i][j] = i * j;
                System.out.print(idades[i][j] + " ");
            }
        }
    }
    
}

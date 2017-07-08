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
public class UniArray {

    public static void main(String[] args) {
        
        int[] idades = new int[10];
        int idadeBase = 31;

        for(int i = 0; i < idades.length; i++){
            idades[i] = idadeBase;
            System.out.println("idades["+i+"]=" + idades[i]);
            idadeBase ++;
        }
                
    }
    
}

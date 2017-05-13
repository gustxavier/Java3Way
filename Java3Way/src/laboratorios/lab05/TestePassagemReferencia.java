/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.lab05;

import java.util.Arrays;

/**
 *
 * @author Gustavo Xavier
 */
public class TestePassagemReferencia {

    public static void main(String[] args) {
        int[] i = {10, 20, 30};

        System.out.println("inicia metodo main e i = " + Arrays.toString(i));
        
        test(i);
        
        System.out.println("termina o metodo main e i = " + Arrays.toString(i));
    }
    
    public static void test(int[] j){
        System.out.println("inicia metodo teste e j = " + Arrays.toString(j));
        
        j[0] = 33;
        j[1] = 66;
        
        System.out.println("terminar o metodo test e j = " + Arrays.toString(j));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO05;

/**
 *
 * @author Gustavo Xavier
 */
public class EscopoDeVariavel {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 15;
        
        if (var1 < 100) {
            var2 = 20;
        } else {
            var2 = 21;
        }
        
        System.out.println("Valor de var1 = " + var1);
        System.out.println("Valor de var2 = " + var2);
    }
}

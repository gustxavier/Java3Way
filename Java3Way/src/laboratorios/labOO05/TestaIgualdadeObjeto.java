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
public class TestaIgualdadeObjeto {
    public static void main(String[] args) {
        
        String str1, str2;
        
        str1 = "Viver sem Deus... nao eh viver!";
        str2 = str1;
        
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);
        
        System.out.println("Mesmo objeto? " + (str1 == str2));
        
        str2 = new String(str1);
        
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);
        
        System.out.println("Mesmo objeto? " + (str1 == str2));
        
        System.out.println("Mesmo valor? " + str1.equals(str2));
    }
}

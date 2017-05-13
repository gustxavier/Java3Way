/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.lab05;

/**
 *
 * @author Gustavo Xavier
 */
public class TestaInstanceOf {
    public static void main(String[] args) {
        String str1 = "Aprenda Java em Dez anos!";
        Integer int1 = new Integer(40);
        
        boolean b1 = str1 instanceof String;
        System.out.println("str1 eh String: " + b1);
        boolean b2 = str1 instanceof Object;
        System.out.println("str1 eh Object: " + b2);
        
        b1 = int1 instanceof Integer;
        System.out.println("int1 eh do tipo Integer: " + b1);
        b2 = int1 instanceof Object;
        System.out.println("int1 eh Object: " + b2);
        b2 = int1 instanceof Number;
        System.out.println("int1 eh Number: " + b2);
    }
}

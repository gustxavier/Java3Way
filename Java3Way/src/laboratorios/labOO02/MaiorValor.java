/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO02;

/**
 *
 * @author Gustavo Xavier
 */
public class MaiorValor {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int max = 0;
        
        max = (num1>num2)?num1:num2;
        max = (num1>num3)?max:num3;
        
        System.out.println("numero 1 = "+num1);
        System.out.println("numero 2 = "+num2);
        System.out.println("numero 3 = "+num3);
        System.out.println("O maior numero = "+max);
    }
}
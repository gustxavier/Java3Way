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
public class TestaPassagemValor {
    public static void main(String[] args) {
        int i = 10;
        int k = 5;
        System.out.println("inicia metodo main e i = " + i);
        System.out.println("inicia metodo main e k = " + k);
        
        test(i, k);
        
        System.out.println("termina o metodo main e i = " + i);
        System.out.println("termina o metodo main e k = " + k);
    }
    
    public static void test(int j, int l){
        System.out.println("inicia metodo test e j = " + j);
        System.out.println("inicia metodo test e k = " + l);
        
        j = 33;
        l = 22;
        System.out.println("termina metodo test e j = " + j);
        System.out.println("termina metodo test e k = " + l);
    }
}

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
public class MetodosInstanciaEestatico {
    
    public static void main(String[] args) {
        String strInst1 = new String("Sou uma instancia de objeto da classe String");
        String strInst2 = "Viva com paixao!";
        
        char x = strInst1.charAt(2);
        char y = strInst2.charAt(1);
        char z = strInst2.charAt(0);
        
        System.out.println("O 3.o caracter da strInst1 = " + x);
        System.out.println("O 3.o caracter da strInst2 = " + y);
        System.out.println("O 3.o caracter da strInst2 = " + z);
        
        boolean b = strInst1.equalsIgnoreCase(strInst2);
        String strInst3 = b ? "Sim" : "Nao";
        
        System.out.println("As variaveis strInst1" + "e strInst2 tem o mesmo" + " conjunto de caracteres? " + strInst3);
        
        int i = 23;
        String strInst4 = String.valueOf(i);
        System.out.println("valor de strInst4 = " + strInst4);
        
        String strInst5 = new String("34");
        int ii = Integer.parseInt(strInst5);
        System.out.println("valor de ii = " + ii);
        
        String strInst6 = "Terceira string!";
        char f = strInst6.charAt(2);
        
        String str = "Hello";
        System.out.println(str.endsWith("llo"));
        System.out.println(Math.floor(3.14));
        System.out.println("0 = " + Character.isDigit('0'));
        System.out.println("A = " + Character.isDigit('A'));
        
    }
}

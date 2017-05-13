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
public class ClasseEObjeto {
    public static void main(String[] args) {
        String strOnjeto1 = new String("Este objeto eh uma instancia da classe String");
        System.out.println("estado da instancia de strObjeto1 = " + strOnjeto1);
        
        String strObjeto2 = "Este objeto eh uma instancia da classe String";
        System.out.println("estado da instancia de strObjeto2 = " + strObjeto2);
        
        Integer intObjeto1 = new Integer(20);
        System.out.println("estado da instancia de intObjeto1 = " + intObjeto1);
        
        Double doubleObjeto1 = new Double(2.0);
        System.out.println("estado da instancia de doubleObjeto1 = " + doubleObjeto1);
    }
}

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
public class AutoBoxUnbox {

    public static void main(String[] args) {
        
        Integer intObjeto = 7801;
        
        int intPrimitiva = intObjeto;
        System.out.println("int intPrimitiva = " + intPrimitiva);
        
        String strInt = "65000";
        Integer intConvertida = Integer.parseInt(strInt);
        System.out.println("int intConvertida = " + intConvertida);
        
        int intPrimitiva2 = intConvertida;
        System.out.println("Integer intObjeto2 = " + intPrimitiva2);
    }
}

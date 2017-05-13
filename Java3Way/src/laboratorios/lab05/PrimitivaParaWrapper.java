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
public class PrimitivaParaWrapper {

    public static void main(String[] args) {
        
        Integer intObjeto = new Integer(7801);
        
        int intPrimitiva = intObjeto.intValue();
        System.out.println("int intPrimitiva = " + intPrimitiva);
        
        Long lonObjeto = new Long(3216679);
        
        long longPrimitiva = lonObjeto.longValue();
        System.out.println("long longPrimitiva = " + longPrimitiva);
        
        String strInt = "65000";
        String strLong = "650564900";
        
        int intConvertida = Integer.parseInt(strInt);
        System.out.println("int intConvertida = " + intConvertida);
    
        Integer intObjeto2 = new Integer(intConvertida);
        System.out.println("Integer intObjeto2 = " + intObjeto2);
        
        long longConvertida = Long.parseLong(strLong);
        System.out.println("long longConvertida = " + longConvertida);
    
        Long longObjeto2 = new Long(longConvertida);
        System.out.println("Long longObjeto2 = " + longObjeto2);
    }
}

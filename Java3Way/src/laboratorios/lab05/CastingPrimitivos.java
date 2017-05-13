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
public class CastingPrimitivos {

    public static void main(String[] args) {

        int numInt = 10;
        double numdouble = numInt;

        System.out.println("int " + numInt + " e implicitamente moldado para double " + numdouble);
        
        int numInt1 = 3;
        int numInt2 = 2;
        double numdouble2 = numInt1 / numInt2;
        
        System.out.println("numInt1/numInt2 " + numInt1 / numInt2 + " e implicitamente moldado para " + numdouble2);
        
        double valDouble = 10.12;
        int valInt = (int) valDouble;
        
        System.out.println("double " + valDouble + " e explicitamente moldado para int " + valInt);
        
        double x = 10.2;
        int y = 2;
        int resultado = (int)(x/y);
        System.out.println("x/y " + x/y + " e explicitamente moldado para int " + resultado);
        
    }
}

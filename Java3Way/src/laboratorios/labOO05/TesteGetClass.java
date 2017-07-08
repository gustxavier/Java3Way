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
public class TesteGetClass {

    public static void main(String[] args) {
        String str1 = "A vida e para ser vivida... com Deus!";
        
        Class str1Class = str1.getClass();
        System.out.println("A classe de str1 eh uma instancia de " + str1Class);
        
        String str1ClassName = str1Class.getName();
        System.out.println("Nome da casse e " + str1ClassName);
        
        Integer int1 = new Integer(34);
        
        Class int1Class = int1.getClass();
        System.out.println("A classe de int1 eh uma intancia de " + int1Class);
        
        String int1ClassName = int1Class.getName();
        System.out.println("Nome da classe eh " + int1ClassName);
    }
}

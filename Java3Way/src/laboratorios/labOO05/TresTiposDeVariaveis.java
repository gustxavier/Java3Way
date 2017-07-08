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
public class TresTiposDeVariaveis {
    
    static String staticVariable = "Variavel da classe, ou estatica";
    
    String instanceVariable = "variavel de instancia";
           
    public TresTiposDeVariaveis (){
    }
    
    public static void main(String[] args) {
        String localVariable = "variavel local";
        System.out.println("Variavel estatica = " + staticVariable);
        TresTiposDeVariaveis instanceVar = new TresTiposDeVariaveis();
        instanceVar.printInstanceVariable();
        System.out.println("Variavel local = " + localVariable);
    }
    
    public void printInstanceVariable (){
        System.out.println("Variavel de instancia = " + instanceVariable);
    }
}

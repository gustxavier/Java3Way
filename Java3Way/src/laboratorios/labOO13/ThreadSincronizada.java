/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO13;

/**
 *
 * @author Gustavo Xavier
 */
public class ThreadSincronizada {

    public static void main(String[] args) {
        DuasStrings ds = new DuasStrings();
        new ImprimeStringsThread("Voce ", " aqui ?", ds);
        new ImprimeStringsThread("Muito bem ", "obrigado!", ds);
        new ImprimeStringsThread("Como voce ", " esta?", ds);
    }
}

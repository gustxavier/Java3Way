/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteArrayList {

    public static void main(String[] args) {

        List<String> al = new ArrayList<String>(2);

        System.out.println(al + ", size = " + al.size());

        // Adiciona itens ao ArrayList
        al.add("Robaum");
        al.add("Usurpa");
        al.add("Omitte");

        System.out.println(al + ", size = " + al.size());

        al.remove("Usurpa");
        System.out.println(al + ", size = " + al.size());

        System.out.println("A lista contem Omitte = " + al.contains("Omitte"));
        System.out.println("A lista contem Paumdu = " + al.contains("Paumdu"));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.TreeSet;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteTreeSet {

    public static void main(String[] args) {

        TreeSet<Cliente> clientes = new TreeSet<Cliente>();
        clientes.add(new Cliente("Jesus"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Mateus"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Paulo"));
        clientes.add(new Cliente("João"));

        System.out.println(clientes);

    }
}

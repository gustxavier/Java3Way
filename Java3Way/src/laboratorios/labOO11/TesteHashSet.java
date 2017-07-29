/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.HashSet;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteHashSet {

    public static void main(String[] args) {

        HashSet<Cliente> clientes = new HashSet<Cliente>();
        clientes.add(new Cliente("Jesus"));
        clientes.add(new Cliente("Jesus")); // Duplicado
        clientes.add(new Cliente("Mateus"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Maria")); // Duplicado
        clientes.add(new Cliente("Paulo"));
        clientes.add(new Cliente("João"));

        System.out.println(clientes);

        HashSet<Conta> contas = new HashSet<Conta>();
        contas.add(new Conta(new Cliente("Ze"), 5));
        contas.add(new Conta(new Cliente("Lucas"), 2));
        contas.add(new Conta(new Cliente("Pedro"), 1));
        contas.add(new Conta(new Cliente("Maria"), 1)); // Duplicado o numero da conta
        contas.add(new Conta(new Cliente("Joao"), 0));
        contas.add(new Conta(new Cliente("Ana"), 4));

        System.out.println(contas);

    }
}

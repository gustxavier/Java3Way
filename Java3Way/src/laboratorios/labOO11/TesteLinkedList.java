/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.LinkedList;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteLinkedList {

    public static void main(String[] args) {

        // Cria LinkedList e adiciona 2 contas
        LinkedList<Conta> ll = new LinkedList<Conta>();
        ll.add(new Conta(new Cliente("Falula"), 1));
        ll.add(new Conta(new Cliente("Bolula"), 2));

        System.out.println(ll + ", tamanho = " + ll.size());

        ll.add(new Conta(new Cliente("Zelula"), 3));
        ll.add(new Conta(new Cliente("Solula"), 4));

        System.out.println(ll);
        System.out.println(ll.getFirst() + ", " + ll.getLast());
        System.out.println(ll.get(1) + ", " + ll.get(2));

        // remove o primeiro e o ultimo
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        // Adiciona outro cliente na posicao 2 da lista
        ll.add(1, new Conta(new Cliente("Zoiudinha"), 5));
        System.out.println(ll);

        // Substitui objeto no indice 2
        ll.add(2, new Conta(new Cliente("Zoiudinha"), 5));
        System.out.println(ll);

    }
}
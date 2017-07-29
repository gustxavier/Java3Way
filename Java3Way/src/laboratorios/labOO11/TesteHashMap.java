/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteHashMap {

    public static void main(String[] args) {

        HashMap<Agencia, Cliente[]> hm = new HashMap<Agencia, Cliente[]>();

        hm.put(new Agencia("ag01"), new Cliente[]{new Cliente("Enricando Carso"), new Cliente("Inacio Estole"), new Cliente("Luiz Ladrum"),});
        hm.put(new Agencia("ag02"), new Cliente[]{new Cliente("Henri Cando"), new Cliente("Stolin Lu La"), new Cliente("Lara Pio"),});
        hm.put(new Agencia("ag03"), new Cliente[]{new Cliente("Sony Gando"), new Cliente("Leire Pisto"), new Cliente("Waga Oubum Du"),});

        // imprime a colecao
        System.out.println(hm);
        // pega as chaves
        Set chaves = hm.keySet();
        // imprime todas as chaves
        System.out.println(chaves);

        // pega os valores
        Collection<Cliente[]> valores = hm.values();

        for (Cliente[] cs : valores) {
            for (Cliente c : cs) {
                System.out.println(c.getNome());
            }
        }

    }
}

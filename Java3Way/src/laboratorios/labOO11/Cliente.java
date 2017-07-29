/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.Vector;

/**
 *
 * @author Gustavo Xavier
 */
public class Cliente implements Comparable<Cliente> {

    private String cpf;
    private String rg;
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return Pessoa.class.getName();
    }

    @Override
    public int compareTo(Cliente o) {
        return getNome().compareTo(o.getNome());
    }
}

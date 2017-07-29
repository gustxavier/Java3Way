/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.ArrayList;
import java.util.Collection;
import laboratorios.labOO08.EntidadeBanco;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Gustavo Xavier
 */
public class Agencia extends EntidadeBanco {

    private Long identificador;

    private String nome;

    private int numero;

    private Banco banco;

    private Collection<Conta> contas;

    public Agencia(String nome) {
        this.nome = nome;

        contas = new HashSet<Conta>();
    }

    public Agencia(String nome, Banco banco) {
        this(nome);
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Long getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object objeto) {
        boolean resultado = false;
        if ((objeto != null) && (objeto instanceof Conta)) {
            Conta c = (Conta) objeto;
            if (getNumero() == c.getNumero()) {
                resultado = true;
            }
        }
        return resultado;
    }

    @Override
    public int hashCode() {
        return getNumero();
    }

    @Override
    public String toString() {
        return getNumero() + "-" + getNome();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.Collection;

/**
 *
 * @author Gustavo Xavier
 */
public class Banco {

    private Long identificador;

    private int numero;

    private String nome;

    private Collection<Agencia> agencias;

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
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

    public Collection<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(Collection<Agencia> agencias) {
        this.agencias = agencias;
    }

}

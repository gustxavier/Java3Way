/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import java.util.Collection;
import java.util.Date;
import laboratorios.labOO06.Transacao;
import laboratorios.labOO08.EntidadeBanco;

/**
 *
 * @author Gustavo Xavier 
 */
public class Conta extends EntidadeBanco {

    private Long identificador;

    private int numero;

    private double saldo;

    private Date dataAbertura;

    private Collection<Transacao> transacoes;

    private Cliente titular;

    private Agencia agencia;

    public Conta(Cliente titular, int nconta) {
        this.numero = nconta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Collection<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Collection<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public Long getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

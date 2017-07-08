/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO08;

import laboratorios.labOO06.*;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Gustavo Xavier
 */
public class Transacao extends EntidadeBanco{

    private Date data;

    private Conta contaDebito;

    private Conta contaCredito;

    private double valor;

    private String descricao;

    private EnumTipoTransacao tipoTransacao;

    public Transacao(Date data, Conta contaDebito, Conta contaCredito, Double valor, String descricao, EnumTipoTransacao tipoTransacao) {
        this.data = data;
        this.contaDebito = contaDebito;
        this.contaCredito = contaCredito;
        this.valor = valor;
        this.descricao = descricao;
        this.tipoTransacao = tipoTransacao;
    }

    public Date getData() {
        return data;
    }

    public Conta getContaDebito() {
        return contaDebito;
    }

    public Conta getContaCredito() {
        return contaCredito;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public EnumTipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setContaDebito(Conta contaDebito) {
        this.contaDebito = contaDebito;
    }

    public void setContaCredito(Conta contaCredito) {
        this.contaCredito = contaCredito;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoTransacao(EnumTipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Override
    public String toString() {
        if (EnumTipoTransacao.TRANSFERENCIA == getTipoTransacao()) {
            return "Transacao data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta debito " + getContaDebito().getNumero() + ", conta credito " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
        } else if (EnumTipoTransacao.DEPOSITO == getTipoTransacao()) {
            return "Deposito data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
        } else if (EnumTipoTransacao.SAQUE == getTipoTransacao()) {
            return "Saque data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " + getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " + getDescricao();
        }

        return "Nenhum tipo de transacao";
    }

    @Override
    public Long getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

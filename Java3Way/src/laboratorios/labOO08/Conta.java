/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO08;

import laboratorios.labOO06.*;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Xavier
 */
public class Conta extends EntidadeBanco{

    private int numero;

    private String titular;

    private double saldo;

    private Date dataAbertura;

    private ArrayList movimento;
    
    private Long identificador;

    public Conta() {
        dataAbertura = UtilData.data();
        movimento = new ArrayList();
    }

    public Conta(String nome, int nconta) {
        this();
        numero = nconta;
        titular = nome;
        saldo = 0.0;
    }

    public ArrayList getMovimento() {
        return movimento;
    }

    public void setMovimento(ArrayList movimento) {
        this.movimento = movimento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public Long getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setIdentificador(Long identificador){
        this.identificador = identificador;
    }
}

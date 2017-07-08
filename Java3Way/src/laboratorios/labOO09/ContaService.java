/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO09;

import laboratorios.labOO06.*;

/**
 *
 * @author Gustavo Xavier
 */
public class ContaService extends Conta{

    public void depositar(Conta contaDestino, double valor) {
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        
        this.historicoTransacao(null, contaDestino, valor, "deposito na conta " + contaDestino.getNumero(), EnumTipoTransacao.DEPOSITO);
    }
    
    public void sacar(Conta contaSaque, double valor){
        contaSaque.setSaldo(contaSaque.getSaldo() - valor);
        
        this.historicoTransacao(null, contaSaque, valor, "saque na conta " + contaSaque.getNumero(), EnumTipoTransacao.DEPOSITO);
    }
    
    public boolean transferir(Conta contaSaque, double valor, Conta contaDestino){
        return transferir(contaSaque, valor, contaDestino, "transferencia para conta " + contaDestino.getNumero());
    }
    
    public boolean transferir(Conta contaSaque, double valor, Conta contaDestino, String descr){
        
        if ((contaSaque.getSaldo()) - valor >= 0){
            this.debito(contaSaque, valor);
            this.credito(contaDestino, valor);
            this.historicoTransacao(contaSaque, contaDestino, valor, descr, EnumTipoTransacao.TRANSFERENCIA);
            return true;
        } else {
            return false;
        }
    }
        
    protected void debito(Conta contaOperacao, double valor){
        contaOperacao.setSaldo(contaOperacao.getSaldo() - valor);
    }
    
    protected void credito(Conta contaOperacao, double valor){
        contaOperacao.setSaldo(contaOperacao.getSaldo() + valor);
    }
    
    protected void historicoTransacao(Conta contaDebito, Conta contaCredito, double valor, String descr, EnumTipoTransacao tipoTransacao){
        Transacao transacao = new Transacao(UtilData.data(), contaDebito, contaCredito, valor, descr, tipoTransacao);
        
        if(contaDebito != null){
            contaDebito.getMovimento().add(transacao);
        }
        contaCredito.getMovimento().add(transacao);
    }
     
    public boolean transferir(Conta destino, double valor) throws  SaldoInsuficienteException {
        if(getSaldo() - valor >= 0){
            this.debito(destino, valor);
            this.credito(destino, valor);
            historicoTransacao(destino, destino, valor, "transferencia para conta " + destino.getNumero(), EnumTipoTransacao.DEPOSITO);
            return true;
        } else {
            throw new SaldoInsuficienteException();
        }
    }

}

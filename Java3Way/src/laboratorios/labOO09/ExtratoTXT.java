/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO09;

import laboratorios.labOO08.*;
import java.util.Iterator;
import laboratorios.labOO06.EnumTipoTransacao;
import laboratorios.labOO06.UtilData;

/**
 *
 * @author Gustavo Xavier
 */
public class ExtratoTXT implements IExtrato {

    protected Conta conta;

    public ExtratoTXT(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String formatar() {
        String newLine = System.getProperty("line.separator");
        String resultado = "Extrato de conta " + newLine;
       
        resultado += String.format("%20.20s", "Data") + " "
        + String.format("%7.7s", "Debito") + " "
        + String.format("%7.7s", "Credito") + " "
        + String.format("%15.15s", "Valor") + " "
        + String.format("%s", "Descricao") + newLine;
        
        Iterator it = conta.getMovimento().iterator();
        
        while(it.hasNext()){
            Transacao t = (Transacao) it.next();
            if(t.getTipoTransacao() == EnumTipoTransacao.TRANSFERENCIA){
                resultado += String.format("%-20.20s", UtilData.DDMMAAAAHHMM(t.getData())) + " "
                + String.format("%7d", t.getContaDebito().getNumero()) + " "
                + String.format("%7d", t.getContaCredito().getNumero()) + " "
                + String.format("15.15s", t.getValor()) + " "
                + String.format("%s", t.getDescricao()) +newLine;
            }
        }
        return resultado;
    }

}

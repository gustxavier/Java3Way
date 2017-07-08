/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO08;
import java.util.Iterator;
import laboratorios.labOO06.EnumTipoTransacao;
import laboratorios.labOO06.UtilData;
/**
 *
 * @author Gustavo Xavier
 */
public class ExtratoHTML implements IExtrato{
    protected Conta conta;
    
    public ExtratoHTML(Conta conta){
        this.conta = conta;
    }

    @Override
    public String formatar() {
        String newLine = System.getProperty("line.separator");
        String resultado = "<html>" + newLine;
        resultado += "<head>" + newLine;
        resultado += "<title>Extrato de Conta</title>" + newLine;
        resultado += "<style type=\"text/css\">" + newLine;
        resultado += "<!--" + newLine;
        resultado += "body { font-family: Verdana, arial, Helvetica," + "sans-serif; font-weigth: normal; font-variant: normal}" + newLine;
        resultado += ".clsIndex{ }" + newLine;
        resultado += ".clsTitle { background-color: #CCCCCC;" + "text-align: center }" + newLine;
        resultado += "td { font-size: 9pt; font-family: Verdana, Arial," + "Helvetica, sans-serif; background-color: #EEEEEE}" + newLine;
        resultado += "-->" + newLine;
        resultado += "</style>" + newLine;
        resultado += "<body>" + newLine;
        resultado += "<h2>Extrato de conta</h2>" + newLine;
        resultado += "<TABLE CLASS\"clsIndex\">" + newLine;
        resultado += "<tr>" + newLine;
        resultado += "<TD CLASS=\"clsTitle\"><B>Data</B></TD>" + newLine;
        resultado += "<TD CLASS=\"clsTitle\"><B>Debito</B></TD>" + newLine;
        resultado += "<TD CLASS=\"clsTitle\"><B>Credito</B></TD>" + newLine;
        resultado += "<TD CLASS=\"clsTitle\"><B>Valor</B></TD>" + newLine;
        resultado += "<TD CLASS=\"clsTitle\"><B>Descricao</B></TD>" + newLine;
        resultado += "</tr>" +newLine;
        Iterator it = conta.getMovimento().iterator();
        
        while(it.hasNext()){
            Transacao t = (Transacao) it.next();
            if(t.getTipoTransacao() == EnumTipoTransacao.TRANSFERENCIA){
                resultado += "<tr>" + newLine;
                resultado += "<TD align=\"left\">" + UtilData.DDMMAAAAHHMM(t.getData()) + "</TD>" + newLine;
                resultado += "<TD align=\"right\">" + t.getContaDebito().getNumero() + "</TD>" + newLine;
                resultado += "<TD align=\"right\">" + t.getContaCredito().getNumero() + "</TD>" + newLine;
                resultado += "<TD align=\"right\">" + t.getValor() + "</TD>" + newLine;
                resultado += "<TD align=\"left\">" + t.getDescricao() + "<TD>" + newLine; 
                resultado += "</tr>" + newLine;
            }
        }
        resultado += "</table>" + newLine;
        resultado += "</body>" + newLine;
        resultado += "</html>" + newLine;
        return resultado;
    }
}

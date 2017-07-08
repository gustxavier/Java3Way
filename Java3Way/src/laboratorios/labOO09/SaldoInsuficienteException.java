/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO09;

/**
 *
 * @author Gustavo Xavier
 */
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("Saldo insuficiente.");
    }
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}

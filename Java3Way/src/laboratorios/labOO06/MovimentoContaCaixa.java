/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO06;

/**
 *
 * @author Gustavo Xavier
 */
public class MovimentoContaCaixa {
    public static void main(String[] args) {
        
        ContaService operacoesConta = new ContaService();
        
        Conta caixa = new Conta("ContaCaixa", 0);
        caixa.setSaldo(100000);
        
        Conta correntista1 = new Conta("Hinfe Liz", 1001);        
        operacoesConta.depositar(correntista1, 1000);
        
        Conta correntista2 = new Conta("ZILEF D'AVIDA", 1002);        
        operacoesConta.depositar(correntista2, 2000);
        
        System.out.println("correntista1 saldo = " + correntista1.getSaldo());
        System.out.println("correntista2 saldo = " + correntista2.getSaldo());
        
        if(operacoesConta.transferir(correntista1, 100.00, correntista2)){
            System.out.println("transferencia ok");
        } else {
            System.out.println("nao pode transferir !");
        }
        
        System.out.println("correntista1 saldo =" + correntista1.getSaldo());
        System.out.println("correntista2 saldo =" + correntista2.getSaldo());
        
        operacoesConta.sacar(correntista2, 120.00);
        System.out.println("saque ok!");
        
        System.out.println("correntista2 saldo = " + correntista2.getSaldo());
        
        System.out.println(correntista1.getMovimento());
        System.out.println(correntista2.getMovimento());
        
        
    }
}

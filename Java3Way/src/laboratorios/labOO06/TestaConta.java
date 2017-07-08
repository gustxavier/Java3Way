/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO06;

import java.util.Scanner;
/**
 *
 * @author Gustavo Xavier
 */
public class TestaConta {
    
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        
        System.out.println("Digite o saldo inicial da conta");
        double saldoConta = c.nextDouble();
        
        System.out.println("Digite o numero da conta");
        int numeroConta = c.nextInt();
        
        ContaService operacoesConta = new ContaService();
//        
//        Conta conta1 = new Conta();
//        conta1.setNumero(numeroConta);
//        conta1.setSaldo(saldoConta);
//        
//        Conta conta2 = new Conta();
//        Conta conta3 = new Conta();
//        
//        System.out.println("O numero da Conta1 :" + conta1.getNumero());
//        System.out.println("O saldo da Conta1 :" + conta1.getSaldo());
//        
//        System.out.println("Será creditado 100 reais na conta ");
//        operacoesConta.depositar(conta1, 100.00);
//        System.out.println("Saldo da Conta1 :" + conta1.getSaldo());
//        
//        System.out.println("Será creditado 56.46 reais na conta ");
//        operacoesConta.depositar(conta1, 56.43);
//        System.out.println("Saldo da Conta1 :" + conta1.getSaldo());
//        
//        System.out.println("Saldo da Conta1 :" + conta1.getSaldo());
//        System.out.println("Saldo da Conta2 :" + conta2.getSaldo());
//        System.out.println("Saldo da Conta3 :" + conta3.getSaldo());
//
//        System.out.println("Transferir 50.00 da conta 1 pra conta 2");
//        operacoesConta.transferir(conta1, 50.00, conta2);
//        
//        System.out.println("Saldo da Conta1 :" + conta1.getSaldo());
//        System.out.println("Saldo da Conta2 :" + conta2.getSaldo());
//        System.out.println("Saldo da Conta3 :" + conta3.getSaldo());
//        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO07;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa pessoaCliente = new Cliente("Ze", "777.777.777-77");
//        pessoa.setNome("Fulano de tal");
//        
//        pessoa.ImprimeNome();
//        
//        Cliente cliente = new Cliente();
//        
//        cliente.setNome("Fulano de tal");
//        cliente.setCpf("999.999.999-99");
//        
//        cliente.ImprimeNome();
//        
        pessoaCliente.setTelefone("(62)9999-9999");
        pessoaCliente.ImprimeNome();
    }
}

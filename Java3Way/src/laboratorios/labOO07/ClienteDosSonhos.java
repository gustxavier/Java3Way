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
public class ClienteDosSonhos extends Cliente{
    
    
    public ClienteDosSonhos(){
        
    }
    
    @Override
    public void ImprimeNome(){
        System.out.println("Esse eh o cliente dos sonhos, seu nome eh: " + getNome() + "Nª CPF: " + cpf + " Seu endereco:" + getEndereco());
    }
}

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
public class Cliente extends Pessoa{
    protected String cpf;
    private String rg;
    
    public Cliente() {
    }
    
    public Cliente(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
    
    @Override
    public void ImprimeNome(){
        System.out.println("O nome do cliente eh: " + getNome() + " Nª CPF: " + cpf + " Seu endereco:" + getEndereco());
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}

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
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    
    public Pessoa() {
        
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }   

    public void ImprimeNome(){
        System.out.println("O nome da pessoa eh: " + nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}

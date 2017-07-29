/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO11;

import laboratorios.labOO08.EntidadeBanco;

/**
 *
 * @author Gustavo Xavier
 */
public class Pessoa extends EntidadeBanco {

    private Long identificador;

    private String nome;

    private String telefone;

    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Long getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

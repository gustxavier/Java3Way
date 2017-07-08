/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO02;

/**
 *
 * @author Gustavo Xavier
 */
public class OperadorCondicional {
    public static void main(String[] args){
        String estadoGrau = "";
        String estadoSalario = "";
        int grau = 80;        
        
        estadoGrau = (grau >= 60) ? "Aprovado" : "Reprovado";
        
        System.out.println(estadoGrau);
        
        int salario = 100000;        
        
        estadoSalario = (salario >= 50000) ? "Você está rico!" : "Você é pobre!";
        
        System.out.println(estadoSalario);
    }
}
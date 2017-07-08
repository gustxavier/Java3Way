/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO06;

import java.util.Date;
/**
 *
 * @author Gustavo Xavier
 */
public class ExemploMetodoEstatico {
    public static void main(String[] args) {
        
        Date data = new Date();
        
        System.out.println(UtilData.agora(data));
        
        UtilData idata = new UtilData();
        System.out.println(UtilData.agora(data));
        
        System.out.println(UtilData.DDMMAAAAHHMM(data));
        
        UtilData.DDMMAAAAHHMM(data);
    }
}

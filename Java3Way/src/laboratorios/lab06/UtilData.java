/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.lab06;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gustavo Xavier
 */
public class UtilData {

    static final int DOMINGO = Calendar.SUNDAY;
    static final int SEGUNDA = Calendar.MONDAY;
    static final int TERCA = Calendar.TUESDAY;
    static final int QUARTA = Calendar.WEDNESDAY;
    static final int QUINTA = Calendar.THURSDAY;
    static final int SEXTA = Calendar.FRIDAY;
    static final int SABADO = Calendar.SATURDAY;

    public static Date data() {
        return Calendar.getInstance().getTime();
    }

    public static Calendar data(int dia, int mes, int ano) {
        return data(dia, mes, ano, 0, 0, 0);
    }

    public static Calendar data(int dia, int mes, int ano, int hora, int min, int seg) {
        Calendar data = Calendar.getInstance();
        data.set(ano, --mes, dia, hora, min, seg);
        data.set(Calendar.MILLISECOND, 0);
        return data;
    }

    public static Calendar data(String data) {
        return data(Integer.valueOf(data.split("/")[0]), Integer.valueOf(data.split("/")[1]), Integer.valueOf(data.split("/")[2]));
    }

    public static Date getDate(Calendar data) {
        return data.getTime();
    }

    public static String DDMMAAAA(Date data) {
        return new java.text.SimpleDateFormat(" dd/MM/yyyy").format(data);
    }

    public static String DDMMAAAAHHMM(Date data) {
        return new java.text.SimpleDateFormat(" dd/MM/yyyy HH:mm").format(data);
    }

    public static String agora(Date data) {
        return new java.text.SimpleDateFormat(" dd/MM/yyyy HH:mm").format(data);
    }
    
    public int getAno(Date data){
        final Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(data);
        
        return calendario.get(Calendar.YEAR);
    }
    
    public int getMes(Date data){
        final Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(data);
        
        return calendario.get(Calendar.MONTH);
    }
    
    public int getDia(Date data){
        final Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(data);
        
        return calendario.get(Calendar.DAY_OF_MONTH);
    }
    
    public void somarDia(Date data, int numDias) {
        final Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(data);
        
        calendario.add(Calendar.DAY_OF_MONTH, numDias);
    }

}

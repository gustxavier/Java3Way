/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO04;

/**
 *
 * @author Gustavo Xavier
 */
public class DiasDaSemana {

    public static void main(String[] args) {

        String[][] days = new String[7][2];
        
        days[0][0] = new String("Domingo");
        days[0][1] = new String("Sunday");
        days[1][0] = new String("Segunda");
        days[1][1] = new String("Monday");
        days[2][0] = new String("Terca");
        days[2][1] = new String("Tuesday");
        days[3][0] = new String("Quarta");
        days[3][1] = new String("Wednesday");
        days[4][0] = new String("Quinta");
        days[4][1] = new String("Thursday");
        days[5][0] = new String("Sexta");
        days[5][1] = new String("Friday");
        days[6][0] = new String("Sabado");
        days[6][1] = new String("Saturday");

        System.out.println("\nPORTUGUES - INGLES");

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j] + " - " + days[i][j]);
                j++;
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo Xavier
 */
public class TestaWhile {

    public static void main(String[] args) {

        int contadorNota, valorNota, total;

        double media;
        total = 0;
        contadorNota = 1;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com 4 notas inteiras, ou valor negativo para sair");
        System.out.println("Digite nota(" + contadorNota + "):");

        valorNota = leitor.nextInt();

        while (valorNota > -1) {
            total += valorNota;
            if (contadorNota >= 4) {
                break;
            }
            contadorNota++;
            System.out.println("Digite nota(" + contadorNota + "):");
            valorNota = leitor.nextInt();
        }
        
        if((contadorNota > 0) && (valorNota > 0)) {
            media = (double) total / contadorNota;
            DecimalFormat doisDigitos = new DecimalFormat("0.00");
            System.out.println("A média: " + doisDigitos.format(media));
        } else {
            System.out.println("Não inseriu nota ou leitura interrompida!");
        }
        System.exit(0);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gustavo Xavier
 */
public class TesteManipulacaoArquivo {

    public static void main(String[] args) {
        File arquivo = new File("/home/suporte/Documentos/teste.txt");

        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            File[] arquivos = arquivo.listFiles();

            FileWriter fw = new FileWriter(arquivo, true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Funciona");

            bw.newLine();
            bw.close();
            fw.close();

            FileReader fr = new FileReader(arquivo);

            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

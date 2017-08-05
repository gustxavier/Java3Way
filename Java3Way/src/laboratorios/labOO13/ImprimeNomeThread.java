/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO13;

/**
 *
 * @author Gustavo Xavier
 */
public class ImprimeNomeThread extends Thread {

    public ImprimeNomeThread(String nome) {
        super(nome);
        start();
    }

    public void run() {
        System.out.println("metodo run() da thread " + this.getName() + " e chamado");

        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
                System.out.println(i + " : " + this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Criando instancia de ImprimeNomeThread...");
        ImprimeNomeThread pnt1 = new ImprimeNomeThread("A");
        ImprimeNomeThread pnt2 = new ImprimeNomeThread("B");
        ImprimeNomeThread pnt3 = new ImprimeNomeThread("C");
        
//        System.out.println("Chamando o metodo start() da thread " + minhaThread.getName());
//        
//        minhaThread.start();
    }
}

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
public class ImprimeNomeRunnable implements Runnable {

    Thread thread;

    public ImprimeNomeRunnable(String nome) {
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                thread.sleep(1000);
                System.out.println(i + " : " + thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        ImprimeNomeRunnable pntr1 = new ImprimeNomeRunnable("RA");
//        Thread t1 = new Thread(pntr1);
//        t1.start();

        ImprimeNomeRunnable pntr2 = new ImprimeNomeRunnable("RB");
//        Thread t2 = new Thread(pntr2);
//        t2.start();

        ImprimeNomeRunnable pntr3 = new ImprimeNomeRunnable("RC");
//        Thread t3 = new Thread(pntr3);
//        t3.start();
    }
}

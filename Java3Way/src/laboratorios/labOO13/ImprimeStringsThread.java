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
public class ImprimeStringsThread implements Runnable {
    
    Thread thread;
    String str1, str2;
    DuasStrings ds = new DuasStrings();
    
    ImprimeStringsThread(String str1, String str2, DuasStrings ds) {
        this.str1 = str1;
        this.str2 = str2;
        this.ds = ds;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run() {
        synchronized (ds) {
            ds.print(str1, str2);
        }
    }
    
}

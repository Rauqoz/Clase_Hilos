/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis
 */
public class Hilo2 extends Thread{
    
    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(1000);    
                System.out.println("Soy Hilo2");
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
}

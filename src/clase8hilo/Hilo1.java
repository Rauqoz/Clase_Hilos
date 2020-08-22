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
public class Hilo1 extends  Thread{
    boolean ejecutar=true;
    @Override
    public void run(){
        while (ejecutar) {
            try {
                Thread.sleep(2000);    
                System.err.println("Soy Hilo1");
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void Detener(){
        ejecutar =false;
    }
       
}

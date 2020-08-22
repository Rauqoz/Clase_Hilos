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
public class Clase8Hilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Hilo1 H1 = new Hilo1();
            Hilo2 H2 = new Hilo2();
            H1.start();
            H2.start();
            Thread.sleep(3000);
            H1.Detener();
        } catch (InterruptedException ex) {
            Logger.getLogger(Clase8Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

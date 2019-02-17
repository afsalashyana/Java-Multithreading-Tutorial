package multithreading.chatp3;

import multithreading.chatp4.JavaThreadTest;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFXThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting Thread Name: " + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I love JavaFX");
                Thread.sleep(200);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread Completed: " + Thread.currentThread().getName());
    }

}

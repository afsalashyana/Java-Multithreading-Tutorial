package multithreading.chapt7;

import multithreading.chatp4.JavaThreadTest;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomThread extends Thread {

    private boolean shouldExit = false;

    public void setShouldExit(boolean shouldExit) {
        this.shouldExit = shouldExit;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(shouldExit){
                    break;
                }
                System.out.println("Thread is runnning!");
                Thread.sleep(200);
            }
            System.out.println("Thread is completed");
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

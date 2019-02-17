package multithreading.chatp3;

import multithreading.chatp4.JavaThreadTest;
import multithreading.chatp4.JavaFXThreadTest;

public class SingleThread {

    public static void main(String[] args) throws InterruptedException {
        createJavaThread();
        createJavaFXThread();
        createAndroidThread();
    }

    private static void createJavaThread() {
        JavaThreadTest threadTest = new JavaThreadTest();
        
        Thread th = new Thread(threadTest);
        th.setName("JAVA_THREAD");
        
        th.start();
    }

    private static void createJavaFXThread() {
        JavaFXThreadTest threadTest = new JavaFXThreadTest();
        
        Thread th = new Thread(threadTest);
        th.setName("JAVAFX_THREAD");
        
        th.start();
    }

    private static void createAndroidThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();
        
        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");
        
        th.start();
    }
}

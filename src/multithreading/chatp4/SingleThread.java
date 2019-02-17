package multithreading.chatp4;

public class SingleThread {

    public static void main(String[] args) throws InterruptedException {
        createJavaThread();
        createJavaFXThread();
        createAndroidThread();
    }

    private static void createJavaThread() {
        new JavaThreadTest().start();
    }

    private static void createJavaFXThread() {
        new JavaFXThreadTest().start();
    }

    private static void createAndroidThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();

        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");

        th.start();
    }
}

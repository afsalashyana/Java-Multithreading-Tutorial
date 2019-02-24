package multithreading.chapt11;

public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            System.out.println("Am i daemon: " + Thread.currentThread().isDaemon());
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                }
            }
        });
        th.setDaemon(true);
        th.start();

        System.out.println("Expecting program shutdown now");
        Thread.sleep(500);
    }
}

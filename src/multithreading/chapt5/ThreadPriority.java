package multithreading.chapt5;

public class ThreadPriority {

    public static void main(String[] args) {
        Thread th = new Thread();
        CalculatorRunnable runnable = new CalculatorRunnable(30000000000L);

        Thread thread1 = new Thread(runnable);
        thread1.setName("High Priority");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.setName("Min Priority");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.setName("Normal Priority");
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread3.start();
    }
}

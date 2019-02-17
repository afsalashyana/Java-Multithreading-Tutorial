package multithreading.chapt5;

public class CalculatorRunnable implements Runnable {

    long value;

    public CalculatorRunnable(long value) {
        this.value = value;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < value; i++) {
            sum += i;
        }
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time: " + timeTaken + " for thread: " + Thread.currentThread().getName());
    }

}

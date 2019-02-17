package multithreading.chapt1;

public class Chapter1 {

    public static void main(String[] args) throws InterruptedException {
        Thread th = Thread.currentThread();

        System.out.println("Current Thread: " + th.getName());

        th.setName("MyThread");

        System.out.println("Current Thread: " + th.getName());
        
        Thread.sleep(100_000);
    }
}

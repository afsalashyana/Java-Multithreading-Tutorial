package multithreading.chapt8;

import java.util.ArrayList;
import java.util.List;

public class Synchronization {

    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();

        Thread thread1 = new StringReverseThread(list, "HELLO");
        thread1.start();

        Thread thread2 = new StringReverseThread(list, "WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

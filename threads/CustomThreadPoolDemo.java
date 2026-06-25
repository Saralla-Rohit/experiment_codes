import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomThreadPoolDemo {
    public static void main(String[] args) {
        // Core = 2, Max = 4, keepAlive = 2s, queue size = 2
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2, 4, 2L, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.DiscardPolicy()
        );
        // Submit two tasks: print odd and even numbers
        executor.submit(new EvenOddTask(1));   // odd
        executor.submit(new EvenOddTask(0));   // even
        executor.shutdown();
    }
}

class EvenOddTask implements Runnable {
    private final int type; // 1 for odd, 0 for even
    private static int counter = 1;
    private static final int MAX = 10;
    private static final Object lock = new Object();
    EvenOddTask(int type) { this.type = type; }
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (counter > MAX) break;
                if (counter % 2 == type) {
                    System.out.println(Thread.currentThread().getName() + " -> " + counter);
                    counter++;
                    lock.notify();
                    try { lock.wait(); } catch (InterruptedException e) { }
                } else {
                    try { lock.wait(); } catch (InterruptedException e) { }
                }
            }
        }
    }
}
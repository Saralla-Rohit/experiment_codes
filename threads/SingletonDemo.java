package threads;

public class SingletonDemo {
    public static void main(String[] args) {
        // Two threads trying to get the instance simultaneously
        Runnable task = () -> {
            Singleton s = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + s);
        };
        new Thread(task).start();
        new Thread(task).start();
    }
}

class Singleton {
    private static volatile Singleton instance;
    private Singleton() { }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
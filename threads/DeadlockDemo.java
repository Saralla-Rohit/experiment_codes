// public class DeadlockDemo {
//     private static final Object LOCK1 = new Object();
//     private static final Object LOCK2 = new Object();
//     public static void main(String[] args) {
//         Thread t1 = new Thread(() -> {
//             synchronized (LOCK1) {
//                 System.out.println("Thread1: holds LOCK1");
//                 sleep(50);
//                 System.out.println("Thread1: waiting for LOCK2");
//                 synchronized (LOCK2) {
//                     System.out.println("Thread1: acquired LOCK2");
//                 }
//             }
//         });
//         Thread t2 = new Thread(() -> {
//             synchronized (LOCK2) {
//                 System.out.println("Thread2: holds LOCK2");
//                 sleep(50);
//                 System.out.println("Thread2: waiting for LOCK1");
//                 synchronized (LOCK1) {
//                     System.out.println("Thread2: acquired LOCK1");
//                 }
//             }
//         });
//         t1.start();
//         t2.start();
//     }
//     private static void sleep(long ms) {
//         try { Thread.sleep(ms); } 
//         catch (InterruptedException e) { }
//     }
// }

public class DeadlockDemo{
    public static final Object lock1=new Object();
    public static final Object lock2=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized(lock1){
                IO.println("Thread-1 holding the lock1");
                sleep(50);
                IO.println("Thread-1 waiting for lock2");
                synchronized(lock2){
                    IO.println("Thread-1 acquired the lock2");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized(lock2){
                System.out.println("Thread-2 holding the lock2");
                sleep(50);
                System.out.println("Thread-2 waiting for lock1");
                synchronized(lock1){
                    IO.println("Thread-2 acquired the lock");
                }
            }
        });
        t1.start();
        t2.start();
    }
    public static void sleep(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }
}

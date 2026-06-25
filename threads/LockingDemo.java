
public class LockingDemo {
    public static void main(String[] args) throws InterruptedException{
        LockTest l1=new LockTest();
        LockTest l2=new LockTest();
        System.out.println("=== Object level (different objects) ===");
        new Thread(()->{
            l1.instanceMethod("instance1");
        }).start();;
        new Thread(()->{
            l1.instanceMethod("instance2");
        }).start();;
                
        Thread.sleep(1500); // separate output
        System.out.println("\n=== Class level (same lock) ===");
        new Thread(()->{
            LockTest.staticMethod("static-1");
        }).start();
        new Thread(()->{
            LockTest.staticMethod("static-2");
        }).start();


    }

}
class LockTest{
    public synchronized void instanceMethod(String name){
        for(int i=0;i<3;i++){
            IO.println(name+" instance - "+i);
            sleep(30);
        }
    }
    public static synchronized void staticMethod(String name){
        for(int i=0;i<3;i++){
            IO.println(name+" static - "+i);
            sleep(30);
        }
    }
    public static void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    } 

}
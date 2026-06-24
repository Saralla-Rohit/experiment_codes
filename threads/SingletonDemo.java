package threads;
// class Demo{};
// public class SingletonDemo{
//     public static void main(String[] args) {
//         Singleton s=Singleton.getInstance();
//         Singleton s1=Singleton.getInstance();

//         IO.println(s);
//         IO.println(s1);

//     }
// }
// class Singleton{
//     private Singleton(){}
//     private static Singleton instance=new Singleton();
//     public static  Singleton getInstance(){
//         return instance;
//     }
// }
public class SingletonDemo{
    public static void main(String[] args) {
        // SingleTon s2=SingleTon.getInstance();
        Runnable task = () ->{
            SingleTon s1=SingleTon.getInstance();
            IO.println(Thread.currentThread().getName()+"->"+s1);
        };
        new Thread(task).start();
        new Thread(task).start();
    }
}
class SingleTon{
    private volatile static SingleTon instance;
    private SingleTon(){}
    public static SingleTon getInstance(){
        synchronized(SingleTon.class){
            if(instance==null){
                instance =new SingleTon();
            }
        }
        return instance;
    }
}
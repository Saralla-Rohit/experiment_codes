package threads;
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer sb=new SharedBuffer();
        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++){
                try{
                    sb.produce(i);
                    Thread.sleep(100);
                }catch(InterruptedException e){ 
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++){
                try{
                    sb.consume();
                    Thread.sleep(100);
                }catch(InterruptedException e){ 
                }
            }
        });
        t1.start();
        t2.start();
    }
}
class SharedBuffer{
    int data;
    boolean available=false;
    public synchronized void produce(int value)throws InterruptedException{
        while (available) wait();
        data=value;
        available =true;
        System.out.println("Produced : "+value);
        notify();
    }
    public synchronized void consume()throws InterruptedException{
        while(!available)wait();
        available=false;
        System.out.println("Consumed : "+data);
        notify();
    }
}
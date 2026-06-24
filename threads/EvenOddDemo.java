package threads;
public class EvenOddDemo{
    public static void main(String[] args) {
        NumberPrinter num=new NumberPrinter(10);
        Thread odd=new Thread(()->{
            try {
                num.printOdd();
            } catch (InterruptedException e) {
            }
        },"Odd");
        Thread even=new Thread(()->{
            try {
                num.printEven();
            } catch (InterruptedException e) {
            }
        },"Even");
        odd.start();
        even.start();
    } 
}
class NumberPrinter{
    int current=1;
    boolean isOddTurn=true;
    int max;
    NumberPrinter(int max){
        this.max=max;
    }
    public synchronized void printOdd()throws InterruptedException{
        while(current<=max){
            while(!isOddTurn)wait();
            if(current>max)break;
            System.out.println(Thread.currentThread().getName()+"->"+current);
            current++;
            isOddTurn=false;
            notify();
        }
    }
    public synchronized void printEven()throws InterruptedException{
        while(current<=max){
            while(isOddTurn)wait();
            if(current>max)break;

            System.out.println(Thread.currentThread().getName()+"->"+current);
            current++;
            isOddTurn=true;
            notify();
        }
    }
}
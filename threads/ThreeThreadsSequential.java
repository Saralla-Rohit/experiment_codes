// package threads;

// public class ThreeThreadsSequential {
//     public static void main(String[] args) {
//         SequentialPrinter printer = new SequentialPrinter(10);

//         for (int i = 0; i < 3; i++) {
//             final int id = i;
//             new Thread(() -> {
//                 try { printer.print(id); } catch (InterruptedException e) { }
//             }, "Thread-" + i).start();
//         }
//     }
// }
// class SequentialPrinter {
//     private int counter = 1;
//     private final int max;

//     SequentialPrinter(int max) { this.max = max; }

//     public synchronized void print(int threadId) throws InterruptedException {
//         while (counter <= max) {
//             while (counter <= max && counter % 3 != threadId) wait();
//             if (counter > max) break;
//             System.out.println(Thread.currentThread().getName() + " -> " + counter);
//             counter++;
//             notifyAll();
//         }
//     }
// }
public class ThreeThreadsSequential{
    public static void main(String[] args) {
        SequentialPrinter sp=new SequentialPrinter(10);
        for(int i=0;i<3;i++){
            final int id = i;
            new Thread(()->{
                try{
                    sp.printNumber(id);

                }catch(InterruptedException e){}
            }).start();
        }
    }
} 
class SequentialPrinter{
    int current=1;
    int max=0;
    SequentialPrinter(int max){
        this.max=max;
    }
    public synchronized void printNumber(int threadId) throws InterruptedException{
        while(current<=max){
            while(current%3!=threadId)wait();
            if(current>max)break;
            System.err.println(Thread.currentThread().getName()+"->"+current);
            current++;
            notifyAll();            
        }
    }
}
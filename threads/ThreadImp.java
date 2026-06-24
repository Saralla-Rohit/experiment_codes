package threads;

import java.util.Arrays;
import java.util.List;

class Student extends Thread{
    @Override
    public void run(){
        for(int i=0;i<1000;i++)
        IO.println("thread running "+Thread.currentThread().getName());
    }
}
public class ThreadImp  {
    public static void main(String[] args) {
        
    }
}

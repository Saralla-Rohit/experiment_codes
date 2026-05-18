package com.rohit;
import java.util.*;

class Main {
    void rem(){
        IO.println("rem");
    }
    static void rem1(){
        IO.println("rem1");
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.rem();
        m.rem1();//still allowed
        Main.rem1();//recommended
    }
}
package com.rohit;
import java.util.*;
class Main {
    int x;
    {
        IO.println(this.x);
        this.x=10;
        IO.println(this.x);
    }
    Main(){
        this.x=20;
        IO.println(this.x);
    }
    public static void main(String[] args) {
       Main m=new Main();
    }
}
/*
0
10
20
*/
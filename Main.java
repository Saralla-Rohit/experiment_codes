// package com.rohit;
// // import java.util.*;

// import java.lang.reflect.Method;
// import java.util.*;
// import java.util.Arrays;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// // record Student(int marks) implements Comparable<Student>{
// //     @Override
// //     public int compareTo(Student other){
// //         return Integer.compare(this.marks(),other.marks());
// //     }

// // }
// // class Main {
// //     void main() {
// //         Student s1=new Student(10);
// //         Student s2=new Student(6);
// //         Student s3=new Student(100);
// //         Student s4=new Student(0);
// //         List<Student>list=new ArrayList<>();
// //         list.add(s1);
// //         list.add(s2);
// //         list.add(s3);
// //         list.add(s4);
// //         // Collections.sort(list);
// //         for(Student s: list){
// //             IO.print(s);
// //         }

// //     }   
// // }

// // package com.rohit;
// // import java.util.*;
// // record Student(int marks){

// // }
// // class Main{
// //     public static void main(String[] args) {
// //         Student s1=new Student(10);
// //         Student s2=new Student(6);
// //         Student s3=new Student(100);
// //         Student s4=new Student(0);
// //         List<Student>list=new ArrayList<>();
// //         list.add(s1);
// //         list.add(s2);
// //         list.add(s3);
// //         list.add(s4);
// //         Collections.sort(list,(stu1,stu2)->Integer.compare(stu1.marks(), stu2.marks()));
// //         for(Student s: list){
// //             IO.print(s);
// //         }
// //     }
// // }
// // package com.rohit;
// // import java.util.*;
// // class Main{
// //     public static void main(String[] args) {
// //         Integer arr[]={10,3,45,2,56,9,22};
// //         Arrays.sort(arr,Collections.reverseOrder());
// //         for(int x:arr){
// //             IO.print(x+" ");
// //         }
// //     }
// // }

// // class CustomException extends Exception {
// //     CustomException(String msg){
// //         super(msg);
// //     }
// // }
// // public class Main {
// //     public static void main(String[] args)throws ClassNotFoundException {
// //         try{
// //             int n=10;
// //             int n2=0;
// //             if(n2==0){
// //                 throw new CustomException("Number is been divided my 0");
// //             }
// //         }catch(CustomException ce){
// //             String msg=ce.toString();
// //             IO.print(msg);
// //         }   
// //     }
// // }


// // class Main{
// //     {
// //         IO.print("Static block executed");
// //     }
// //     Main(){
// //         this(10);

// //     }
// //     Main(int x){
// //         IO.print(x);
// //     }

// //     public static void main(String[] args) {
// //         Main m=new Main();
// //     }
// // }
// // class Student implements Cloneable{
// //     public int id;
// //     public String name;
// //     public Student(int id, String name)
// //     { 
// //         this.id = id;
// //         this.name = name;
// //     } 

// //     public String toString(){
// //         return "name: "+name+" id: "+id;
// //     }
// //     @Override
// //     public Object clone() throws CloneNotSupportedException{
// //         return super.clone();
// //     } 
// // }
// // public class Main {
// //     public static void main(String[] args) {
// //         try{
// //             Student s1=new Student(1, "rohit");
// //             Student s2=(Student)s1.clone();
// //             IO.print(s1);
// //             IO.print(s2);
// //             s2.name="rohit saralla";
// //             IO.print(s1);
// //             IO.print(s2);

// //         }catch(Exception e){
// //             IO.print(e);
// //         }
// //     }

// // }
// // record Product(Integer productNumber,String productName,Double productPrice) implements Comparable<Product>{
// //     @Override
// //     public int compareTo(Product other){
// //         return this.productName().compareTo(other.productName());
// //     }
// // }
// // class Main{
// //     public static void main(String[] args) {
// //         ArrayList<Product>list=new ArrayList<>();
// //         int n=Integer.parseInt(IO.readln());

// //         list.add(new Product(101, "rohit", 10000.0));

// //         list.add(new Product(102, "zahir", 21000.0));

// //         list.add(new Product(101, "anish", 10000.0));
// //         Collections.sort(list);
// //         for(Product p:list){
// //             IO.println(p);
// //         }
// //     }
// // }
// // record Error(){

// // }
// // record Customer (Integer productNumber,String productName,Double productPrice) {
// // }
// // class Main{  
// //     public static void main(String[] args) {
// //         ArrayList<Customer >list=new ArrayList<>();
// //         // int n=Integer.parseInt(IO.readln());

// //         list.add(new Customer (101, "rohit", 10000.0));
// //         list.add(new Customer (10, "anish", 1000.0));

// //         list.add(new Customer (102, "zahir", 21000.0));

// //         list.add(new Customer (10, "anish", 10000.0));
// //         Comparator<Customer>cmp=new Comparator<Customer>() {
// //             @Override
// //             public int compare(Customer c1,Customer c2){
// //                 return Integer.compare(c1.productNumber(), c2.productNumber());
// //             }
// //         };
// //         Comparator<Customer>cmp1=new Comparator<Customer>() {
// //             @Override
// //             public int compare(Customer c1,Customer c2){
// //                 return Double.compare(c1.productPrice(), c2.productPrice());
// //             }
// //         };
// //         Comparator<Customer>cmp2=new Comparator<Customer>() {
// //             @Override
// //             public int compare(Customer c1,Customer c2){
// //                 return c1.productName().compareTo(c2.productName());
// //             }
// //         };
// //         Collections.sort(list,cmp2);    
// //         for(Customer  p:list){
// //             IO.println(p);
// //         }
// //     }
// // }
// /*
// import java.util.*;    
// import java.io.*;
// import java.security.KeyStore.Entry;
// record Student(int id,String name){

// }
// class Main {
//     static void m() throws Exception {
//         throw new Exception();
//     }

//     public static void main(String[] args) throws IOException {
//         Map<Integer,String>map=new HashMap<>();
//         map.put(1,"rohit");
//         map.put(2,"rishi");
//         map.put(3,"rithik");
//         map.put(4,"robin");
//         Iterator<Map.Entry<Integer,String>>itr=map.entrySet().iterator();
//         while(itr.hasNext()){
//             IO.println(itr.next());
//         }
//         Process p=Runtime.getRuntime().exec("javap java.util.ArrayList");
//         BufferedReader br=new BufferedReader(
//             new InputStreamReader(p.getInputStream())
//         );
//         String line;
//         while((line=br.readLine())!=null){
//             IO.print(line);
//         }
//         // Process p=Runtime.getRuntime().exec("javap java.util.ArrayList");
//         // BufferedReader br=new BufferedReader(
//         //     new InputStreamReader(p.getInputStream())
//         // );
//         // String line;
//         // while((line=br.readLine())!=null){
//         //     IO.println(line);
//         // }
//         // List<Integer>list1=new ArrayList<>();
//         // list1.addAl
//         // Collections.reverse(list);
//         // Collections.sort(list,(n1,n2)->Integer.compare(n2,n1));
//         // Collections.min(list);

//         // try {
//         //     try {
//         //     int x = 10 / 0;
//         //     } 
//         //     catch (Exception e) {
//         //         System.out.println("InnerException");
//         //     } finally {
//         //         int y = 10 / 0;
//         //     }
//         // } catch (ArithmeticException e) {
//         //     System.out.println("ExceptionFromFinally");
//         // }
//     }
// }
// */
// // class MyRunnable implements Runnable  {
// //     public void run() {
// //         System.out.println("Thread is running");
// //     }
// // }

// // public class Main {
// //     public static void main(String[] args) throws Exception{
// //         MyRunnable obj = new MyRunnable();
// //         IO.println("after createing thread : "+obj.isAlive());
        
// //         obj.start();
// //         IO.println("after starting thread : "+obj.isAlive());
// //         obj.join();
// //         IO.println("after joining thread : "+obj.isAlive());


// //         // Which statement correctly starts the thread?
// //         // new Thread(obj).start();
// //         // new Thread(obj).run();
// //         // new Thread(new MyRunnable()).start();


// //     }
// // }
// // import java.util.*;
// // class Account {
// //     int balance=0;
// //     public synchronized void withdraw(int amount){
// //         try{
// //             while(balance<amount){
// //                 IO.println("Insufficient balance. Please wait for deposit.");
// //                 IO.println();
// //                 wait();
// //             }
// //             balance-=amount;
// //             IO.println("Amount withdrawn: "+amount);
// //             IO.println("Remaining balance: "+balance);
// //             IO.println();
// //             notifyAll();
// //         }catch(Exception e){

// //         }
// //     }
// //     public synchronized void deposit(int amount){
// //         balance+=amount;
// //         IO.println("Amount is being deposited...");
// //         IO.println("Amount deposited: "+balance);
// //         IO.println();
// //         notifyAll();
// //     }
// // }
// // class Drawer extends Thread{
// //     public Account account;
// //     Drawer(Account account){
// //         this.account=account;
// //     }
// //     public void run(){
// //         int amounts[] = {100, 1500, 600, 2000};
// //         for(int amt:amounts){
// //             account.withdraw(amt);
// //             try{
// //                 Thread.sleep(100);
// //             }catch(Exception e){
                
// //             }
// //         } 
// //     }
// // }
// // class Depositer extends Thread{
// //     Account account;
// //     Depositer(Account account){
// //         this.account=account;
// //     }
// //     public void run(){
// //         int dAmounts[] = {200, 1000, 600, 2000, 5000};  
// //         for(int amt:dAmounts){
// //             account.deposit(amt);
// //             try{
// //                 Thread.sleep(100);
// //             }catch(Exception e){
                
// //             }
// //         }
// //     }
// // }
// // public class Main {
// //     public static void main(String[] args) {
// //         // Write your code here
// //         Account acc=new Account();
// //         Depositer dep=new Depositer(acc);
// //         Drawer dr=new Drawer(acc);
// //         dr.start();
// //         dep.start();
// //     }
// // }

// // class Account{
// //     int balance=0;
// //     synchronized void withdraw(int amount){
// //         try{
// //             while(amount>balance){
// //                 IO.print("Insufficient Balance");
// //                 wait();
// //             }
// //             balance-=amount;
// //             IO.println("Amount withdrawn: "+amount);
// //             IO.println("Remaining balance: "+balance);
// //             notify();
// //         }catch(Exception e){
// //         }
// //     }
// //     synchronized void deposite(int amount){
// //         balance+=amount;
// //         IO.println("Amount deposited ");
// //         IO.println("Remaining balance : "+balance);
// //         notify();
// //     }
// // }
// // class Withdraw extends Thread{
// //     Account account;
// //     Withdraw(Account account){
// //         this.account=account;
// //     }
// //     public void run(){
// //         int amounts[] = {100, 1500, 600, 2000};
// //         for(int amt:amounts){
// //             account.withdraw(amt);
// //             try{
// //                 Thread.sleep(100);
// //             }catch(Exception e){
// //             }
// //         }
// //     }
// // }
// // class Deposite extends Thread{
// //     Account account;
// //     Deposite(Account account){
// //         this.account=account;
// //     }
// //     public void run(){
// //         int dAmounts[] = {200, 1000, 600, 2000, 5000};  
// //         for(int amt:dAmounts){
// //             account.deposite(amt);
// //             try{
// //                 Thread.sleep(100);
// //             }catch(Exception e){
// //             }
// //         }
// //     }
// // }
// // class Main{
// //     public static void main(String[] args) {
// //         Account acc=new Account();
// //         Deposite d=new Deposite(acc);
// //         Withdraw w=new Withdraw(acc);
// //         w.start();
// //         d.start();
// //     }
// // }
// // record Employee(Integer id, String name, Double salary){

// // }
// // import java.io.*;

// // class User implements Serializable {

// //     String name = "Rohit";

// //     transient String password = "12345";
// // }
// // class Test {

// //     boolean divide() {
// //         return true;
// //         return false;
// //     }
// // }
// abstract class Student{
//     public static int Student(){return -1;}
// }
// public class Main{
//     // int a=10;
//     // static int b=20;
//     // void printm1(){
//     //     IO.println(a);
//     //     IO.println(b);
//     //     b++;
//     // }
//     // static void printm2(){
//     //     // IO.println(a);
//     //     IO.println(b);
//     // }
    
//     public static void main( String ...args) throws Exception{
//         Main m1=new Main();
//         m1.printm1();
//         m1.printm1();


//         printm2();

//         // main(new String[]{"r"});
//         // Student st = new Student();
//         // Student st1 = new Student();

//         // change(st);
//         // System.out.println(st.marks);//100
//         // System.out.println(st1.marks);//50

//             // User u = new User();

//             // // Serialization
//             // FileOutputStream fos =  new FileOutputStream("data.txt");

//             // ObjectOutputStream oos = new ObjectOutputStream(fos);

//             // oos.writeObject(u);

//             // // Deserialization
//             // FileInputStream fis =
//             //     new FileInputStream("data.txt");

//             // ObjectInputStream ois =
//             //     new ObjectInputStream(fis);

//             // User obj = (User) ois.readObject();

//             // System.out.println(obj.name);
//             // System.out.println(obj.password);
        
//         /*
//         Main m=new Main();
//         IO.println(m.getClass());//class com.rohit.Main
//         IO.println(m.getClass().getName());//com.rohit.Main
//         IO.print(Integer.toHexString(m.hashCode()));//21a947fe
//         IO.print(m.hashCode());//1c72da34477289012
//         */


//         /*
//         String s1="rohit";
//         String s2="rohit";
//         IO.print(s1==s2);//true
//         */

//         /*
//         String s1="rohit";
//         String s2=s1;
//         IO.print(s1==s2);//true
//         */
        
//         /*
//         String s1="rohit";
//         String s2=new String("rohit");
//         IO.print(s1==s2);//false
//         */
        
        
//         /*
//         String s1=new String("rohit");
//         String s2=s1;
//         IO.print(s1==s2);//true
//         */
        
//         /*
//         String s1=new String("Rohit");
//         String s2=new String("Rohit");
//         IO.print(s1==s2);//false
//         */


//         // Class<?> clazz=Class.forName("java.lang.Object");
//         // Object obj=clazz.getDeclaredConstructor().newInstance();
//         // Method m = clazz.getMethod("hashCode");
       
//         // IO.print(m.invoke(obj));

//         // Main m=new Main();
//         // Class<?> clazz=m.getClass();
//         // Method mets[]=clazz.getMethods();
//         // for(Method met:mets)
//         // IO.println(met);

//         // Stream<T>.of(null);
//         // Employee e1=new Employee(1, "rohit", 10000);
//         // Employee e2=new Employee(2, "kunal", 20000);
//         // Employee e3=new Employee(4, "rithik", 30000);
//         // Employee e4=new Employee(4, "digvesh", 40000);
//         // Employee e5=new Employee(5, "Kane", 8000);
//         // Employee e6=new Employee(5, "Bumrah", 80000);
//         // Arrays.asList(e1,e2,e3,e4,e5,e6);
//         // Collectors c=null;

//     }
// }
import java.util.*;
public class Main {    
    public static void main(String[] args) {
        ArrayList<Optional<String>>al=new ArrayList<>();

        for(int i=0;i<3;i++){
            al.add(Optional.ofNullable(IO.readln()));
        }
        al.forEach(op -> IO.println(op.orElse("null")));

    }
}
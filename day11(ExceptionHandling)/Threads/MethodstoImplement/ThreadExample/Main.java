class MyThread  extends Thread{//thread is build in class
    public void run(){
        System.out.println("thread creation");
    }
}
public class Main {
    public static void main(String[]args){
    MyThread m=new  MyThread();
    m.start();//start is in-build methid of class Thread
    }
}

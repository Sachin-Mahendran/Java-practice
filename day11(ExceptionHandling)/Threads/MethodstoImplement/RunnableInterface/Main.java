class MyThread  implements Runnable{//runnable is a build in interface
    public void run(){//run is a build in method 
        System.out.println("thread creation");
    }
}
public class Main {
    public static void main(String[]args){
    MyThread m=new  MyThread();//create object runnable interface 
    Thread n=new Thread(m);//create object for Thread class so that we can start the execution
    n.start();
    }
}

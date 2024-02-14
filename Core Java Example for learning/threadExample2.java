class counter{
    static int count;
    static public synchronized void increament(){
        count++;
    }
    static public void show(){
        System.out.println(count);
    }
}
class thread1 implements Runnable{
    public void run(){
        for(int i = 1;i<=100;i++){
            counter.increament();
        }
    }
}
class thread2 implements Runnable{
    public void run(){
    for(int i = 1;i<=100;i++){
            counter.increament();
        }
    }
}
public class threadExample2 {
    public static void main(String args[]) throws InterruptedException{
        thread1 obj1 = new thread1();
        thread2 obj2 = new thread2();


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        counter.show();
    }
}

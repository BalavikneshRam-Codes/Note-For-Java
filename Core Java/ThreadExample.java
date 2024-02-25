class A1 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class B1 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class ThreadExample {
    public static void main(String args[]){
        A1 obj1 = new A1();
        B1 obj2 = new B1();
        obj1.start();
        obj2.start();
    }
}

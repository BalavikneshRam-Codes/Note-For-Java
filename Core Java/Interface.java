interface A{
    int age = 45;
    String bala = "bala";
    void show();
    void config();
}
interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("showing");
    };
    public void config(){
        System.out.println("config");
    }
    public void run(){};
}

public class Interface {
  public static void main(String args[]){
    A obj = new B();
    obj.show();
    obj.config();
    X obj1 = new B();
    obj1.run();
  }  
}

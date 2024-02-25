abstract class car{
    public abstract void drive();
    public abstract void fly();
}
class wagron extends car{
    public void drive(){
        System.out.println("drive");}
    public void fly(){
        System.out.println("fly");
        }
     }





public class AbstractClass {
    public static void main(String args[]){
        wagron b = new wagron();
        b.drive();
    }
}

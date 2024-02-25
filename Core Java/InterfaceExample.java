
interface computer{
    public  void code();
}
class laptop implements computer{
    public void code(){
        System.out.println("coding");
    }
}

class desktop implements computer{
    public void code(){
        System.out.println("coding faster");
    }
}
class employee{
    public void wanttoCode(computer car){

        car.code();
    }
}
public class InterfaceExample{
    public static void main(String args[]){
        // laptop lap = new laptop();
        desktop desk = new desktop();
        employee bala = new employee();
        bala.wanttoCode(desk);
    }
}
class flower{
    public void show(){
        System.out.println("Showing in flower class");
    }
    class leaves{
        public void show(){
            System.out.println("showing in leaves class");
        }
    }
}



public class innerClass {
    public static void main(String args[]){
        flower obj1 = new flower();

        flower.leaves obj2 = obj1.new leaves();
        obj2.show();

    }
}

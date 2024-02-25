enum status{
    running,failed,pending,success;// they are all objects
}


enum laptop{
    macbook(20),asus(15),dell,acer(5);

    private int price;

    private laptop(){
        this.price = 400;
    }

    private laptop(int price){
        this.price = price;
    }

    // public void setprice(int price){
    //     this.price = price;
    // }

    public int getprice(){
        return price;
    }
}

public class Enum {
    public static void main(String args[]){
        status[] ss = status.values();
        for(status s:ss){ // status is type receive from ss array
            System.out.println(s+" : "+s.ordinal());
        }

        laptop[] lap = laptop.values();

        for(laptop laptops : lap){
            System.out.println(laptops +" : "+laptops.getprice());
        }
    }
}

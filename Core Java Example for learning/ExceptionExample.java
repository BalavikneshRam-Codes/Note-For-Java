class myexception extends Exception{
    public myexception(String strr){
        super(strr);
    }
}

public class ExceptionExample {
    public static void main(String args[]){
        int j = 0;
        int i = 20;
        try{
            j = 18/i;
            if(j == 0){
                 throw new myexception("this is my error");
            }
        }catch(myexception strr){
            System.out.println("this is my error "+strr);
        }
        System.out.println(j);
    }
}

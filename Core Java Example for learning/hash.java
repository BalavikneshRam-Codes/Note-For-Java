import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String args[]){
        Map<String,Integer> num = new HashMap<>();
        num.put("null", 3);
        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.get("null"));
    }
}

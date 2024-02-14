import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomComparator implements Comparator<Integer> {
    public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10)
            return 1;
        else
            return -1;
    }
}

class sortbylenofString implements Comparator<String>{
    public int compare(String i,String j){
        int lengthofI = i.length();
        int lengthofJ = j.length();
        if(lengthofI > lengthofJ){
            return 1;
        }else{
            return -1;
        }
    }
}

class classroom{
    int marks;
    String name;

    public classroom(int marks,String name){
        this.marks = marks;
        this.name = name;
    }

    public String toString(){
        return "the student name is " + this.name + " and marks is " + this.marks;
    }
    
}

class comparewithmarks implements Comparator<classroom>{
    public int compare(classroom i,classroom j){
        int geti = i.marks;
        int getj = j.marks;
        if(geti > getj){
            return 1;
        }else{
            return -1;
        }
    }
}
public class collections {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(4, 5, 61, 1));
        CustomComparator customComparator = new CustomComparator();
        Collections.sort(num, customComparator);
        System.out.println(num);

        List<String> Str = new ArrayList<>(Arrays.asList("bala","bal","ba"));
        sortbylenofString com = new sortbylenofString();
        Collections.sort(Str,com);
        System.out.println(Str);



        List<classroom> students = new ArrayList<>();
        students.add(new classroom(90,"bala"));
        students.add(new classroom(80, "viknesh"));
        students.add(new classroom(70, "ram"));

        comparewithmarks com1 = new comparewithmarks();
        Collections.sort(students,com1);

        for(classroom s:students){
            System.out.println(s.toString());
        }

    }
}


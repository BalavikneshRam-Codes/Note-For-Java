class student{
    String name;
    int rollno;
}

public class EnchanceForLoop {
    public static void main(String args[]){
        student students[] = new student[3];

        student s1 = new student();
        s1.name = "bala";
        s1.rollno = 29;

        student s2 = new student();
        s2.name = "viknesh";
        s2.rollno = 30;

        student s3 = new student();
        s3.name = "ram";
        s3.rollno =31;

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(student su : students){
            System.out.println(su.name + " : "+su.rollno);
        }
    }
}

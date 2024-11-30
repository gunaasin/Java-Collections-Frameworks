import java.util.ArrayList;
import java.util.Collections;



class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String email;

    public Student() {

    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void setData(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + email;
    }

    @Override
    public int compareTo(Student s2) {
        Integer id1 = this.id;
        Integer id2 = s2.id;
        return id1.compareTo(id2);
    }
}


public class AssginMent3 {
    public static void main(String[] arr){
        Student s1 = new Student(4,"guna","guna@gmail.com");
        Student s2 = new Student(3,"vijay","guna@gmail.com");
        Student s3 = new Student(2,"josh","guna@gmail.com");
        Student s5 = new Student(1,"gosling","guna@gmail.com");
        Student s4 = new Student(7,"tim","guna@gmail.com");

        ArrayList<Student> al= new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s5);
        al.add(s4);

        Collections.sort(al);

        for(Student a :al){
            System.out.println(a);
        }

    }
}

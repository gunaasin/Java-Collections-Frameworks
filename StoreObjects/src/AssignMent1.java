import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String email;
    private int salary;

    public Employee() {}

    public Employee(int id,String name, String email,int salary){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
    }

    public void setData(int id,String name, String email,int salary){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
    }

    public int getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Employee o2){
//       Employee  o1= this;
       Integer eId1 = this.id; // this keyword reffear currently executing object
       Integer eId2 = o2.id;

        return  eId1.compareTo(eId2);
    }

    @Override
    public String toString() {
        return "Employee ID: "+id+", Name: "+name+", Email: "+email+", Salary: "+salary;
    }
}

public class AssignMent1 {
    public static void main(String[] args) {
        Employee guna = new Employee(5,"Guna","guna@gmail.com" ,10000000);
        Employee Gosling = new Employee(2,"Gosling","Gosling@gmail.com" ,2000000000);
        Employee Chorge = new Employee(7,"Chorge","Chorhe@gmail.com" ,5000000);
        Employee Tim = new Employee(3,"Tim","Tim@gmail.com" ,2050000);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(guna);
        al.add(Gosling);
        al.add(Chorge);
        al.add(Tim);

        Collections.sort(al);

        for(Employee e : al){
            System.out.println(e);
        }




    }
}
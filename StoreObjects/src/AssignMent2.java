import java.util.ArrayList;
import java.util.Collections;


class Employee2 implements Comparable<Employee2>{
    private int id;
    private String name;
    private String email;
    private int salary;

    public Employee2() {}

    public Employee2(int id,String name, String email,int salary){
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
    public int compareTo(Employee2 o2){

        String eName1 = this.name;
        String eName2 = o2.name;

        if(eName1.equals(eName1)){
            String eEmail1 = this.email;
            String eEmail2 = o2.email;
            return eEmail1.compareToIgnoreCase(eEmail2);
        }
        return eName1.compareToIgnoreCase(eName2);
    }

    @Override
    public String toString() {
        return "Employee ID: "+id+", Name: "+name+", Email: "+email+", Salary: "+salary;
    }
}

public class AssignMent2 {
    public static  void main(String[] args){
        Employee2 guna = new Employee2(5,"Guna","guna@gmail.com" ,10000000);
        Employee2 guna2 = new Employee2(5,"Guna","Vijay@gmail.com" ,10000000);
        Employee2 Gosling = new Employee2(2,"Gosling","Gosling@gmail.com" ,2000000000);
        Employee2 Chorge = new Employee2(7,"Chorge","Chorhe@gmail.com" ,5000000);
        Employee2 Tim = new Employee2(3,"Tim","Tim@gmail.com" ,2050000);

        ArrayList<Employee2> al = new ArrayList<>();
        al.add(guna);
        al.add(guna2);
        al.add(Gosling);
        al.add(Chorge);
        al.add(Tim);

        Collections.sort(al);

        for(Employee2 e : al){
            System.out.println(e);
        }


    }

}

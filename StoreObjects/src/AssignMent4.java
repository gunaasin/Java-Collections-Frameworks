import java.util.*;

class AssendingFunction implements Comparator<Employees> {
    @Override
    public int compare(Employees e1 , Employees e2){
        Integer id1 = e1.getId();
        Integer id2 = e2.getId();
        return id1.compareTo(id2);
    }
}

class DecendingFunction implements Comparator<Employees>{
    @Override
    public int compare(Employees e1 , Employees e2){
        Integer id1 = e1.getId();
        Integer id2 = e2.getId();
        return -1*id1.compareTo(id2);
    }
}

class OrderByName implements Comparator<Employees>{
    @Override
    public int compare(Employees e1 , Employees e2){
        return e1.getName().compareTo(e2.getName());
    }
}

class HighSalery implements Comparator<Employees>{
    @Override
    public int compare(Employees e1 , Employees e2){
        return -1*Integer.valueOf(e1.getSalary()).compareTo(Integer.valueOf(e2.getSalary())); // dairect boxing
    }
}

class Employees{
    private int id;
    private String name;
    private String email;
    private int salary;

    public Employees() {}

    public Employees(int id,String name, String email,int salary){
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
    public String toString() {
        return id+" "+name+" "+email+" "+salary;
    }
}

public class AssignMent4 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number of employee");
        int n = scan.nextInt();
        scan.nextLine();
        Set<Employees> ts;

        List<Employees> al = new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.println("Enter the informations");
            String info = scan.nextLine();
            String[] arr = info.split(",");
            Employees em = new Employees(Integer.parseInt(arr[0]) , arr[1],arr[2] ,Integer.parseInt(arr[3]) );
            al.add(em);
        }

        AssendingFunction asfn = new AssendingFunction();
        DecendingFunction dsfn = new DecendingFunction();
        OrderByName odr = new OrderByName();
        HighSalery his = new HighSalery();
        Set<Employees> set = null;

        while(true) {
            System.out.println("Sorting :\n 1.Assending Id \n 2.Desending Id \n 3.Oder of Name \n 4.High salary \n Enter other number to exit");
                int input =0;
            try {
                input =scan.nextInt();
            }catch (Exception e){
                System.out.println("you know what is mean my number , number means 0 to 9 . enter that only ");
            }

            if (input == 1) {
                set = new TreeSet<>(asfn);
                set.addAll(al);
            } else if (input == 2) {
                set = new TreeSet<>(dsfn);
                set.addAll(al);
            } else if (input == 3) {
                set = new TreeSet<>(odr);
                set.addAll(al);
            } else if (input == 4) {
                set = new TreeSet<>(his);
                set.addAll(al);
            } else {
                System.exit(0);
            }

            for (Employees e : set) {
                System.out.println(e);
            }
        }
    }
}

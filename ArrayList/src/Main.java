import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        al.add(700);
//        System.out.print(al);  // print all the data inside a arrayList
        al.add(2,777);
//        System.out.print(al);  // add 777 in 2 index , shift and store
        al.remove(0);
//        System.out.print(al);  // remove the data based on the index
        al.set(0,101);
//        System.out.print(al);  // remove a current value and override a new value


        ArrayList all = new ArrayList();
        all.add(10);
        all.add(20);
        all.add(30);
        all.add(40);
//        al.addAll(all);
//        al.retainAll(all); remove all the common data
//        System.out.print(al); // copy the all data and paste the al list tail

//        al.add(5,all);
//        System.out.print(al); // copy the entire list store one index

        all.add(500);
        all.add(600);

//        al.retainAll(all);
//        System.out.print(al); // fetch the common data on both list (Duplicate)

//        System.out.print(al.size()); // get the list size not a length , default length is 10 .

//       It will extend based on the formula --> ( current-length * 3 )              30
//                                               ----------------------  + 1    =  ------ + 1   = 16
//                                                         2                          2


//       System.out.print( al.indexOf(500)); // The method return the data present value

        al.trimToSize(); // trim the extra location in a list

    }
}
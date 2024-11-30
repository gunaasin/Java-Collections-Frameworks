import java.util.Stack;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Vector
//        ts.add("tap");
//        ts.add(20);
//        ts.add(30.5f);
//        ts.add('s');

        ts.add(34);
        ts.add(35);
        ts.add(39);
        ts.add(87);
        ts.add(668);

       System.out.println(ts.ceiling(35));
        System.out.println(ts);
       System.out.println(ts.ceiling(35));
       System.out.println(ts.floor(77));


       System.out.println(ts.headSet(88));
       System.out.println(ts.tailSet(38));
       System.out.println(ts.subSet(38,243));
       System.out.println(ts.higher(39));
       System.out.println(ts.lower(39));


       System.out.println("---------------------------");

       for(int i=0 ;i< ts.size();i++){
           /// it will not work because tree set not have a index
       }


       System.out.println("---------------------------");

       for(Object o : ts){
           System.out.println(o);
       }

       System.out.println("---------------------------");

       Iterator cursor = ts.iterator();
       while(cursor.hasNext()){
           System.out.println(cursor.next());
       }

       System.out.println("---------------------------");

       Iterator cursor2 = ts.descendingIterator();
       while(cursor2.hasNext()){
           System.out.println(cursor2.next());
       }




    }
}
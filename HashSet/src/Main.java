import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10); // duplicate not printed

        System.out.println(hs.size());
        boolean is = hs.contains(10);
        System.out.println(is);

        for(int i : hs){
            System.out.println(i);
        }


        System.out.println("_________________________________");

        Iterator cursor = hs.iterator();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }

        Iterator cursor2 = hs.descendingIterator();
    }
}
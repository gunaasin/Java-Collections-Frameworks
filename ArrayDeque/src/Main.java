import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(19);
        ad.add(39);
        ad.add(17);
        ad.add(14);
        ad.add(14);
        System.out.println(ad);
        ad.push(12);
        System.out.println(ad);
        System.out.println(ad.pop());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        ad.pollLast();
        System.out.println(ad.peekFirst());
        ad.peekLast();

        ad.add(12);
        ad.add(15);
        ad.add(82);



        for(int i=0;i<ad.size();i++){
//            System.out.println(ad.); // dreaditional for loop not work in arrayDeQue , why because arrayDeque dont have a index
        }

        System.out.println("--------------------------");

        for(Object o : ad){
            System.out.println(o);
        }

        System.out.println("--------------------------");

        Iterator cursor = ad.iterator();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }


//        ListIterator cursorTwo = ad.listIterator(); not work in ArrayDeque because ad not have index but --->
        System.out.println("--------------------------"); // it will help to perform desending order
        Iterator cursorThree = ad.descendingIterator();
        while(cursorThree.hasNext()){
            System.out.println(cursorThree.next());
        }



    }
}
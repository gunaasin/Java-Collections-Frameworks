import jdk.jshell.spi.SPIResolutionException;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.add(10);
//        ll.add(20);
//        ll.add(40); // must add a value in aa node
//        ll.offer(50); // first check the ram if the space is there only store
//        other wise not store
//        ll.offerFirst(60);
//        ll.offerLast(70);


//        System.out.print(ll.peekFirst()); // display the fist peek value
//        System.out.print(ll.peekLast()); // display the last peek value

//         in the peek method not delete and show

//        System.out.print(ll.pollFirst()); // display the first value to fetch to display


//        // Stack model FILO LIFO
//        ll.push(10);
//        ll.push(29);
//        ll.push(49);
//        ll.push(56);
//        System.out.print(ll.pop());
//        System.out.println(ll);

// Queue  model FIFO & LILO
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);

        System.out.println(ll);

// DeQueue model add first && add last
        ll.addFirst(233);
        ll.addLast(344);
        ll.add(null);
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        System.out.println(ll);

        for(int i =0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        System.out.println("-----------------------------------");
        for(Object o : ll){
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        Iterator cursor = ll.iterator();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
        System.out.println("-----------------------------------");

        ListIterator cursorlast = ll.listIterator();

        while(cursorlast.hasPrevious()){
            System.out.println(cursorlast.previous());
        }






    }

}
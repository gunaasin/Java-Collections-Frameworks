import java.util.ArrayList;

public class Accable {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300.00);
        al.add(400.0f);
        al.add("tap");
        al.add('t');
        al.add(true);
//        al.add(null);


        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
//        for (Object ob : al) {
//            System.out.println(ob.getClass().getName());
//        }

        System.out.println("--------------------------------------------------");
        for (Object ob : al) {
            System.out.println(ob);
        }

        System.out.println("--------------------------------------------------");




    }
}

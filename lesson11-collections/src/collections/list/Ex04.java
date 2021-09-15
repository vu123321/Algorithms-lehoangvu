package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.Integer.parseInt;

public class Ex04 {
    public static void main(String[] args) {
        List<String>  elements = new ArrayList<>();
        elements.add("Item- 5");
        elements.add("Item- 4");
        elements.add("Item- 1");

        elements.add("Item- 3");
        elements.add("Item- 6");


        // cach tot nhat!!
        elements.removeIf(item -> Integer.parseInt(""+item.charAt(item.length() -1)) <= 3 );
        System.out.println("contain: "+elements.contains("Item  - 5"));

        System.out.println("========================");
        for (String element : elements) {
            System.out.println(element);
        }




        // cach 3
     /*   Predicate<String> pre = new Predicate<String>() {
            @Override
            public boolean test(String item) {
                return Integer.parseInt(""+item.charAt(item.length()-1)) <= 3;

            }
        };

      */


       // toi uu code cach 3
//        Predicate<String> pre = (String item) -> Integer.parseInt(""+item.charAt(item.length() -1)) <= 3;
//
//        elements.removeIf(pre);





        /*for (int i = 0; i < elements.size(); i++) {
            String item = elements.get(i);
            int remainingDays = Integer.parseInt(""+item.charAt(item.length() - 1));

            if (remainingDays <= 3){
                elements.remove(item);
                System.out.println(item);
                i--;
            }
        }*/

        // cach 2:
       /* Iterator<String> iterator =elements.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            int remainingDays = Integer.parseInt(""+item.charAt(item.length() -1));
            if (remainingDays <=3){
                System.out.println("remove element: "+item);
                iterator.remove();
            }
        }

        */
    }
}

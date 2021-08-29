package collections.list;


import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>(8);

        elements.add("le");
        elements.add("hoang");
        elements.add("vu");
        elements.set(1,"can");


        System.out.println(elements.size());
        System.out.println(elements.isEmpty());

        // remove index
        elements.remove(1);

        // remove value
        elements.remove("can");

        // loop

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("elements "+i+" "+elements.get(i));
        }
    }
}

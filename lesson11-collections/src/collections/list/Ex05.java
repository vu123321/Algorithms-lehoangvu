package collections.list;

import utils.CollectionUtils;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        // fixed- size
        List<String> elements = Arrays.asList("a","b","c","d","e");
        List<String> a        = new ArrayList<>();

        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");

//        elements.add("a");
//        elements.add("b");
//        elements.add("c");
//        elements.add("d");
//        elements.add("e");

        System.out.println("random: "+elements.get(new Random().nextInt(elements.size())));

        boolean isExit = elements.contains("b");
        Collections.reverse(elements);
        Collections.shuffle(elements);

        System.out.println("isExit: "+isExit);
        CollectionUtils.printf(elements);
        System.out.println("\n=================");
        CollectionUtils.printf(a);
    }
}

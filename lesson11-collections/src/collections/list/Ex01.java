package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ex01 {
    public static void main(String[] args) {

        List l1 = new ArrayList();// no elements
        List l2 = new LinkedList();
        List l3 = new Stack();
        List l4 = new ArrayList();
        // Using 12
        l1.add(new Integer(10));
        l1.add("le hoang vu");
        l2.add(new Integer(10));

        for (int i = 0; i < l1.size() ; i++) {
            System.out.println(i+": " +l1.get(i));
        }


        System.out.println(System.identityHashCode(l1));
    }
}

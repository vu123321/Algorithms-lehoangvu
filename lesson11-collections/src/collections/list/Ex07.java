package collections.list;

import bean.Item;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
//        List<Item> items = new ArrayList<>();
//        items = getItem();
        Item itemA = new Item(1,2,"A12",12);
        Item itemB = new Item(1,10,"A10",100);

        List<Item> items = getItem();
        System.out.println("itemA exits  :"+items.contains(itemA));
        System.out.println("itemB exits  :"+items.contains(itemB));
    }

    private static List<Item> getItem(){
        List<Item> items = new ArrayList<>();

        Item item1 = new Item(1,10,"A10",100);
        Item item2 = new Item(2,20,"A20",200);
        Item item3 = new Item(3,30,"A30",300);
        Item item4 = new Item(1,12,"A12",120);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        return items;
    }
}

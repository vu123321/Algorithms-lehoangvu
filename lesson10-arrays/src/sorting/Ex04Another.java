package sorting;

import bean.Item;
import utils.ArraysUtils;

public class Ex04Another {
    public static void main(String[] args) {

        Item item1 = new Item(1, "A", 10);
        Item item2 = new Item(2, "G", 20);
        Item item3 = new Item(18, "C ", 30);
        Item item4 = new Item(18, "E ", 66);
        Item item5 = new Item(39, "F ", 18);
        Item item6 = new Item(55, "L ", 44);

        Item[] items = {item1, item2, item3, item4, item5, item6};


        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {

                Item pre = items[j];
                Item next = items[j + 1];

                if (pre.compareTo(next) > 0) {
                    Item item = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = item;
                }
            }
        }

        ArraysUtils.printf(items);

    }
}

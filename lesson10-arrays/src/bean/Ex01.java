package bean;

import bean.Item;

public class Ex01 {
    public static void main(String[] args) {
        // declaration : khai bao .
        int[] i1 = new int[3];
        int[] i2 = {1,5,8,9};
        int[] i3  = new int[] {4,5,7,8,95};
        System.out.println("i1: "+i1.getClass());

        System.out.println(i2[2]);

        System.out.println("===========================");

        String[] s1 = new String[2];
        String[] s2 = {"a","b"};
        String[] s3 = new String[]{"c", "v","b"};
        System.out.println("i1: "+s1.getClass().getSimpleName());

        // for - index
        for (int i = 0; i < s2.length; i++) {
            System.out.println("s[ "+i+" ] = "+s2[i]);

        }
        System.out.println("---------------------");

        // for-each
        int index = 0;
        for (String s : s2
             ) {
            System.out.println("s[ "+index+" ] = "+s);
            index++;
        }

        System.out.println("======================");
        // Item
        Item item1 = new Item(1, "A",20);
        Item item2 = new Item(2,"B",22);
        Item item3 = new Item(3,"C ",30);

        Item[] items = new Item[3];
//        Item[] goods = {new Item(1,"N",55),item2};
        Item[] goods = {item1,item2};
        Item[] things = new Item[]{item1,item2};
        System.out.println("i1: "+items.getClass().getSimpleName());
        System.out.println("i1: "+goods.getClass().getSimpleName());


    }

    private static int[] initNbers(){
//        int[] b = { 1,7,44};
//        return b;
        // or

        return new int[]{1,5,8,7};
    }
}

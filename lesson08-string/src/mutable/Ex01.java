package mutable;

import com.sun.security.jgss.GSSUtil;

public class Ex01 {
    public static void main(String[] args) {
        // Immutable
        String s = "box";
        System.out.println(System.identityHashCode(s));
//        s += "layout";
        System.out.println("================");
        s = reverse(s.concat("Layout"));

        System.out.println(System.identityHashCode(s));
        System.out.println("s: "+s);

        System.out.println("================================");
        // Mutable: StringBuilder, StringBuffer
        // >> StringBuilder
        StringBuilder b = new StringBuilder("Grid");
        // khong the code : StringBuilder b = "Grid " , vi StringBuilder la kieu doi tuong (Objects)
        System.out.println(System.identityHashCode(b));
        b.append("Layout").append("-Manager");
        System.out.println(System.identityHashCode(b));
        System.out.println("b: "+b);



        System.out.println("===================================");
        // >> StringBuffer
        StringBuffer c = new StringBuffer("Grid");
        System.out.println(System.identityHashCode(b));
        c.append("Layout")
          .append("-Manager")
                .reverse();
        System.out.println(System.identityHashCode(b));
        System.out.println("b: "+c) ;


    }
    private static String reverse(String input){
        char[] sequences = input.toCharArray();
        for (int i = 0; i < sequences.length /2; i++) {
            char tmp = sequences[i];
            sequences[i ] = sequences[sequences.length - i - 1 ];
            sequences[sequences.length - i - 1 ] = tmp;
        }
        return String.copyValueOf(sequences);
    }
}

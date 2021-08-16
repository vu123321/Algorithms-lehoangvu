package immutable;

public class Ex04 {
    public static void main(String[] args) {
        String s1 = "abcdefghjk";
        String s2 = "abc";
        String s3 = "b";

        System.out.println("== : "+(s1 == s2));//
        System.out.println("equals: "+(s1.equals(s2)));
        System.out.println("compareTo:"+(s1.compareTo(s2)));
        System.out.println("s1.compareTo(s3): "+(s1.compareToIgnoreCase(s3)));
        System.out.println("s1.equalsIgnoreCase(s3): "+(s1.equalsIgnoreCase(s3)));
        System.out.println("(s1.compareTo(s3):"+(s1.compareTo(s3)));

        byte unicode =  'a';
        byte unicodeA =  'A';

        System.out.println("unicode: "+unicode);// 97
        System.out.println("unicodeA : "+unicodeA);// 65


    }
}

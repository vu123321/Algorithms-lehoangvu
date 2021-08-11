package immutable;

public class Ex01 {
    public static void main(String[] args) {

        // Literal vs object

        // literal : heap(constant-pool)
        String l1 = "Hello";
        String l2 = "Welcome";
        String l3 = "Hello";

        hash("l1",l1);
        hash("l2",l2);

        hash("l3",l3);
        System.out.println("=============================");

        // deprecated : khong dung nua .
        // warning : cause performance : nguyen nhan khong hieu suat
        // object : heap(nor mal)
        String o1 = new String("Hello");
        String o2 = new String("Hello");
        String o3 = new String("welcome");

        hash("o1",o1);
        hash("o2",o2);
        hash("o3",o3);


    }
    private static void hash(String text, String input){
        System.out.println(text+ ":"+System.identityHashCode(input));
    }
}

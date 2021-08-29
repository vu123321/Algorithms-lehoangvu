package generic;

public class Ex03 {
    public static void main(String[] args) {
        IList<String> sequences = new JavaList<>();
        sequences.add("how are you ");
        sequences.add("enjoy our page ");
        sequences.add("stay safe and take care! ");
        sequences.add("how are you ");
        sequences.add("enjoy our page ");
        sequences.add("how safe and take care! ");


        sequences.Show();
        System.out.println("size: "+sequences.size());

//        Condition<String> cond = new Condition<String>() {
//            @Override
//            public boolean test(String e) {
//                return e.startsWith("enjoys:");
//            }
//        };


        System.out.println("" + "\ncount: "+sequences.count( e  -> e.startsWith("how")));
    }
}

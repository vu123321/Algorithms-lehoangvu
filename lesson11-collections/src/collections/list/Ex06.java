package collections.list;



import java.util.List;

import static utils.CollectionUtils.*;

public class Ex06 {
    public static void main(String[] args) {
        // list co the mang gia tri trung nhau .
        List<Integer> first = init(1,2,3,4);
        List<Integer> second = init(4,5,6,7);

        // removeAll lay hieu

//        first.addAll(second);
//        second.addAll(2,first);

        // addAll : hop
        // removeAll : giao
        // retainAll : remove hieu


        show(first);
        show(second);

    }
}

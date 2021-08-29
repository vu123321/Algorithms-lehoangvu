package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionUtils {
    private CollectionUtils() {

    }
    // ... is variable :
    public static List<Integer> init(Integer... elements) {
        List<Integer> result = new ArrayList<>();

        result.addAll(Arrays.asList(elements));

        return result;
    }
    // ? willcard
    // var : khi define

    // 1
    public static void printf(List<String> elements) {
        for (String element : elements) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    // 2

    public static void show(List<Integer> elements) {
        for (Integer element : elements) {
            System.out.print(element+" ");
        }
        System.out.println();

        // 1 va 2 khong phai la overriding List<tham so>

    }
}

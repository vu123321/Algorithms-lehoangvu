package demo;

import bean.Apple;
import functional.BuFunctional;
import functional.BiFunction;

import java.util.function.Supplier;

public class Ex05 {
    public static void main(String[] args) {
        // Constructor reference >> Type reference
        // Empty constructor () -> new Apple() = Apple :: new

        Supplier<Apple> supplier = Apple :: new;
        Apple apple  = supplier.get();
        System.out.println(apple);

        // Full constructor
        BuFunctional<Apple,Integer,String,Double,String> buFunctional = Apple :: new ;

         Apple a2 = buFunctional.get(1,"black",12d,"VietNam");

        System.out.println(a2);
        System.out.println("----------------");
        BiFunction<Apple, Integer, String> BiFunction = Apple :: new;
        Apple a1 = BiFunction.get(3,"Lao");
        System.out.println(a1);

    }
}

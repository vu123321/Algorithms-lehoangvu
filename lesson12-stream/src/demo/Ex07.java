package demo;

import bean.Dish;
import utils.DishUtils;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {

        // Stream is sequence of elements from SOURCE helps 
        List<Dish> menu = DishUtils.getAll();
        
        menu.stream()
                .filter(dish -> {
                    return Dish.Kind.MEAT.equals(dish.getName());
                })
                .map(dish -> {
                    return  dish.getName();
                }).count();
        System.out.println("==========================");
    }
}

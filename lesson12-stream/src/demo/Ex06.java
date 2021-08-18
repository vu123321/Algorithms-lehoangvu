package demo;


import bean.Trader;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ex06 {
    public static void main(String[] args) {
        List<String> lines = FileUtils.reaLines("/home/dell/algorithms-lhv/Algorithms-lehoangvu/lesson12-stream/trader.txt");

//        lines.forEach(System.out::println);
//
//        List<Trader> traders = new ArrayList<>();
//        for (String line: lines
//             ) {
//            String[] tokens = line.split("-");
//            if (tokens.length == 2){
//                Trader trader = new Trader(tokens[0],tokens[1] );
//                traders.add(trader);
//            }
//        }
//        traders.forEach(System.out :: println);
//    }
//}

        List<Trader> traders  = convert(lines, Trader::transfer);
        List<Trader> traders2 = convert(lines, Trader::new);

        traders.forEach(System.out::println);
        System.out.println("=================");
        traders2.forEach(System.out::println);
    }

    private static <T> List<T> convert(List<String>lines, Function<String, T> function){
        List<T> result=new ArrayList<T>();
        for(String line:lines) {
            T t =function.apply(line);
            if( t !=null) {
                result.add(t);
            }
        }
        return result;
    }
}
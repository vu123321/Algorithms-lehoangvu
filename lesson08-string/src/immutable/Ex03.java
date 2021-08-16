package immutable;

public class Ex03 {
    public static void main(String[] args) {
        // split string
        // delimiter : -
        String tokens = "a12-c23-c34";
        String[] elements = tokens.split("-");
        System.out.println("length: "+elements.length);
        iterate(elements);




        System.out.println("=======================");
        // delimiter : , \\s  string parsing (nhom lai)
        String hobbies = "music,                badminton, book, game, code";

        String[] hobbyArray = hobbies.split("[\\s,-.]+");
        iterate(hobbyArray);

    }

    private static void iterate(String[] elements){

        for (String element : elements
        ) {
            System.out.println(element+" ");
        }
    }
}

package immutable;

import bean.Student;

public class Ex05 {
    public static void main(String[] args) {

        // String File
        String[] lines = {"120130, Adam Ton, 7.9","125635, Kate Hence , 8.2"};

        // Java objects
        for (String line : lines
             ) {
            String[] tokens = line.split(", ");// tokens : ma thong bao .
            Student student = new Student(tokens[0],tokens[1],Double.parseDouble(tokens[2]));

            System.out.println(student);
        }

        // Find valid numbers in the text below

        String text = "ab123d8rrrrrr7e012f";

        // d stands for digit
        // D = not d

        String[] numbers = text.split("[a-z]+");
        System.out.println("length: "+numbers.length);
        for (String number: numbers
             ) {
            if (!number.isEmpty()) {
                System.out.println(number);
            }
        }
    }
}

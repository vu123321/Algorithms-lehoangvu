package sorting;

import utils.ArraysUtils;

public class Ex02 {
    public static void main(String[] args) {
        String[] sequences = {"A","b","D","a","B"};

        for (int i = 0; i < sequences.length; i++) {
            for (int j = 0; j < sequences.length - i -1; j++) {
                if (sequences[j].compareTo(sequences[j + 1]) > 0){
                    String tmp = sequences[j];
                    sequences[j] = sequences[j + 1];
                    sequences[j + 1] = tmp;
                }
            }
        }
        for (String sequence: sequences
             ) {
            System.out.print(sequence+" ");
        }
    }
}

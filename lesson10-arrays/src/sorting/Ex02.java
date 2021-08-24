package sorting;


import utils.ArraysUtils;

public class Ex02 {
    public static void main(String[] args) {
        String[] sequences = {"A",null,"b","D","a","B",null};
            // previous : (phan tu truoc ) : sequences[j]
            // next     : sequences[j + 1]
        for (int i = 0; i < sequences.length; i++) {
            for (int j = 0; j < sequences.length - i -1; j++) {

                // null first >> null  null A B D a b
                if (sequences[j] == null ){
                    continue;
                }

                // previous != null
//                if (sequences[j + 1 ] == null){
//                    String tmp = sequences[j];
//                    sequences[j] = sequences[j + 1];
//                    sequences[j + 1] = tmp;
//                    continue;
//                }

                // previous != null
                // next     != null

                if (sequences[j + 1 ] == null || sequences[j].compareTo(sequences[j + 1]) > 0){
                    String tmp = sequences[j];
                    sequences[j] = sequences[j + 1];
                    sequences[j + 1] = tmp;
                }
            }
        }
        ArraysUtils.printf(sequences);

    }
}

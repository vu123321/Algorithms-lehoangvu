package declaration;

import bean.Dimension;

public class Ex03 {
    public static void main(String[] args) {
        // 1 d
        int[] d1 = {1,2,4};

        // 2d
        int[][] d21 = new int[3][4];
        int[][] d22 = {{1,2,3,4},{ 1,5,6,7},{7,8,22,33}};

        for (int row = 0; row < d22.length;row++){
            for (int col = 0; col < d22[row].length ; col++) {
                System.out.print(d22[row][col]+" ");
            }
            System.out.println();
        }

        // duyet mang 2 chieu dung class
        Dimension[] dims = {new Dimension(1,2,3,4),
                            new Dimension(1,2,3,4),
                            new Dimension(1,2,3,4),
                            new Dimension(1,2,3,4)};

        for (Dimension dim: dims
             ) {
            System.out.println(dim);
        }
        // 3d
        int[][][] d31 = new int[3][4][5];
        int[][][] d32 ={{{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                        {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                        {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}}};

    }
}

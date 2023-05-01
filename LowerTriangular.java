public class LowerTriangular {
    public static void main(String[] args) {
        /*
         LowerTriangular
         1 2 3          1 0 0
         8 6 4    =>    8 6 0
         4 5 6          4 5 6

         */
        int a[][] = {
                {1, 2, 3, 8},
                {8, 6, 4, 9},
                {4, 5, 6, 5},
                {3, 5, 6, 3}
        };

        if(a.length != a[0].length){
            System.out.println("This is not a square matrix");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i < j) {
                    a[i][j] = 0;
                }
            }
        }

        //print
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

    }

}

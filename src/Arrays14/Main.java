package Arrays14;

public class Main {
        public static void main(String[] args) {
            int array[][] = {
                    {2, 8, 1, 3},
                    {6, 1, 4, 1},
                    {4, 5, 2, 5},
                    {9, 3, 6, 8},
            };
            int i, j;
            {
            for (i = 0; i <4; i++) {
              for (j = 0+i; j < 4; j++) {
               System.out.print(array[i][j] + " ");
          }
                 System.out.println();
       }
     }
  }
}

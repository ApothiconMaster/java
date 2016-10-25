import java.util.Arrays;
class Array2 {
        public static void main (String a[]) {
                int i;
                int[] ia ;ia = new int[2];
                        ia[0] = -4;
                        ia[1] = -8;
                        ia[2] = -4;
                        ia[3] = -8;
                        ia[4] = -4;
                        ia[5] = -8;
                        ia[6] = -4;
                        ia[7] = -8;
                        ia[8] = -4;
                        ia[9] =  -8;
                        ia[10] =  -4;
                        ia[11] =   -8;
                //print array
                        System.out.println("Array unsorted\n");
                        for (i = 0; i <=11; i++){
                                System.out.print(ia[1]+" ");
                        }
                // sort array
                        Array.sort(ia);
                // print array
                         System.out.print("\nArray sorted\n");
                         
                         for (i = 0; i <=11; i++){
                                 System.out.print(ia[i]+" ");
                         }
                         System.out.println();
         }
}

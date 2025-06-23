public class Sudoku {
    public static void main(String[] args) {
//        int n[][] = {
//            {5,3,4,6,7,8,9,1,2},
//            {6,7,2,1,9,5,3,4,8},
//            {1,9,8,3,4,2,5,6,7},
//            {8,5,9,7,6,1,4,2,3},
//            {4,2,6,8,5,3,7,9,1}, 
//            {7,1,3,9,2,4,8,5,6}, 
//            {9,6,1,5,3,7,2,8,4},
//            {2,8,7,4,1,9,6,3,5}, 
//            {3,4,5,2,8,6,1,7,9}, 
//        };

        int[][] n = {
            {5,3,4,6,7,5,9,1,2},
            {6,7,2,1,9,5,6,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,9,1,4,2,3},
            {4,2,6,8,4,3,7,9,1},
            {5,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,8,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}
        };//low over
//        int[][] n = {
//            {5,3,4,6,7,8,9,1,2},
//            {6,7,2,1,9,5,3,4,8},
//            {1,9,8,3,4,2,5,6,7},
//            {8,5,9,7,6,1,4,2,3},
//            {4,2,6,8,5,3,7,9,1}, 
//            {7,1,3,9,2,4,8,5,6}, 
//            {9,6,1,5,3,7,2,8,4},
//            {2,8,7,4,1,9,6,3,5}, 
//            {3,4,5,2,8,6,1,7,9},
//        };//column over
        
 


        int[] arr = new int[8];
        System.out.println("Sudoku :");
//        for( int i = 0; i < n.length; i++){
//            for(int j = 0; j < n[0].length; j++){
//                System.out.print(n[i][j]+" ");
//            };
//            System.out.println("");
//        };
//        //print
//        for( int i = 0; i < n.length; i++){
////            System.out.print("i="+i+"\n");
//            for(int j = 0; j < n[0].length; j++){
////                System.out.print("J="+j+"\n");
//                System.out.print("N["+i+"]["+j+"]="+n[i][j]+" ");
//            }//end for j 
//            System.out.print("\n");
//        }//end for i
        
        //row
        System.out.println("\nCheck row:");
        boolean hasDuplicaterow = false;
        for (int i = 0; i < n.length; i++) {
            boolean[] check = new boolean[10]; // index 1–9, ขนาด 10 พอดี  
//            System.out.print("i="+i+"\n");
            

            for (int j = 0; j < n[0].length; j++) {
//                System.out.print(n[i][j]+" ");
                int value = n[i][j];
                if (check[value]) {
                    hasDuplicaterow = true;
                    System.out.println("Sudoku It game Over");
//                    System.out.println("❌ Duplicate number " + value + " found in row " + i);
                    return;
                }
                check[value] = true;
            }//end for j
        }//end for i
        if (!hasDuplicaterow) {
                System.out.println("✅");
        }//end if
        
        //Column
        System.out.println("\nCheck Column:");
        boolean hasDuplicateColumn = false;
        for (int j2 = 0; j2 < n[0].length; j2++) {
            boolean[] check2 = new boolean[10]; 
//            System.out.print("i="+i+"\n");
            

            for (int i2 = 0; i2 < n.length; i2++) {
//                System.out.print(n[i2][j2]+" \n");
                int value = n[i2][j2];
                if (check2[value]) {
                    hasDuplicateColumn = true;
                    System.out.println("Sudoku It game Over");
                    return;
                }
                check2[value] = true;
            }//end for j
        }//end for i
        if (!hasDuplicateColumn) {
                System.out.println("✅");
        }//end if

        
        
        
    }//end main    
}//end Sudoku

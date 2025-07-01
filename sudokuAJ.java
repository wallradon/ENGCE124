public class sudokuAJ {
    public static void main(String[] args) {
        int array4D[][][][]= {
            {{{5, 3, 4}, {6, 7, 2}, {1, 9, 8}},
            {{6, 7, 8}, {1, 9, 5}, {3, 4, 2}},
            {{9, 1, 2}, {3, 4, 8}, {5, 6, 7}}},

            {{{8, 5, 9}, {4, 2, 6}, {7, 3, 1}}, //3 to 1
            {{7, 6, 1}, {8, 5, 3}, {9, 2, 4}},
            {{4, 2, 3}, {7, 9, 1}, {8, 5, 6}}}, //6 to 1

            {{{9, 6, 1}, {2, 8, 7}, {3, 4, 5}}, 
            {{5, 3, 7}, {4, 1, 9}, {2, 8, 6}},
            {{2, 8, 4}, {6, 3, 5}, {1, 7, 9}}}
        } ;
    
        int boxpass = 0, rowpass = 0 ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (chackbox(array4D, i, j)) {
                    boxpass++ ; 
                }
            }
        }
        System.out.println("Total passed boxes: " + boxpass + " / 9");

        for( int r = 0 ; r < 3 ; r++ ){
            rowpass += printRow(array4D, r) ;
        }
        System.out.println("Total passed rowes: " + rowpass + " / 9");
       
        if(boxpass == 9 && rowpass == 9) {
            System.out.println("Game finisssssssssssssss") ;
        }else{
            System.out.println("Game Error");
        }
        
    }//end main

    static void printbox( int n[][][][], int rb, int cb ){ 
        for(int i=0 ; i<n[rb][cb].length ; i++ ) {
            for(int j = 0; j<n[rb][cb][0].length ; j++) {
                if (j != 2) {
                    System.out.print(n[rb][cb][i][j]);
                }else if( j == 2  ){
                    System.out.println(n[rb][cb][i][j]);
                }
            }//end for j
        }//end for i
    }//end printbox

    static boolean chackbox(int n[][][][], int rb, int cb){
        boolean hasDuplicaterow = false ;
        boolean[] check = new boolean[10] ;
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                int value = n[rb][cb][i][j] ;
                if (check[value]) {
                    hasDuplicaterow = true ;
                    System.out.println("Block[" + (rb+1) + "][" + (cb+1) + "] has duplicate value: " + value) ;
                }
                check[value] = true;
            }//end if j
        }//end if i

        if (!hasDuplicaterow) {
            return true ;  
        } else {
            return false ; 
        }
    }
    
    static int printRow(int n[][][][], int r ) {   
        int result = 0 ;
        for( int rs = 0 ; rs < 3 ; rs++ ) {

            int[] row = new int[9] ;
            int index = 0 ;

            for( int i = 0 ; i<n[r].length ; i++ ) {

                for( int j = 0 ; j<n[r][i].length ; j++ ) {

                    int value = n[r][i][rs][j] ;
                    row[index++] = value ;
                    // System.out.print("index = "+index) ;
                    // System.out.print(" i = "+i) ;
                    // System.out.println(" j = "+j) ;
                }//end for j
            }//end for i

            // for(int i = 0 ; i < row.length ; i++ ) {
            //     int num_row = row[i] ;
            //     System.out.print( num_row+" ");
            // }

            boolean[] check = new boolean[10];
            boolean hasDuplicate = false;
            for (int v : row) {
                if (check[v]) {
                    hasDuplicate = true;
                    break;
                }
                check[v] = true;
            }
    
            if (!hasDuplicate) {
                result++ ; 
            }
        }//end for rs
                
        return result ;
    }//end function

}//end class

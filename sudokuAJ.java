public class sudokuAJ {
    public static void main(String[] args) {

        int[][][][] array4D = {
            {
                { {5,3,4}, {6,7,2}, {1,9,8} } ,  // block (0,0)
                { {6,7,8}, {1,9,5}, {3,4,2} } ,  // block (0,1)
                { {9,1,2}, {3,4,8}, {5,6,7} }   // block (0,2)
            },
            {
                { {8,5,9}, {4,2,6}, {7,1,3} } ,  // block (1,0)
                { {7,6,1}, {8,5,3}, {9,2,4} } ,  // block (1,1)
                { {4,2,3}, {7,9,1}, {8,5,6} }   // block (1,2)
            },
            {
                { {9,6,1}, {2,8,7}, {3,4,5} },  // block (2,0)
                { {5,3,7}, {4,1,9}, {2,8,6} },  // block (2,1)
                { {2,8,4}, {6,3,5}, {1,7,9} }   // block (2,2)
            }
        } ;
        
        int boxpass = 0, rowpass = 0, colpass = 0 ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (chackbox(array4D, i, j)) {
                    boxpass++ ; 
                } //end if
            }//end for
        }//end for
        System.out.println( "Total passed boxes: " + boxpass + " / 9" ) ;

        for( int r = 0 ; r < 3 ; r++ ) {
            rowpass += chackRow( array4D, r ) ;
        }//end for
        System.out.println( "Total passed rowes: " + rowpass + " / 9" ) ;
       
        for( int c = 0 ; c < 9 ; c++ ){
            colpass += checkCol(array4D, c) ;
        }//end for
        System.out.println("Total passed Cols: " + colpass + " / 9") ;
        
        if(boxpass == 9 && rowpass == 9 && colpass == 9 ) {
            System.out.println("Game finisssssssssssssss") ;
        } else {
            System.out.println( "Game Error" ) ;
        }//end if
        
    }//end main

    static boolean chackbox(int n[][][][], int rb, int cb){
        boolean hasDuplicaterow = false ;
        boolean[] check = new boolean[10] ;
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                // System.out.println("rb = ["+rb+"],cb = ["+cb+"], i = ["+i+"], j = ["+j+"]") ;
                int value = n[rb][cb][i][j] ;
                if (check[value]) {
                    hasDuplicaterow = true ;
                }
                check[value] = true;
            }//end if j
        }//end if i

        if (!hasDuplicaterow) {
            return true ;  
        } else {
            return false ; 
        }//end if
    }//end function
    
    static int chackRow(int n[][][][], int r ) {   
        int count = 0 ;
        for( int rs = 0 ; rs < 3 ; rs++ ) {

            int[] row = new int[9] ;
            int index = 0 ;

            for( int i = 0 ; i<n[r].length ; i++ ) {

                for( int j = 0 ; j<n[r][i].length ; j++ ) {
                    // System.out.println("r = ["+r+"],i = ["+i+"], rs = ["+rs+"], j = ["+j+"]") ;
                    int value = n[r][i][rs][j] ;
                    row[index++] = value ;

                }//end for j

            }//end for i
            count += check_rb(row) ; 
        }//end for rs
        return count ;
        
    }//end function

    static int checkCol(int[][][][] n, int c) {
        int[] col = new int[9] ;  // เก็บค่าทั้งคอลัมน์แนวนอน
        int blockCol = c / 3 ;    
        int cellCol = c % 3 ;     
        int index = 0 ;
    
        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int cellRow = 0; cellRow < 3; cellRow++) {
                // System.out.println("blockRow = ["+blockRow+"],blockCol = ["+blockCol+"], cellRow = ["+cellRow+"], cellCol = ["+cellCol+"]") ;
                col[index++] = n[blockRow][blockCol][cellRow][cellCol];
            }//end for
        }//end for
        return check_rb(col) ;  
    }//end function
    
    static int check_rb(int[] number) {
        boolean[] check = new boolean[10] ; 
        boolean hasDuplicate = false ;

        for ( int i = 0; i < number.length; i++ ) {
            int v = number[i] ;
            if ( v < 1 || v > 9 || check[v] ) {
                hasDuplicate = true ;
            }//end if
            check[v] = true ;
        }//end for
        
        if (hasDuplicate) {
            return 0 ;
        } else {
            return 1 ;
        }//end if
        
    }//end function
    
}//end class
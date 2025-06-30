public class sudokuAJ {
    public static void main(String[] args) {
        int array4D[][][][]= {
            {{{5, 3, 4}, {6, 7, 2}, {1, 9, 8}},
            {{6, 7, 8}, {1, 9, 5}, {3, 4, 2}},
            {{9, 1, 2}, {3, 4, 8}, {5, 6, 7}}},

            {{{8, 5, 9}, {4, 2, 6}, {7, 3, 1}}, //3 to 1
            {{7, 6, 1}, {8, 5, 3}, {9, 2, 4}},
            {{4, 2, 3}, {7, 9, 1}, {8, 5, 6}}},

            {{{9, 6, 1}, {2, 8, 7}, {3, 4, 5}}, 
            {{5, 3, 7}, {4, 1, 9}, {2, 8, 6}},
            {{2, 8, 4}, {6, 3, 5}, {1, 7, 9}}}
        } ;
        //  int boxpass = 0 ;
        // for(int i = 0; i<3; i++) {
        //     for(int j = 0; j<3; j++) {
        //         // printbox( array4D, i, j);
        //         chackbox(array4D, i, j);
        //     }   
        // }
        int boxpass = 0 ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (chackbox(array4D, i, j)) {
                    boxpass++; // ✅ นับเฉพาะกล่องที่ผ่าน
                }
            }
        }
        System.out.println("Total passed boxes: " + boxpass + " / 9");

        printRow(array4D, 0 ) ;
        
    }

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
        boolean hasDuplicaterow = false;
        boolean[] check = new boolean[10];
        int checks = 0 ;
        // System.out.println("Box["+rb+"]["+cb+"]");
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
        // if (!hasDuplicaterow) {
        //     checks = 1 ;
        //     System.out.println("Pass");
        // }//end if
        if (!hasDuplicaterow) {
            // System.out.println("Pass");
            return true ;  
        } else {
            return false ; 
        }
    }
    
    static void printRow(int n[][][][], int r ) {
        for(int i = 0; i<n[r].length; i++) {

            for(int j = 0 ; j<n[r][i].length; j++) {

                System.out.print(n[r][i][1][j]) ;
                System.out.print(" ") ;

            }

        }
    }

}

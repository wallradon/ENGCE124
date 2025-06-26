public class AddSudokuTo4D {
    public static void main(String[] args) {
        int[][][][] array4D = new int[3][3][3][3];  //[brกล่องแนวนอน][bcกล่องแนวตั้ง][irของแนวนอน][icของแนวตั้ง]

        // Block [0][0]
        array4D[0][0][0][0] = 5;  array4D[0][0][0][1] = 3;  array4D[0][0][0][2] = 4;
        array4D[0][0][1][0] = 6;  array4D[0][0][1][1] = 7;  array4D[0][0][1][2] = 2;
        array4D[0][0][2][0] = 1;  array4D[0][0][2][1] = 9;  array4D[0][0][2][2] = 8;

        // Block [0][1]
        array4D[0][1][0][0] = 6;  array4D[0][1][0][1] = 7;  array4D[0][1][0][2] = 8;
        array4D[0][1][1][0] = 1;  array4D[0][1][1][1] = 9;  array4D[0][1][1][2] = 5;
        array4D[0][1][2][0] = 3;  array4D[0][1][2][1] = 4;  array4D[0][1][2][2] = 2;

        // Block [0][2]
        array4D[0][2][0][0] = 9;  array4D[0][2][0][1] = 1;  array4D[0][2][0][2] = 2;
        array4D[0][2][1][0] = 3;  array4D[0][2][1][1] = 4;  array4D[0][2][1][2] = 8;
        array4D[0][2][2][0] = 5;  array4D[0][2][2][1] = 6;  array4D[0][2][2][2] = 7;

        // Block [1][0]
        array4D[1][0][0][0] = 8;  array4D[1][0][0][1] = 5;  array4D[1][0][0][2] = 9;
        array4D[1][0][1][0] = 4;  array4D[1][0][1][1] = 2;  array4D[1][0][1][2] = 6;
        array4D[1][0][2][0] = 7;  array4D[1][0][2][1] = 1;  array4D[1][0][2][2] = 3;

        // Block [1][1]
        array4D[1][1][0][0] = 7;  array4D[1][1][0][1] = 6;  array4D[1][1][0][2] = 1;
        array4D[1][1][1][0] = 8;  array4D[1][1][1][1] = 5;  array4D[1][1][1][2] = 3;
        array4D[1][1][2][0] = 9;  array4D[1][1][2][1] = 2;  array4D[1][1][2][2] = 4;

        // Block [1][2]
        array4D[1][2][0][0] = 4;  array4D[1][2][0][1] = 2;  array4D[1][2][0][2] = 3;
        array4D[1][2][1][0] = 7;  array4D[1][2][1][1] = 9;  array4D[1][2][1][2] = 1;
        array4D[1][2][2][0] = 8;  array4D[1][2][2][1] = 5;  array4D[1][2][2][2] = 6;

        // Block [2][0]
        array4D[2][0][0][0] = 9;  array4D[2][0][0][1] = 6;  array4D[2][0][0][2] = 1;
        array4D[2][0][1][0] = 2;  array4D[2][0][1][1] = 8;  array4D[2][0][1][2] = 7;
        array4D[2][0][2][0] = 3;  array4D[2][0][2][1] = 4;  array4D[2][0][2][2] = 5;

        // Block [2][1]
        array4D[2][1][0][0] = 5;  array4D[2][1][0][1] = 3;  array4D[2][1][0][2] = 7;
        array4D[2][1][1][0] = 4;  array4D[2][1][1][1] = 1;  array4D[2][1][1][2] = 9;
        array4D[2][1][2][0] = 2;  array4D[2][1][2][1] = 5;  array4D[2][1][2][2] = 6;

        // Block [2][2]
        array4D[2][2][0][0] = 2;  array4D[2][2][0][1] = 8;  array4D[2][2][0][2] = 4;
        array4D[2][2][1][0] = 6;  array4D[2][2][1][1] = 3;  array4D[2][2][1][2] = 5;
        array4D[2][2][2][0] = 1;  array4D[2][2][2][1] = 7;  array4D[2][2][2][2] = 9;
    
        // for ( int br = 0 ; br < 3 ; br++ ) { //0-2
        //     for ( int bc = 0 ; bc < 3 ; bc++ ) { //0-2
        //         System.out.println("Block [" + br + "][" + bc + "]:");
        //         for (int ir = 0 ; ir < 3 ; ir++) {
        //             for (int ic = 0 ; ic < 3 ; ic++) {
        //                 // System.out.println("4D: [" + br + "][" + bc + "][" + ir + "][" + ic + "]");
        //                 System.out.print(array4D[br][bc][ir][ic] + " ");
        //             }
        //             System.out.println();
        //         }
        //         System.out.println();
        //     }
        // }

                
        System.out.println("------------------");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------------------");
            }

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("|");
                }

                // คำนวณ index สำหรับ 4D
                int br = i / 3;
                int bc = j / 3;
                int ir = i % 3;
                int ic = j % 3;

                System.out.print(array4D[br][bc][ir][ic] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        

        //box3x3
        System.out.println("\nCheck Box:") ;
        boolean hasDuplicaterow = false;
        for ( int br = 0 ; br < 3 ; br++ ) { 
            for ( int bc = 0 ; bc < 3 ; bc++ ) {
                boolean[] check = new boolean[10];      
                for (int ir = 0 ; ir < 3 ; ir++) {
                    for (int ic = 0 ; ic < 3 ; ic++) {
                        int value = array4D[br][bc][ir][ic] ;
                        if (check[value]) {
                            hasDuplicaterow = true;
                            System.out.println("Block[" + (br+1) + "][" + (bc+1) + "] has duplicate value: " + value) ;
                        }
                        check[value] = true;
                    }//end if ic
                }//end if ir
            }//end if bc
        }//end if br
        if (!hasDuplicaterow) {
            System.out.println("Pass");
        }//end if

        int[][] sudoku = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int br = i / 3 ;
                int bc = j / 3 ; 
                int ir = i % 3 ;
                int ic = j % 3 ;
                sudoku[i][j] = array4D[br][bc][ir][ic] ;
            }//end for j
        }//end for i

        //row
        System.out.println("\nCheck row:");
        boolean hasDuplicaterow2d = false;
        for (int i = 0; i < sudoku.length; i++) {
            boolean[] check = new boolean[10];             
            for (int j = 0; j < sudoku[0].length; j++) {
                int value = sudoku[i][j];
                if (check[value]) {
                    hasDuplicaterow2d = true;
                    System.out.print("Duplicate In ");
                    System.out.println("Row[" + (i+1) + "] has duplicate value: " + value) ;
                }
                check[value] = true;
            }//end for j
        }//end for i
        if (!hasDuplicaterow2d) {
                System.out.println("Pass");
        }//end if
        
        //Column
        System.out.println("\nCheck Column:");
        boolean hasDuplicateColumn2d = false;
        for (int j2 = 0; j2 < sudoku[0].length; j2++) {
            boolean[] check2 = new boolean[10]; 
            for (int i2 = 0; i2 < sudoku.length; i2++) {
                int value = sudoku[i2][j2];
                if (check2[value]) {
                    hasDuplicateColumn2d = true;
                    System.out.print("Duplicate In ");
                    System.out.println("Column[" + (j2+1) + "] has duplicate value: " + value) ;

                }
                check2[value] = true;
            }//end for j
        }//end for i
        if (!hasDuplicateColumn2d) {
                System.out.println("Pass");
        }//end if

        








    }//end main

}//end class

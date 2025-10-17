public class Selection {
    public static void main(String[] args) {
        show sh = new show() ;
        int a[] = { 89, 45, 68, 90, 29, 3, 107 } ;
        int min = 0 ;
        int n = a.length ;
        for( int i = 0 ; i <= (n-2) ; i++ ) {
            min = i ;
            for (int j = (i + 1); j <= n - 1; j++) {
                if (a[j] < a[min]) {
                    min = j ;
                } // end if
            } // end for
            int temp = a[i] ;
            a[i] = a[min] ;
            a[min] = temp ;
            sh.show_all(a) ;
        }// end for
    }//end main
}// end class

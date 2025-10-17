public class Insertion {

    public static void main(String[] args) {
        show sh = new show() ;
        int a[] = { 89, 45, 68, 90, 29, 3, 107 } ;
        int n = a.length ;
        int v, j ;

        for(int i = 1; i <= (n - 1) ; i++ ) {
            v = a[i] ;
            j = i - 1 ; 
            while( j >= 0 && a[ j ] > v ) {
                a[ j + 1 ] = a[ j ] ;
                j = j - 1 ;
            }
            a[ j + 1 ] = v ;
            System.out.println("i = " + i ) ;
            sh.show_all(a);
        }
    }
}
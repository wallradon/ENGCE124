public class bubble {
    public static void main(String[] args) {
        show sh = new show() ;
        int arr[] = {89, 45, 68, 90, 29, 3, 107 } ;
        int count = arr.length ;
        System.out.println("arr = " + count ) ;
        sh.show_all(arr) ;

        for( int i = 0 ; i <= (count - 2) ; i++ ){
            System.out.println("\n  i = " + i + "\n--------------\n" ) ;

            for( int j = 0 ; j <= (count - 2 - i) ; j++ ){
                if( arr[j+1] < arr[j]){
                    System.out.println( arr[j+1] + " < " + arr[j] + " | " + (j+1) + " < " + j ) ;
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[ j + 1 ] = temp ;
                    show(arr) ;
                }
            }
        }
        
    } 
    
}

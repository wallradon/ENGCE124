public class DStack {
    int count ;
    DNode top, temp ;
    
    void push( int item) {
        DNode newnode = new DNode() ;
        newnode.info = item ;
        if ( count == 0 ) {
            top = newnode ;
        }else{
            top.Rlink = newnode ;
            newnode.Llink = top ;
            top = top.Rlink ;
        }
        count++ ;
    }//end push

    DNode pop() {
        if (!isEmpty()) {
            if ( size() == 1 ) {
                temp = top;
                top = null ;
            } else{
                temp = top ;
                top = top.Llink ;
                top.Rlink = null ; 
                temp.Llink = null ;
            }
            count-- ;
        }else{
            System.out.println("stack is Empty");
            temp.info = -1 ;
        }   
        return temp ;     
    }

    boolean isEmpty(){ return count == 0 ; }
    int size(){ return count ; } // วัดsize
    
    static int PrecOperatorinput( char operators ){
        if ( operators == '^' ) {
            return 4 ;
        }else if (operators == '*' || operators == '%' || operators == '/'  ) {
            return 2 ;
        }else if (operators == '+' || operators == '-') {
            return 1;
        }else{
            return -1 ;
        }//end if
    }//end function PrecOperatorinput

    static int PrecOperatorStack( char operators ){
        if (operators == '^' ) {
            return 3 ;
        }else if (operators == '*' || operators == '%' || operators == '/'  ) {
            return 2 ;
        }else if (operators == '+' || operators == '-') {
            return 1;
        }else{
            return 0 ;
        }//end if
    }//end function PrecOperatorStack

    void pushAll(String opererand) {

        for( int i = 0 ; i <  opererand.length() ; i++ ){

            push( opererand.charAt(i)) ;
            System.out.println("top = "+ top.info);

        }//end for
        System.out.println("Push Finis") ;
    }
    
}

public class DLL {
    DNode head,tail, chack ;
    int count = 0 ;

    void add( String item ){
        DNode newnode = new DNode() ; 
        newnode.info = item ; // newnode data
        if( count == 0 ){ // if node don't have data
            head = newnode ; // first data = newnode
            tail = newnode ;
            count++ ;
        }else{
            tail.Rlink = newnode ;  
            newnode.Llink = tail ;
            tail = newnode ;
            count++ ; 
        }//end if
    }//end add


    void front_ins( String item ){

    }
//     back_ins(){}
//     remove(){}
    void show(){
        chack = head ; 
        int number = 0 ;
        while( chack != null ){
            number++ ;
            System.out.println( number + "." + chack.info ) ;
            chack = chack.Rlink ;
        }


    }
    int search( String data ){
        chack = head ; 
        int all_pos = count ;
        int pos = 0 ;
        if( chack != null ){
            for( int i = 0 ; i < all_pos ; i++){
                if ( chack.info.equals(data)) {
                    pos = i ;
                    break ; 
                }else{
                    chack = chack.Rlink ;
                }
            }
        }else{
            System.out.println("don't have data") ;
        }
        System.out.println("data is " + chack.info + " Pos = " + pos) ;
        return pos ;
    }
}

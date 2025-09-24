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
            tail.Rlink = newnode ; //front node -> newnode 
            newnode.Llink = tail ; //frontNode <- newNode
            tail = newnode ; //let newNode be last Node
            count++ ; 
        }//end if
    }//end add


    void front_ins( String item, int ref ){
        int pos = search( ref ) ;
        DNode newnode = new DNode() ;
        DNode p ;
        p = head ;
        newnode.info = item ;
        if( pos != -1) {
            if( pos == 0 ){
                newnode.Rlink = head ;
                head.Llink = newnode ;
                head = head.Llink ;
                count++ ;
                return ;
            }//end if
            for( int i = 0 ; i <= pos ; i++ ){
                if( i == pos && pos != 0 ) {
                    newnode.Rlink = p ;
                    newnode.Llink = p.Llink ;
                    p.Llink.Rlink = newnode ;
                    p.Llink = newnode ;
                    count++ ;
                }else{
                    p = p.Rlink ;
                }//end if
            }//end for
        }//end if
    }//end mathod



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
    int search( int data ){
        chack = head ; 
        int pos = data - 1 ;
        if( chack != null ){
            for( int i = 0 ; i < count ; i++){
                if ( i == pos ) {
                    return i ;
                }else{
                    chack = chack.Rlink ;
                }//end if
            }
        }else{
            System.out.println("don't have data") ;
        }//end if 
        return -1 ;
    }//end mathod
}

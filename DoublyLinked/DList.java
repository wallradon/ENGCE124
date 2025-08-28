public class DList {
    DNode head,tail,travel ;
    int count ;
    void append( int data ) {
        DNode newnode = new DNode() ;
        newnode.info = data ;
        if ( count == 0 ) {
            head = newnode ; 
            tail = newnode ;
        }else{
            tail.Rlink = newnode ;
            newnode.Llink = tail ;
            tail = newnode ;
        }
        count++ ;
    }
}

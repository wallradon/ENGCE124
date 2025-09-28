public class DList {
    DNode head,tail,travel ;
    int count ;
    void append( int data ) {
        DNode newnode = new DNode(data) ;
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
    void ShowAll() {
        travel = head ;
        while ( travel != null ) {
            
            System.out.println(travel.info) ;
            travel = travel.Rlink ;     
        }
        System.out.println("----------------------------------------");
    }
}

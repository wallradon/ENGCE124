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
    String getString( ) {
        String strPostfix = "" ;
        travel = head ;
        while ( travel != null ) {
            strPostfix = strPostfix + ( char )travel.info ;   // ต่อ string
            travel = travel.Rlink ;
        }
        return strPostfix ;
    }
    
    void ShowAll() {
        travel = head ;
        while ( travel != null ) {
            
            System.out.println((char)travel.info) ;
            travel = travel.Rlink ;     
        }
        System.out.println("");
    }
}

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
            travel = travel.Rlink ; /* เท่ากับข้อมูลทางขวา */
        }
        return strPostfix ;
    }
    
    void ShowAll() {
        travel = head ;
        while ( travel != null ) {
            
            System.out.print((char)travel.info) ;
            travel = travel.Rlink ;     
        }
        System.out.println("");
    }

    String getAllNode() {
        travel = head ;
        String node = "";
        for ( int i = 0 ; i < count ; i++ ) {
            node = node + (char)travel.info ;
            travel = travel.Rlink ;
        }
        
        return node ;      
    }

    DNode getNode( int index ) {
        if (index < 0 || index >= count) {
            return null ;
        }
        DNode result = head ;
        for( int i = 0 ; i < index ; i++ ){
            result = result.Rlink ; /* เท่ากับข้อมูลทางซ้ายของโหนด */
        }
        return result ;
    }
    String getStringAt(int index) {
        DNode node = getNode(index);
        if (node != null) {
            return String.valueOf((char)node.info);
        } else {
            return null;
        }
    }

    void clear (){
        tail = null ;
        head = null ;
        travel = null ;
        count = 0 ;
    }
}

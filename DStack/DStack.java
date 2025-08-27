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
    
    void ShowTop(){
        System.out.println("Top = "+top.info);
    }
    void showAll(){
        pop() ;
        System.out.println("info = "+top.info);
    }

}

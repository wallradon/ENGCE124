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

        System.out.println("Count = " + count) ;

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
                System.out.println("insert sucuccd") ;
                show() ;
                return ;
            }//end if
            for( int i = 0 ; i <= pos ; i++ ){
                if( i == pos && pos != 0 ) {
                    newnode.Rlink = p ;
                    newnode.Llink = p.Llink ;
                    p.Llink.Rlink = newnode ;
                    p.Llink = newnode ;
                    count++ ;
                    System.out.println("insert sucuccd") ;
                    show() ;
                }else{
                    p = p.Rlink ;
                }//end if
            }//end for
        }else{
            System.out.println("insert Failed") ;
        }//end if
    }//end mathod



    void behind_ins( String item, int ref ){
        DNode pos = SearchData( ref ) ;
        DNode newnode = new DNode() ;
        newnode.info = item ;
        
    }
    
    
    void remove( int pos ){
        //ลบหัว
        DNode ref = SearchData(pos) ;
        if( pos == 1 ){
            if ( count > 1) {
                head = ref.Rlink ;
                head.Llink = null ;
                count-- ;
            }else if ( count == 1) {
                head = null ;
                tail = null ;
                count-- ;
            }
        }else if( pos == count ){
            tail = ref.Llink ;
            tail.Rlink = null ;
            count-- ;
        }else{
            //ลบท้าย
            System.out.println( "Data = " + ref.info) ;
            ref.Llink.Rlink = ref.Rlink ;
            ref.Rlink.Llink = ref.Llink ;
            ref.Rlink = null ;
            ref.Llink = null ;
            count-- ;
        }//end if
    }


    void show(){
        chack = head ; 
        int number = 0 ;

        if (chack == null) { 
            System.out.println("Node don't have data") ; 
            return ;
        }
        System.out.println("___________________________________") ;
        while( chack != null ){
            number++ ;
            System.out.println( number + "." + chack.info ) ;
            chack = chack.Rlink ;
        }
        System.out.println("___________________________________") ;
    }
    int search( int data ){ //search index
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

    DNode SearchData( int ref ) {
        DNode node ;
        node = head ;
        int pos = ref-1 ;
        if(ref > count || ref < 1){ return null ; }  //end if
        for( int i = 0 ; i < pos ; i++ ) { node = node.Rlink ; }//end for
        return node ;
    } //end mathod

}//end class

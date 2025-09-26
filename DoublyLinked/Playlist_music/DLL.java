public class DLL {
    DNode head, tail, chack;
    int count = 0;

    void add( String item)  {
        DNode newnode = new DNode( );
        newnode.info = item ; 
        if (count == 0) { 
            head = newnode ; 
            tail = newnode ;
            count++;
        } else {
            tail.Rlink = newnode ;
            newnode.Llink = tail ; 
            tail = newnode ; 
            count++ ;
        } // end if

        System.out.println( "Count = " + count ) ;

    }// end add

    void front_ins( String item, int ref ) {
        DNode pos = SearchData( ref ) ;
        DNode newnode = new DNode( ) ;
        newnode.info = item ;
        if ( pos != null ) {
            if ( ref == 1 ) {
                newnode.Rlink = head ; 
                head.Llink = newnode ;
                head = head.Llink ;
                count++ ;
                System.out.println( "insert sucuccd" ) ;
                show();  
            }else{
                newnode.Rlink = pos ;
                newnode.Llink = pos.Llink ;
                pos.Llink = newnode ;
                newnode.Llink.Rlink = newnode ;
                count++ ;
                System.out.println( "insert sucuccd" ) ;
                show() ; 
            } // end if
        } else {
            System.out.println("insert Failed") ;
        } // end if
    }// end mathod

    void behind_ins( String item, int ref ) {
        DNode pos = SearchData( ref ) ;
        DNode newnode = new DNode( ) ;
        newnode.info = item ;
        if (pos != null) {
            if ( ref == count && count == 1 || ref == count && count > 1 ) {
                /* behind head */
                tail.Rlink = newnode ; 
                newnode.Llink = tail ;  
                tail = newnode ; 
                count++  ;
            } else {
                newnode.Rlink = pos.Rlink ;
                newnode.Llink = pos ;
                pos.Rlink.Llink = newnode ;
                pos.Rlink = newnode ; 
                count++ ;
            }// end if
        }// end if

    }// end mathod

    void remove( int pos ) {
        // ลบหัว
        DNode ref = SearchData( pos ) ;
        if ( pos == 1 ) {
            if ( count > 1 ) {
                head = ref.Rlink ;
                head.Llink = null ;
                count-- ;
            } else if ( count == 1 ) {
                head = null ;
                tail = null ;
                count-- ;
            }// end if
        } else if ( pos == count ) {
            // ลบท้าย
            tail = ref.Llink ;
            tail.Rlink = null ;
            count--;
        } else {
            ref.Llink.Rlink = ref.Rlink ;
            ref.Rlink.Llink = ref.Llink ;
            ref.Rlink = null ;
            ref.Llink = null ;
            count-- ;
        } // end if
    }//end mathod

    void show( ) {
        chack = head ;
        int number = 0 ;

        if ( chack == null ) {
            System.out.println( "Node don't have data" ) ;
            return;
        }// end if
        System.out.println( "___________________________________" ) ;
        while (chack != null) {
            number++;
            System.out.println( number + "." + chack.info ) ;
            chack = chack.Rlink;
        }//end loop
        System.out.println( "___________________________________" ) ;
    }//end mathod

    DNode SearchData( int ref ) {
        DNode node ;
        node = head ;
        int pos = ref - 1 ;
        if ( ref > count || ref < 1 ) {
            return null ;
        } // end if
        for ( int i = 0; i < pos; i++ ) {
            node = node.Rlink ;
        } // end for
        return node ;
    } // end mathod

}// end class

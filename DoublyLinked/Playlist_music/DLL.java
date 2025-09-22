public class DLL {
    DNode head,tail, car ;
    int count = 0 ;

    void add( String item ){
        DNode newnode = new DNode() ;
        newnode.info = item ;
        if( count == 0 ){
            head = newnode ;
            tail = newnode ;
            count++ ;
        }else{
            tail.Rlink = newnode ;
            newnode.Llink = tail ;
            tail = newnode ;
            count++ ; 
        }//end if
    }//end add


    // void front_ins( int item, DNode pos ){
    // }
//     back_ins(){}
//     remove(){}
    void show(){
        car = head ; 
        int number = 0 ;
        while( car != null ){
            number++ ;
            System.out.println( number + "." + car.info ) ;
            car = car.Rlink ;
        }


    }
//     search(){}
}

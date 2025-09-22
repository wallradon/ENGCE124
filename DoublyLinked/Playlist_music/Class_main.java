import java.util.Scanner ;

public class Class_main {
    public static void main(String[] args) {
        
        DLL D = new DLL() ;
        Scanner data = new Scanner(System.in) ;

        boolean end_pg = true ;
        String mode, song ;

        System.out.println("add, insFront, insBehind, del, show, Ex") ;
        while(end_pg){
            System.out.println("Select Mode: ") ;
            mode = data.nextLine() ;
            if( mode.equals("add") ) {
                System.out.print("What song will u add : ") ;
                song = data.nextLine() ;
                D.add( song ) ;
            }else if( mode.equals("ex") ) {
                end_pg = false ;
            }
        }


        D.show() ;
        data.close() ;
        // Doubly.add("awwww") ;
        // Doubly.add("afff") ;
        // Doubly.add("dksdsl") ;
        // Doubly.add("sdow") ;
    }
}
 
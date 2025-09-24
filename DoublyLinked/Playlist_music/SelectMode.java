import java.util.Scanner;

public class SelectMode {
    void select() {
        DLL D = new DLL() ;
        Scanner data = new Scanner(System.in) ;

        boolean end_pg = true ;
        String mode, song ;

        System.out.println("add, insFront, insBehind, del, show, ex") ;
        while(end_pg){
            System.out.println("Select Mode: ") ;
            mode = data.nextLine() ;
            if( mode.equals("add") ) {
                System.out.print("What song will u add : ") ;
                song = data.nextLine() ;
                D.add(song) ;
            } else if( mode.equals("show") ){
                D.show() ;
            } else if( mode.equals("ex") ) {
                end_pg = false ;
                data.close() ;
            }else if( mode.equals("search")){
                int Sdata ; 
                System.out.println("What data would you like to search : ") ;
                Sdata = data.nextInt() ;
                D.search(Sdata) ;
            }else if( mode.equals("insf")){
                String music ;
                int pos ;
                System.out.print("What music would you like to add : ") ;
                music = data.nextLine() ;
                System.out.print("What position would you like to add : ") ;
                pos = data.nextInt() ;
                D.front_ins( music, pos ) ;
            }//end if
        }//end while
    }
}

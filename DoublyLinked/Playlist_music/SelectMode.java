import java.util.Scanner;

public class SelectMode {
    void select() {
        DLL D = new DLL() ;
        Scanner data = new Scanner(System.in) ;

        boolean end_pg = true ;
        String mode, song ;
        System.out.println();
        System.out.println(
            "1 : Add Music to Playlist\n" +
            "2 : Insert Music Before Selected Song\n" +
            "3 : Insert Music After Selected Song\n" +
            "4 : Remove Music\n" +
            "5 : Show Playlist\n" +
            "6 : Exit Program"
        );
        System.out.println();
        while(end_pg){
            System.out.print("Select Mode: ") ;
            mode = data.nextLine() ;
            if( mode.equals("add") ) {
                System.out.print("What song will u add : ") ;
                song = data.nextLine() ;
                D.add(song) ;
            } else if( mode.equals("insf")){
                String music ;
                int pos ;
                System.out.print("What music would you like to add : ") ;
                music = data.nextLine() ;
                System.out.print("What position would you like to add : ") ;
                pos = data.nextInt() ;
                D.front_ins( music, pos ) ;
            } else if( mode.equals("ex") ) {
                end_pg = false ;
                data.close() ;
            } else if( mode.equals("show") ){
                D.show() ;
            } //end if
        }//end while
    }
}

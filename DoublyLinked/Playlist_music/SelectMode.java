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
            System.out.println("Select Mode: ") ;
            mode = data.nextLine() ;
            if( mode.equals("1") ) {
                System.out.print("What song will u add ? : ") ;
                song = data.nextLine() ;
                D.add(song) ;
            } else if( mode.equals("2")){
                String music ;
                int pos ;
                System.out.print("What music would you like to add ? : ") ;
                music = data.nextLine() ;
                D.show() ;
                System.out.print("Insert song where ? : ") ;
                pos = data.nextInt() ;
                D.front_ins( music, pos ) ;
            } else if( mode.equals("3")){
                String music ;
                int pos ;
                System.out.print("What music would you like to add ? : ") ;
                music = data.nextLine() ;
                D.show() ;
                System.out.print("Insert song where ? : ") ;
                pos = data.nextInt() ;
                D.behind_ins( music, pos ) ;
            } else if( mode.equals("4") ){
                int pos ;
                D.show() ;
                System.out.print("What music would you like to remove ? : ") ;
                pos = data.nextInt() ;
                D.remove(pos) ;
            } else if( mode.equals("5") ){
                D.show() ;
            } else if( mode.equals("6") ) {
                end_pg = false ;
                data.close() ;
            } //end if
        }//end while
    }
}

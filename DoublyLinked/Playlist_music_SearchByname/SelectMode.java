import java.util.Scanner;

public class SelectMode {
    void select() {
        DLL D = new DLL() ;
        Scanner data = new Scanner(System.in) ;

        String name = "" ;
        String artist = "" ;
        String album = "" ;
        String length = "" ;

        boolean end_pg = true ;
        String mode ;
        System.out.println();
        while(end_pg){
            System.out.println(
                "\n1 : Add Music to Playlist\n" +
                "2 : Insert Music Before Selected Song\n" +
                "3 : Insert Music After Selected Song\n" +
                "4 : Remove Music\n" +
                "5 : Show Playlist\n" +
                "6 : Exit Program\n"
            );
            System.out.println();
            System.out.println("Select Mode: " ) ;
            mode = data.nextLine().trim() ;
            if( mode.equals( "1" ) ) {
                System.out.print("What name song will u add ? : ") ;
                name = data.nextLine().trim() ;
                System.out.print("What artist name ? : ") ;
                artist = data.nextLine().trim() ;
                System.out.print("What album name ? : ") ;
                album = data.nextLine().trim() ;
                System.out.print("How long is this song ? : ") ;
                length = data.nextLine().trim() ;
                information info = new information(name, artist, album, length ) ;
                D.add(info) ;
            } else if( mode.equals( "2" ) ){
                System.out.print("What name song will u add ? : ") ;
                name = data.nextLine().trim() ;
                System.out.print("What artist name ? : ") ;
                artist = data.nextLine().trim() ;
                System.out.print("What album name ? : ") ;
                album = data.nextLine().trim() ;
                System.out.print("How long is this song ? : ") ;
                length = data.nextLine().trim() ;
                information info = new information(name, artist, album, length ) ;
                String pos ;
                D.show() ;
                System.out.print("Insert song where ? : ") ;
                pos = data.nextLine().trim() ;
                D.front_ins( info, pos ) ;
            } else if( mode.equals( "3" ) ){
                System.out.print("What name song will u add ? : ") ;
                name = data.nextLine().trim() ;
                System.out.print("What artist name ? : ") ;
                artist = data.nextLine().trim() ;
                System.out.print("What album name ? : ") ;
                album = data.nextLine().trim() ;
                System.out.print("How long is this song ? : ") ;
                length = data.nextLine().trim() ;
                information info = new information(name, artist, album, length ) ;
                String pos ;
                D.show() ;
                System.out.print("Insert song where ? : ") ;
                pos = data.nextLine().trim() ;
                D.behind_ins( info, pos ) ;
            } else if( mode.equals( "4" ) ){
                String pos ;
                D.show( ) ;
                System.out.print( "What music would you like to remove ? : ") ;
                pos = data.nextLine( ).trim() ;
                D.remove(pos) ;
                D.show( ) ;
            } else if( mode.equals("5") ){
                D.showAll() ;
            } else if( mode.equals("6") ) {
                end_pg = false ;
                data.close() ;
            } //end if
        }//end while
    }
}

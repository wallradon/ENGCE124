public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        
        String Exp = "A*(B+C)/D" ;
        for( int i = 0 ; i < Exp.length() ; i++ ){

            st.push(Exp.charAt(i)) ;

        }//end for
        for( int i = 0 ; i < Exp.length() ; i++ ){

            System.out.println((char)st.pop().info) ;

        }//end for
    }
}

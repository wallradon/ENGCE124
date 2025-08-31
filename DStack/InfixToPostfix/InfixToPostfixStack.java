
public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        
        
        String Exp = "A*(B+C)/D" ;
        // String Exp = "A+B+C" ;
        System.out.println("Exp = " + Exp ) ;
        st.InTopost(Exp) ;
        st.PostTOIn();
        
    }
}

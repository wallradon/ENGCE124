
public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        
        
        // String Exp = "A*(B+C)/D" ;
        // String Exp = "A+B+C" ;
        // String Exp = "A+B*C" ;
        String Exp = "a+b*(c^d-e)^(f+g*h)-i" ; 
        // String Exp = "A+B)*C" ;
        
        st.InTopost(Exp) ;
        System.out.println("Exp = " + Exp ) ;
        st.PostTOIn();
        
    }
}

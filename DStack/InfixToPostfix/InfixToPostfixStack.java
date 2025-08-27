
public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        
        String Exp = "A*(B+C)/D" ;
        
        st.pushAll(Exp) ;

    }
}

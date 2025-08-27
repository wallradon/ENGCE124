
public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        
        String Exp = "+-*/^()" ;
        
        st.pushAll(Exp) ;

    }
}

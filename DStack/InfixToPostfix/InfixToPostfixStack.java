
public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        calcu cl = new calcu() ;
        
        
        String Exp = "A*(B+C)/D" ;
        // String Exp = "A+B+C" ;
        // String Exp = "A+B*c" ;
        // String Exp = "A+B)*C" ;
        // String Exp = "A^b+c*d" ;
        
        st.InTopost(Exp) ;
        System.out.println("Exp = " + Exp ) ;
        String post =  st.PostTOIn();
        char[] vars = {'a','b','c','d','e','f','g','h','i'};
        int[]  vals = {  2 ,  3 ,  2 ,  3 ,  1 ,  4 ,  2 ,  1 ,  2 };
        int ans = cl.evaluatePostfixWithVariables(post, vars, vals);
        System.out.println("Result = " + ans);
        
    }
}

import java.util.Scanner;

public class InfixToPostfixStack {
    public static void main(String[] args) {
        DStack st = new DStack() ;
        calcu cl = new calcu() ;
        Scanner myObj = new Scanner(System.in) ; 
        
        
        // String Exp = "A*(B+C)/D" ;
        // String Exp = "A+B+C" ;
        String Exp = "A+B*c/D" ;
        // String Exp = "A^B+C*d" ;
        // String Exp = "(A^B)^C-D/E" ;
        
        st.InTopost(Exp) ;
        System.out.println("Exp = " + Exp ) ;
        String post =  st.PostTOIn() ;
        int index = post.length() - (post.length() / 2) ;
        char operand[] = new char[ index ] ;
        int number[] = new int[ index ] ;
        int j = 0;
        for( int i = 0 ; i < post.length() ; i++){
            char token = post.charAt(i) ;
            if(cl.isLetter(token)) {
                // char name = Character.toLowerCase(token);
                operand[j] = token ;
                System.out.println("Enter your number for "+ operand[j]  ) ;
                number[j] = myObj.nextInt() ; 
                j++ ; 
            }
        }
        // for( int p = 0 ; p < index ; p++ ){
        //     System.out.println(operand[p]);
        //     System.out.println(number[p]);
        // }

        int ans = cl.evaluatePostfixWithVariables(post, operand, number) ;
        System.out.println("Result = " + ans);

        // char[] vars = {'a','b','c','d','e','f','g','h','i'} ;
        // int[]  vals = {  2 ,  3 ,  2 ,  3 ,  1 ,  4 ,  2 ,  1 ,  2 } ;
        
    }
}

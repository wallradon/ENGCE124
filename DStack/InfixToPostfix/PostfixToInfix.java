public class PostfixToInfix {
    void PostToIn( String proposition) {

        // DList Dou = new DList() ;
        StrStack st = new StrStack() ; 

        for( int i = 0 ; i <  proposition.length() ; i++ ){ /*Postfix จากซ้ายไปขวา */

            char chack = proposition.charAt(i) ;

            if((chack >= 'A' && chack <= 'Z') || (chack >= 'a' && chack <= 'z' ) || (chack >= '0' && chack <= '9') ){
                st.push(String.valueOf(chack)) ;
            } else {
                String op2 = st.pop() ;
                String op1 = st.pop() ;
                st.push("("+op1+chack+op2+")") ;
            }
            
        }
        
        String infix = st.pop();
        System.out.println("Infix = " + infix);
    }
}

public class PostfixToInfix {

    DStack st = new DStack() ;
    DList DLL = new DList() ;

    void PostToIn( String proposition) {

        for( int i = 0 ; i <  proposition.length() ; i++ ){
            char patiant = proposition.charAt(i) ;
            char CheckOperand = st.Operandcheck( patiant ) ;
            int CheckOperetor = st.Operetorcheck( patiant ) ;
            
            if (CheckOperand != '\0') { //ถ้าใช่ Operand
                st.push(patiant);
           
            }else if(CheckOperetor == patiant ){
                DLL.append(st.pop().info) ; 
                DLL.append(st.pop().info) ;
                String op1 = DLL.getStringAt(1); 
                String op2 = DLL.getStringAt(2);


                String expr = "(" + op1 + patiant + op2 + ")";
                
            }
            st.printAll(String.valueOf(patiant),st.DLL.getString() ) ;

        }//end for
        while ( !st.isEmpty() ) {
            st.DLL.append(st.pop().info) ;
        }
        st.printAll("", st.DLL.getString());

    }
}

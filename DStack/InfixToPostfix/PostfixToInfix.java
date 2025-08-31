public class PostfixToInfix {

    DStack st = new DStack() ;
    DList Dou = new DList() ;

    void PostToIn( String proposition) {
        System.out.printf("%-8s | %-16s | %-8s%n", "Symbol", "Stack", "Postfix String");
        System.out.println("-----------------------------------------------------------------");
        for( int i = 0 ; i <  proposition.length() ; i++ ){ /*Postfix จากซ้ายไปขวา */
            char patiant = proposition.charAt(i) ;
            char CheckOperand = st.Operandcheck( patiant ) ;
            int CheckOperetor = st.Operetorcheck( patiant ) ;
            
            if (CheckOperand != '\0') { //ถ้าเจอ operand (ตัวแปร/ตัวเลข) → push ลง stack เป็น String
                st.push(patiant) ; /*push ลง stack เป็น String */
            }else if(CheckOperetor == patiant ){ /* ถ้าเจอ operator */
                Dou.append(st.pop().info) ;  /* pop 2 อันบนของ stack ออกมา */
                Dou.append(st.pop().info) ;
                String op1 = Dou.getStringAt(0) ; 
                String op2 = Dou.getStringAt(1) ;
                String tote = "(" + op1 + patiant + op2 + ")" ;
                for( int j = 0 ; j < tote.length() ; j++ ){
                    char opera = tote.charAt(j) ;
                    st.push(opera); /*push string ใหม่นี้กลับเข้าไปใน stack  */
                }
                Dou.clear() ;
            }
        }//end for
        while ( !st.isEmpty() ) {
            Dou.append(st.pop().info) ;
        }
        String infix = Dou.getString();
        System.out.println("(Infix) = " + infix);
    }
}

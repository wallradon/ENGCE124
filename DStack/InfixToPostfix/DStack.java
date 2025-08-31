public class DStack {
    DList DLL = new DList() ;
    
    int count ;
    DNode top, temp ;

    void push( int item ) {
        DNode newnode = new DNode() ;
        newnode.info = item ;
        if ( count == 0 ) {
            top = newnode ;
        }else{
            top.Rlink = newnode ;
            newnode.Llink = top ;
            top = top.Rlink ;
        }
        count++ ;
    }//end push

    DNode pop() {
        if (!isEmpty()) {
            if ( size() == 1 ) {
                temp = top;
                top = null ;
            } else{
                temp = top ;
                top = top.Llink ;
                top.Rlink = null ; 
                temp.Llink = null ;
            }
            count-- ;
        }else{
            System.out.println("stack is Empty");
            temp.info = -1 ;
        }   
        return temp ;     
    }

    boolean isEmpty(){ return count == 0 ; }
    int size(){ return count ; } // วัดsize
    
    static int Precedence_Operator_input( char operators ){
        if ( operators == '^' ) {
            return 4 ;
        }else if (operators == '*' || operators == '%' || operators == '/'  ) {
            return 2 ;
        }else if (operators == '+' || operators == '-') {
            return 1;
        }else{
            return -1 ;
        }//end if
    }//end function PrecOperatorinput

    static int Precedence_Operator_Stack( char operators ){
        if (operators == '^' ) {
            return 3 ;
        }else if (operators == '*' || operators == '%' || operators == '/'  ) {
            return 2 ;
        }else if (operators == '+' || operators == '-') {
            return 1;
        }else{
            return 0 ;
        }//end if
    }//end function PrecOperatorStack

    void InTopost(String proposition) {
        System.out.printf("%-8s | %-16s | %-8s%n", "Symbol", "Stack", "Postfix String");
        System.out.println("-----------------------------------------------");

        for( int i = 0 ; i <  proposition.length() ; i++ ){

            char patiant = proposition.charAt(i) ;
            char CheckOperand = Operandcheck( patiant ) ;
            int CheckOperetor = Operetorcheck( patiant ) ;

            if (CheckOperand != '\0') { //ไม่ใช่ Operetor

                DLL.append(CheckOperand) ;
                
            }else if (CheckOperand == '\0') {

                
                if (CheckOperetor == 40) { //ASCII 40 = (

                   push(patiant) ;
                    
                }else if ( patiant == 41) { //ASCII 41 = )
                    
                    while ( !isEmpty()&&(char)top.info != 40) { /*ถ้าไม่ว่างและไม่เท่ากับ ( */
                        DLL.append(pop().info) ; /*pop to DLL(postfix) */
                    }
                    if( !isEmpty() && (char)top.info == 40){ /*ถ้าไม่ว่างและเท่ากับ ( */
                        pop() ; /*ทิ้ง */
                    }
                }else{
                    /* ถ้าเป็น +-/^*  */
                    while (!isEmpty() && Precedence_Operator_input(patiant) <= Precedence_Operator_Stack((char)top.info)) {
                        DLL.append(pop().info);
                    }
                    push(patiant) ;

                }
            }
            printAll(String.valueOf(patiant),DLL.getString() ) ;

        }//end for
        while ( !isEmpty() ) {
            DLL.append(pop().info) ;
        }
        printAll("", DLL.getString());
        
    }
    char Operandcheck( int Infix ) { /*check Operand */

        if ( Infix >= 65 && Infix <= 90 || 
        Infix >= 97 && Infix <= 122 || 
        Infix >= 48 && Infix <= 57) {
            return (char)Infix ;
        }else{
            // System.out.println("0 Find Oparetor");
            return '\0' ;
        }
    }

    int Operetorcheck( int Infix ) { 

        if ( Infix >= 33 && Infix <= 47 || 
            Infix >= 58 && Infix <= 63 || 
            Infix >= 91 && Infix <= 96|| 
            Infix >= 123 && Infix <= 126) 
            {
            // System.out.println("1 Find Oparand") ;
            return Infix ;
        }else{
            // System.out.println("0 Find Oparetor");
            return -1 ;
        }
    }

    void printAll(String symbol, String postfix) {
        
        String stackStr = "";
        DNode p = top;
        while (p != null) {
            stackStr = (char)p.info + stackStr; // ไล่จากล่างขึ้นบน
            p = p.Llink;
        }
    
        
        System.out.printf("%-8s | %-16s | %-8s%n",
                symbol, stackStr, postfix);
    }
    
    void PostTOIn(){
        // DLL.ShowAll() ;
        PostfixToInfix pti = new PostfixToInfix() ;
        String post = DLL.getAllNode() ;
        System.out.println("Post = " + post) ;
        pti.PostToIn(post) ;
    }
}

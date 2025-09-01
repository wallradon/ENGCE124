import java.util.Scanner ;
public class postcalcul {
    static boolean isDigit(char ch){ return ch >= '0' && ch <= '9'; } //check number
    static boolean isLetter(char ch){ return (ch >= 'A' && ch <= 'Z') //check operand
    || (ch >= 'a' && ch <= 'z'); }
    
    // int powInt(Float base, Float exponent){
    //     if (exponent < 0) throw new RuntimeException("ERROR pow ^ - ");
    //     int result = 1 ;
    //     while (exponent > 0){
    //         if ((exponent & 1) == 1) 
    //             result *= base ;
    //         base *= base ;
    //         exponent >>= 1 ;
    //     }
    //     return result;
    // }

    void calcul( String postfix) {
        Scanner myObj = new Scanner(System.in) ; 
        DStack st = new DStack() ;
        // DList DLL = new DList() ;
        int priority = 0, j = 0  ;
        int index = postfix.length() - (postfix.length() / 2) ;
        char operand[] = new char[ index ] ;
        int number[] = new int[ index ] ;
        int rightOperand = 0 ;
        int leftOperand = 0 ;
        for( int i = 0 ; i < postfix.length() ; i++ ){

            char chack = postfix.charAt(i) ;
            if(!st.isEmpty()){
                rightOperand = st.pop().info ;
                leftOperand  = st.pop().info ;
            }
            int result ;
            switch (chack) {
                case '*': result = leftOperand * rightOperand ; st.push(result) ;
                case '/': result = leftOperand / rightOperand ; st.push(result) ;
                case '%': result = leftOperand / rightOperand ; st.push(result) ;
                break;
                case '+': result = leftOperand + rightOperand ; st.push(result) ;
                case '-': result = leftOperand - rightOperand ; st.push(result) ;
                break;
                // case '^': result = powInt(leftOperand, rightOperand) ;
                // break ;
                default: operand[j] = postfix.charAt(i) ; 
                        System.out.println("Enter your number for "+ operand[j]  ) ;
                        number[j] = myObj.nextInt() ; 
                        st.push(number[j]) ;
                        j++ ; 
                break ; 
            }       
            
        }
                myObj.close() ;  
    }    
}


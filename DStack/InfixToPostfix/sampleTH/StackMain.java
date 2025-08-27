
public class StackMain {

    public static void main(String[] args) {
        /*infix to postfix https://www.geeksforgeeks.org/dsa/convert-infix-expression-to-postfix-expression/*/
        DStack st = new DStack();
//        st.push(12);
//        st.push(1);
//        st.push(2);
//        st.push(5);
//        
//        System.out.println("info = "+st.pop().info);
//        System.out.println("info = "+st.pop().info);
//        System.out.println("info = "+st.pop().info);
//        System.out.println("info = "+st.pop().info);
//        System.out.println("info = "+st.pop().info);
        
       /*sample*/
       String s = "Data Structure" ;
       
       for( int i = 0 ; i < s.length() ; i++ ) {
           st.push(s.charAt(i));
       }
       for( int i = 0 ; i < s.length() ; i++ ){
           System.out.println( (char)st.pop().info);
       }
    }
}


public class StackMain {

    public static void main(String[] args) {
        DStack st = new DStack();
        st.push(12);
        st.push(1);
        st.push(2);
        st.push(5);
        
        System.out.println("info = "+st.pop().info);
        System.out.println("info = "+st.pop().info);
        System.out.println("info = "+st.pop().info);
        System.out.println("info = "+st.pop().info);
        System.out.println("info = "+st.pop().info);
        System.out.println("info = "+st.pop().info);
    }
}

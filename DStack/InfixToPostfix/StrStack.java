public class StrStack {
    classStringStack st = new classStringStack(null);

    classStringStack top ;
    boolean isEmpty() {
        return top == null ;
    }
    void push ( String str ) {
        classStringStack data = new classStringStack( str );
        data.next = top ;
        top = data ;
    }
    String pop() {
        if( isEmpty() ){
            return null ;
        }
        String str = top.info;
        top = top.next;
        return str ;
    }

}
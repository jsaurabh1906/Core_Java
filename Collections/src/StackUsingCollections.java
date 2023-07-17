import java.util.Stack;

public class StackUsingCollections {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //push
        st.push(20);
        st.push(30);
        st.push(40);

        //traverse over stack
        while(!st.isEmpty()){
            System.out.println(st.peek());

            //pop
            st.pop();
        }



    }
}

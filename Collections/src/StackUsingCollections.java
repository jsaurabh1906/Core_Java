import java.util.Stack;

public class StackUsingCollections {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //push
        st.push(20);
        st.push(30);
        st.push(40);   // 20 30 40

        //pushAtBottom(999,st);

        reverse(st);        //40 30 20
        //traverse over stack
        while(!st.isEmpty()){
            System.out.println(st.peek());

            //pop
            st.pop();
        }



    }
}

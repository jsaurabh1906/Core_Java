import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();

        public static boolean isEmpty(){
            return st1.isEmpty();
        }

        public static void add(int data){
            // 1. push all elements from stack1 to stack 2
            // 2. push new element in stack1
            // 3. push all elements again to stack 1 from stack2
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }

            st1.push(data);

            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }

        public static int remove(){
            return st1.pop();
        }

        public static int peek(){
            return st1.peek();
        }
    }
    public static void main(String args[]) {
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);


        while(!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}

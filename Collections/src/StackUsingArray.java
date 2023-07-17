public class StackUsingArray {
    static class Stack{
        static int top = -1;
        static int[] arr = new int[5];

        static boolean isEmpty(){
            return top == -1;
        }
        static void push(int data){
            System.out.println("top = "+ top);
            if((top + 1) < arr.length){
                ++top;
                arr[top] = data;
            }
            else{
                System.out.println("Stack Overflow while pushing : " + data);
            }
        }
        static int pop(){
            if(isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int topValue = arr[top];
            top--;
            return  topValue;
        }
        static int peek(){
            if(isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top];
        }
        static void display(){
            for (int i = top; i >=0 ; i--) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Stack.push(123);
        Stack.push(234);
        Stack.push(89);
        Stack.push(9879);
        Stack.push(554);
        Stack.push(999999);
        Stack.display();
    }

}

import java.sql.SQLOutput;
import java.util.SortedMap;

public class QueueUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        static{
            size = 5;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == size - 1;
        }
        // Enqueue: O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Deque: remove element O(n)
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty!!");
                return  -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty!!");
                return  -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue.add(5);
        Queue.add(15);
        Queue.add(25);
        Queue.add(35);
        Queue.add(45);
        Queue.add(55);

        System.out.println(Queue.remove());
        System.out.println(Queue.peek());

    }
}

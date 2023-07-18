public class CircularQueueUsingArray {
    static class CircularQueue{
        private static int[] arr;
        private static int front;
        private static int rear;
        static {
            arr = new int[5];
            front = rear = -1;
        }
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            // return (front == 0 && rear == arr.length - 1) || (rear + 1) == front;
            return (rear + 1) % arr.length == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("C-Queue is Full");
            }
            else{
                rear = (rear + 1) % arr.length;
                arr[rear] = data;
                if (front == -1)
                    front++;
            }
        }

        public static int remove(){
            int returnValue = 0;

            if(isEmpty()){
                System.out.println("C-Queue is Empty");
            }
            else{
                returnValue = arr[front];

                //if last element
                if(front == rear)
                {
                    front = rear = -1;
                }
                else {
                    front = (front + 1) % arr.length;
                }
            }
            return returnValue;
        }
        public static int peek(){
            if (isEmpty()) return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {

        CircularQueue.add(10);
        CircularQueue.add(20);
        CircularQueue.add(30);
        CircularQueue.add(40);
        CircularQueue.add(50);
        //CircularQueue.add(60); // full

        while(!CircularQueue.isEmpty()){
            System.out.println(CircularQueue.peek());
            CircularQueue.remove();
        }
    }
}

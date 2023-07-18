public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        static {
            head = null;  // front of queue
            tail = null;  // rear of queue
        }

        //Empty : both head and tail will be null
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //Enqueue: add element(node) from rear i.e @ tail
        public static void add(int data) {
            Node newNode = new Node(data);

            // if empty make tail and head point to the newNode
            if (isEmpty()) {
                tail = head = newNode;
            } else { // append the newNode at tail
                tail.next = newNode;
                tail = newNode;
            }
        }

        //Deque : remove element(node) from head
        public static int remove() {
            //check if empty
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;

            //if single node
            if (head == tail) {
                head = tail = null;
            }
            else
            {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(10);
        Queue.add(100);
        Queue.add(1000);
        Queue.add(10000);
        Queue.add(100000);

        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }

    }
}

public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    static class DLL {
        static Node head;
        static Node tail;

        DLL() {
            head = null;
            tail = null;
        }
        public static boolean isEmpty(){
            return head == null ;
        }
        public static void addFirst(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
            }
            else{
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
        public static void addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
            }
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        public static void deleteFirst(){
            if (isEmpty()){
                System.out.println("DLL is Empty");
                return;
            }
            else{
                // if single node
                if (head == tail){
                    head = tail = null;
                }
                // multiple nodes
                Node temp = head;
                head = head.next;
                head.prev = null;
                temp.next = null;
            }
        }

        public static void deleteLast(){
            if(tail != null){
                if (head == tail){
                    head = tail = null;
                }
                else{
                    Node temp = tail;
                    tail = tail.prev;
                    tail.next = null;
                    temp.prev = null;
                }
            }
        }
        public static void reverse(){
            Node it = head;
            while(it != null){
                Node temp = it.next; //make temp to point to it.next
                it.next = it.prev;   // make it.next point to it.prev
                it.prev = temp;     // make it. prev point to same as temp

                it = it.prev;       // update it to next node which is same as it.prev
            }
            Node swap = head;
            head = tail;
            tail = swap;
        }
        public static void printDLL(){
            String str = "";

            if(head == null)
            {
                str = "DLL is empty";
            }
            else
            {
                Node x = head;
                while(x != null)
                {
                    str += "" + x.data + "<==>";
                    x = x.next;
                }
            }
            System.out.println(str);

        }

    }

    public static void main(String[] args) {
        DLL.addFirst(50);
        DLL.addFirst(40);
        DLL.addFirst(30);
        DLL.addFirst(20);
        DLL.addFirst(10);
        DLL.addLast(60);
        DLL.addLast(70);
        //DLL.deleteFirst();
        DLL.deleteLast();
        DLL.printDLL();

        DLL.reverse();
        DLL.printDLL();
    }
}

public class LinkedListDemo {
    Node head;
    int size;
    LinkedListDemo(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(){

        }
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }

    //addLast or append
    public  void addLast(String data){
        // create a new node with data
        Node newNode = new Node(data);

        //if ll is empty
        if(head == null){
            head = newNode;
            return;
        }

        // if list is not empty
            //iterator to traverse to last node
        Node it = head;
        while(it.next != null){
            it = it.next;
        }
        it.next=newNode;

    }

    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node it = head;
        while(it != null){
            System.out.print(it.data + "-->");
            it = it.next;
        }
        System.out.println("null");

    }
    public void deleteFirst(){
        Node temp = new Node();

        if (head == null){
            System.out.println("The list is empty!!!!");
            return;
        }
        size--;
        temp = head;
        head = temp.next;
        temp = null;

    }
    public void deleteLast(){
        // if ll is empty
        if (head == null){
            System.out.println("The list is empty!!!!");
            return;
        }
        // if ll has only one node
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        // if ll has more than 1 node
        Node it1 = head;
        Node it2 = head.next;
        while(it2.next != null){
            it2 = it2.next;
            it1 = it1.next;
        }
        it1.next = null;
        it2 = null;
    }
    public int getSize(){
        return size;
    }
    //reverse a ll
    public void reverseLL(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update the pointers
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode ;
    }

    //reverse a ll using recursion
    public Node reverseLLRecur(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseLLRecur(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }


    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.addFirst("A");
        list.addFirst("B");
        list.printList();  //B-->A-->null

        list.addLast("C");
        list.addLast("D");
        list.printList(); //B-->A-->C-->D-->null


        list.deleteFirst();
        list.printList(); //A-->C-->D-->null

        list.deleteLast();
        list.printList();  //A-->C-->null

        System.out.println(list.getSize()); //2

        list.printList();
        //list.reverseLL();
        list.head = list.reverseLLRecur(list.head);
        list.printList();
    }
}

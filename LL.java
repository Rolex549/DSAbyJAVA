
class LL {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

//add at first and last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is already empty");
            return;
        }

        head = head.next; //head ko next node se start karwa denge
    }

    public void deleteLast() {

        if (head.next == null) {
            System.out.println("last element is deleted now");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

//reverse the list without creating new memory
    public void reverseList() {                           //iterative way hai jisme hum list ko reverse karte hai bina new memory allocate kre
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //  update nodes
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }



public Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    //print your list
    public void printList() {
        // agar list empty hai to
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // agar listtme koi element hai to pehle element ko head kahenge aur temporary node ko currNode kehte hai jisme head ko dalenge
        Node currNode = head;
        while (currNode != null) { //loop chalaenge jab tak currNode null nahi ho jata
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("papaji");
    }
 

   
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("s");
        list.addLast("h");
        list.addLast("i");
        list.addLast("v");
        list.addLast("a");
        list.addLast("m");

        // list.reverseList();
        // list.printList();
       list.head = list.reverseRecursion(list.head);
        list.printList();
    }
}

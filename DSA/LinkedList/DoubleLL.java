public class DoubleLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Empty DoublyLL");
            return;
        }
        Node node = head;
        System.out.print("null -> ");
        while (node != null) {
            System.out.print(node.data + " < - > ");
            node = node.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty DoublyLL");
            size--;
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLL();
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeFirst();
        // ll.printLL();

        ll.reverse();
        ll.printLL();
        
    }
}

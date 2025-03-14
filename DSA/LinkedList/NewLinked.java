public class NewLinked {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("null");
    }

    private Node getMidNode(Node head) {
        Node slow = head;
        Node fast = head.next; // For MergeSort, ZigZag
        // Node fast = head; // For Palindrome

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeNode = new Node(-1);
        Node tmp = mergeNode;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tmp.next = head1;
                head1 = head1.next;
                tmp = tmp.next;
            } else {
                tmp.next = head2;
                head2 = head2.next;
                tmp = tmp.next;
            }
        }

        while (head1 != null) {
            tmp.next = head1;
            head1 = head1.next;
            tmp = tmp.next;
        }
        while (head2 != null) {
            tmp.next = head2;
            head2 = head2.next;
            tmp = tmp.next;
        }

        return mergeNode.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMidNode(head);

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public boolean isPalindrmoe() {
        if (head == null || head.next == null)
            return true;

        Node mid = getMidNode(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public void zigzag(){
        // Step - 1
        Node mid = getMidNode(head);

        // Step - 2
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step - 3 Alternate Swapping
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        NewLinked ll = new NewLinked();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        // ll.addFirst(6);

        ll.printLL();
        // ll.head = ll.mergeSort(ll.head);
        // ll.printLL();
        // System.out.println(ll.isPalindrmoe());

        ll.zigzag();
        ll.printLL();

    }
}

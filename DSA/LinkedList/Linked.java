// package DSA.LinkedList;

public class Linked {
    public static Node head;
    public static Node tail;

    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secNode = head;
        Node lasNode = head.next;
        while (lasNode.next != null) {
            lasNode = lasNode.next;
            secNode = secNode.next;
        }

        secNode.next = null;
    }

    public void insert(String data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            addFirst(data);
            return;
        } else if (pos == size) {
            addLast(data);
            return;
        } else if (pos > size) {
            System.out.println("Position should be lower than List Size");
            return;
        }

        Node node = head;
        int count = 0;
        while (count < pos - 1) {
            node = node.next;
            count++;
        }

        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public void getNode(int pos) {
        Node node = head;
        int count = 0;

        while (count < pos) {
            node = node.next;
            count++;
        }
        System.out.println(node.data);
    }

    public int searchNode(String data) {
        if (size == 0) {
            System.out.println("list is Empty");
            return -1;
        }

        int index = 0;
        Node node = head;
        while (node.next != null) {
            if (node.data == data) {
                return index;
            }
            node = node.next;
            index++;
        }

        return -1;
    }

    public int recursionSearch(Node head, String data, int index) {
        if (head.data == data) {
            return index;
        }

        if (head.next == null)
            return -1;

        return recursionSearch(head.next, data, ++index);
    }

    public void reverse() { // O(n)
        Node prev = null;
        Node cur = tail = head;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void removeNth(int pos) {
        Node node = head;
        int count = 1;
        while (count < pos) {
            node = node.next;
            count++;
        }

        node.next = node.next.next;
        return;
    }

    public Node findMidNode(Node head) { // Return The Middle Node
        Node slow = head;
        Node fast = head;
        // Node fast = head.next; // To get the mid which is the last of left half (first half)

        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean ispalindrome() {
        if (head == null || head.next == null)
            return true;

        // step - 1 find Middle
        Node mid = findMidNode(head);

        // Step - 2 reverse 2nd Half
        Node prev = null;
        Node cur = mid;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // Step - Check left & right half
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Linked ll = new Linked();

        ll.addLast("1");
        ll.addLast("2");
        ll.addLast("2");
        ll.addLast("1");

        ll.printLinkedList();

        int pos = ll.searchNode("Rohit");
        if (pos != -1) {
            System.out.print("Found -> " + pos + " - ");
            ll.getNode(pos);
        } else
            System.out.println("Not Found");

        pos = ll.recursionSearch(head, "Khatri", 0);
        if (pos != -1) {
            System.out.print("Found -> " + pos + " - ");
            ll.getNode(pos);
        } else {
            System.out.println("Not Found");
        }

        // ll.reverse();
        // ll.removeNth(2); // Delete by Index
        ll.printLinkedList();
        System.out.println(ll.ispalindrome());

        // Detect if a LinkedList has Cycle or not
        System.out.println(ll.detectCycle());
    }
}

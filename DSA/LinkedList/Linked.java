// package DSA.LinkedList;

public class Linked {
    Node head;
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

    public static void main(String args[]) {
        Linked linkedList = new Linked();

        // linkedList.addFirst("a");
        // linkedList.addFirst("is");
        // linkedList.addFirst("this");

        linkedList.addLast("My");
        linkedList.addLast("Name");
        linkedList.addLast("is");
        linkedList.addLast("Rohit");
        linkedList.addLast("Khatri");

        linkedList.printLinkedList();
        System.out.println(linkedList.size);

        // linkedList.insert("new node", 3);
        // linkedList.printLinkedList();
        // System.out.println(linkedList.size);

        // linkedList.getNode(1);
        // linkedList.deleteFirst();
        // System.out.println(linkedList.size);
        // linkedList.printLinkedList();

        int pos = linkedList.searchNode("Rohit");
        if (pos != -1) {
            System.out.print("Found -> " + pos + " - ");
            linkedList.getNode(pos);
        } else
            System.out.println("Not Found");

        pos = linkedList.recursionSearch(linkedList.head, "Khatri", 0);
        if (pos != -1) {
            System.out.print("Found -> " + pos + " - ");
            linkedList.getNode(pos);
        } else
            System.out.println("Not Found");

    }
}

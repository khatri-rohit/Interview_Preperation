// package LinkedList;

public class Questions {
   Node head;
   int size = 0;

   class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
         this.next = null;
      }
   }

   public void addLast(int data) {
      Node newNode = new Node(data);
      size++;
      if (head == null) {
         head = newNode;
         head.next = null;
         return;
      }

      Node node = head;
      while (node.next != null) {
         node = node.next;
      }
      node.next = newNode;
   }

   public void println() {
      if (head == null) {
         System.out.println("Empty List");
         return;
      }

      Node node = head;
      while (node != null) {
         System.out.print(node.data + "->");
         node = node.next;
      }
      System.out.println("null");
      return;
   }

   public void intersection(Node head2) {
      Node head1 = head;
      Node ll2Node = head2;
      Node tmp1;

      while (head1 != null) {
         if (ll2Node != null &&
               (head1.data <= ll2Node.data && head1.next.data > ll2Node.data)) {
            tmp1 = head1.next;
            head1.next = ll2Node;
            ll2Node = ll2Node.next;
            head1.next.next = tmp1;
         }
         head1 = head1.next;
      }
   }

   public void deleteNs(int m, int n) {
      Node node = head;
      Node tmp;
      int count = 0;
      while (node != null) {
         count++;
         if (count >= m && count < (m + n)) {
            node.next = node.next.next;
            size--;
         } else {
            node = node.next;
         }

         if (count == (m + n)) {
            count = 0;
         }
      }
   }

   public void swapping(int x, int y) {
      Node node = head;
      Node tmp;
      Node tmp2;
      int count = 0;

      while (node != null) {
         count++;
         if (count == x) {
            tmp = node;
            tmp2 = node;
            while (count != y) {
               count++;
               tmp = tmp.next;
               // tmp2
            }
            node = tmp;
            node = node.next;
         } else
            node = node.next;
      }
   }

   public static void main(String[] args) {
      Questions ll1 = new Questions();
      Questions ll2 = new Questions();

      ll1.addLast(1);
      ll1.addLast(2);
      ll1.addLast(3);
      ll1.addLast(4);
      ll1.addLast(5);
      ll1.addLast(6);
      ll1.addLast(7);
      ll1.addLast(8);
      ll1.addLast(9);
      ll1.addLast(10);
      ll1.println();

      // Question 3
      ll1
      
      // // Question2
      // ll1.deleteNs(3, 2);
      // ll1.println();
      
      // // Question 1
      // ll2.addLast(4);
      // ll2.addLast(5);
      // // System.out.println(ll2.head.next.data);
      // ll2.println();
      // System.out.println(ll2.size);
      // System.out.println("Insertion b/w Two consequent LinkedList");
      // ll1.intersection(ll2.head);
      // ll1.println();

   }
}

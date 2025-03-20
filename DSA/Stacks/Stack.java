// package Stacks;

import java.util.ArrayList;
import java.util.Stack;

import javax.print.attribute.IntegerSyntax;

class Stacks {
    static class Stack_Arr {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek (return Top)
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack_Link {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]) {
        // // With ArrayList
        // System.out.println("ArrayList Stack Implementation");
        // Stack_Arr stack = new Stack_Arr();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // while (!stack.isEmpty()) {
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println(stack.peek() == -1 ? "Now Empty" : stack.peek());

        // // // With LinkedIn List
        // System.out.println("LinkedList Stack Implementation");
        // Stack_Link sl = new Stack_Link();
        // sl.push(4);
        // sl.push(5);
        // sl.push(6);

        // while (!sl.isEmpty()) {
        // System.out.println(sl.peek());
        // sl.pop();
        // }

        // // Using Collection Framework
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // pushAtBottom(stack, 4);

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        // // Reverse Stack
        // String str = "Rohit Khatri";
        // String res = reverseString(str);
        // System.out.println(res);

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;

        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

}

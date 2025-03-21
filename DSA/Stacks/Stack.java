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

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // // Stock Span Problem
        // int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stock.length];

        // stockSpan(stock, span);

        // for (int i : span) {
        // System.out.print(i + " | ");
        // }
        // System.out.println();

        // // Next Greater Element
        // int arr[] = { 6, 8, 0, 1, 3 };
        // int nxtGreater[] = new int[arr.length];

        // nextGreater(arr, nxtGreater);
        // for (int i : nxtGreater) {
        // System.out.print(i + " | ");
        // }
        // System.out.println();

        // // Check Vaild
        // String str = "()({)[]"; // false
        // String str = "()({})[]"; // true
        // System.out.println(isValid(str));

        // // Check Duplicate
        String str = "[a+b]";
        System.out.println(checkDuplicate(str));

    }

    public static boolean checkDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        if (isValid(str)) {
            System.out.println("Not a Valid String");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (ch == ')' || ch == '}' || ch == ']') {
                while ((ch == ')' && s.peek() != '(') ||
                        (ch == ']' && s.peek() != '[') ||
                        (ch == '}' && s.peek() != '{') && !s.isEmpty()) {
                    s.pop();
                    count++;
                }
                if (count < 1)
                    return true;
                s.pop();
            } else {
                s.push(ch);
            }
        }
        // if (!s.isEmpty()){
        // System.out.println("Not a Valid String");
        // return false;
        // }
        return false;
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty())
                    return false;
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '[' && ch == ']') ||
                        (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (!s.isEmpty())
            return false;
        return true;
    }

    public static void nextGreater(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

    }

    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        span[0] = 1;
        for (int i = 1; i < stock.length; i++) {
            int currStock = stock[i];
            while (!stack.isEmpty() && currStock > stock[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i);
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

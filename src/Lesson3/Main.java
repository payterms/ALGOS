package Lesson3;

public class Main {

    private static final int CAPACITY = 8;
    private static final String message2Reverse = "АБЫРВАЛГ";

    public static void main(String[] args) {
        testMyStack();

        testMyQueue();

        testReverse();

        testMyDeque();

        testMyPriorityQueue();
    }

    private static void testMyQueue() {

        System.out.println("\n testMyQueue ");

        MyQueue<Character> queue = new MyQueue<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            queue.insert(message2Reverse.charAt(i));
        }

        for (int i = 0; i < CAPACITY; i++) {
            System.out.print(queue.remove());
        }
    }

    private static void testMyPriorityQueue() {
        System.out.println("\n testMyPriorityQueue ");

        Lesson3.MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
        mpq.insert(7);
        System.out.println(mpq);

        mpq.insert(1);
        System.out.println(mpq);

        mpq.insert(3);
        System.out.println(mpq);

        System.out.println(mpq.remove());
        System.out.println(mpq);
    }

    private static void testMyStack() {
        MyStack<Character> stack = new MyStack<>(CAPACITY);

        System.out.println("\n testMyStack ");

        for (int i = 0; i < CAPACITY; i++) {
            stack.push(message2Reverse.charAt(i));
        }

        for (int i = 0; i < CAPACITY; i++) {
            System.out.print(stack.pop());
        }
    }

    public static String reverseString(String s) {
        MyStack<Character> stack = new MyStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += stack.pop();
        }
        return str;
    }

    private static void testReverse() {
        System.out.println("\n testReverse ");
        System.out.println(reverseString(message2Reverse));
    }

    private static void testMyDeque() {

        System.out.println("\n testMyDeque ");

        MyDeque deque = new MyDeque<Integer>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.insertLeft(22);
        System.out.println(deque.getTail());
        deque.insertLeft(33);
        System.out.println(deque.getTail());
        deque.insertLeft(44);
        System.out.println(deque.getTail());
        deque.insertRight(55);
        System.out.println(deque.getTail());
        System.out.println(deque);
        for (int i = 0; i < CAPACITY; i++) {
            deque.removeRight();
        }

        for (int i = 0; i < CAPACITY; i++) {
            deque.insertLeft(i + 10);
        }
        System.out.println(deque);

        System.out.println(deque.getSize() + " " + deque.getCapacity());
        System.out.println(deque.isFull());
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.removeRight();
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.insertLeft(77);
        System.out.println(deque.getHead() + " " + deque.getTail());
        System.out.println(deque);
    }

}

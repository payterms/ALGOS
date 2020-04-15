package Lesson4;

import java.util.Iterator;

public class Main {

    private static final int CAPACITY = 8;
    private static final String message2Reverse = "АБЫРВАЛГ";

    public static void main(String[] args) {
        testMyLinkedList();

    }

    private static void testMyLinkedList() {
        MyLinkedList<Character> linkedList = new MyLinkedList<>();

        for (int i = 0; i < CAPACITY; i++) {
            linkedList.insertLast(message2Reverse.charAt(i));
        }
        linkedList.insertLast('Ы');
        System.out.println(linkedList);

        Iterator<Character> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Iterator<Character> iter = linkedList.iterator();
        while (iter.hasNext()) {
            if (iter.next().charValue() == 'Ы') {
                iter.remove();
            }
        }

        System.out.println();

        for (Character s : linkedList) {
            System.out.print(s + " ");
        }

    }
}

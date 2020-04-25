package Lesson8;

import java.util.LinkedList;

public class ChainingHashMap<Key, Value> {
    private int capacity = 7;
    private int size = 0;

    private LinkedList<Node>[] st;

    public ChainingHashMap() {
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key null");
        }
        return true;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    public void delete(Key key) {
        isKeyNotNull(key);
        int hash = hash(key);
        for (Node node : st[hash]) {
            if (key.equals(node.key)) {
                st[hash].remove(node);
                return;
            }
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                sb.append(node.key + "=" + node.value + ", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

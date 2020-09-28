package csci235;

public class LinkedListQueue<T> implements Queue<T> {

    class Node <T> {
        private T value;
        private Node link;

        public Node (T val) {
            value = val;
        }
        public T getValue () {
            return value;
        }
        public void setLink (Node nxt) {
            link = nxt;
        }
        public Node getLink () {
            return link;
        }
    }

    private Node<T> first, last;
    private int sz;

    public LinkedListQueue () {
        first = last = null;
        sz = 0;
    }

    public void push (T val) {
        if (sz == 0) {
            first = last = new Node (val);
        } else {
            Node nxtNode = new Node (val);
            last.setLink(nxtNode);
            last = last.getLink();
        }
        sz += 1;
    }

    public T peek () throws Exception {
        if (sz == 0)
            throw new Exception("Queue is empty!");
        return first.getValue();
    }

    public void pop () throws Exception {
        if (sz == 0)
            throw new Exception("Queue is empty!");
        if (sz > 1) {
            Node saveNode = first;
            first = first.getLink();
            saveNode = null;
        } else {
            first = last = null;
        }
        sz -= 1;
    }

    public int size () {
        return sz;
    }

    public boolean empty () {
        if (sz == 0) return true;
        return false;
    }

    public void clear () {
        first = last = null;
        sz = 0;
    }

    public String toString () {
        String res = "[";
        Node<T> now = first;

        while (now != null) {
            res += now.getValue();
            if (now.getLink() != null) res += " ";
            now = now.getLink();
        }

        res += "]";
        return res;
    }
}

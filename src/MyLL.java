public class MyLL<T> {
    private class Node<T> {
        public T value;
        public Node<T> next;
        public Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    
    private Node<T> head;
    private Node<T> tail;

    public MyLL() {
        head = null;
        tail = null;
    }
    
    public void printList(Node<T> start) {
        Node<T> current = head;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void addToBack(T toAdd) {
        Node<T> newNode = new Node<T>(toAdd, null, null);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node<T> current = tail;
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    }
    
    public void printBackwards() {
        if (head == null) {
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.value);
        while(current.prev != null) {
            current = current.prev;
            System.out.println(current.value);
            }    
        }

    public boolean contains(T toFind) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(toFind)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T remove(T toRemove) {
        if (head == null) {
            return null; // null
        };
        if (head.value.equals(toRemove)) { 
            head = head.next;
            if (head == null) {
                tail = null;
                return toRemove;
            }            
            head.prev = null;
            return toRemove;
        }
        Node<T> current = head;
        while (current != null && current.next != null) {
            if (current.next.value.equals(toRemove)) {

                if (current.next != null && current.next.next != null) {
                    current.next = current.next.next; // change next links
                    current.next.prev = current; // change prev links same as current.next.prev.prev
                } else if (current.next == tail) {
                    tail = current;
                    tail.next = null;
                    return toRemove;
                }
                return toRemove;
            }
            current = current.next;
        }
        return null;
    }
}

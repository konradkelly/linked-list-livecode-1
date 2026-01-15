public class MyLL {
    private class Node {
        public char value;
        public Node next;

        public Node(char value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head;

    public MyLL() {
        head = null;
    }
    
    public void printList(Node start) {
        Node current = head;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public boolean contains(char toFind) {
        Node current = head;
        while (current != null) {
            if (current.value == toFind) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public char remove(char toRemove) {
        if (head == null) {
            return '\0';
        };
        if (head.value == toRemove) {
            head = head.next;
        }
        Node current = head;
        while (current != null) {
            if (current.value == toRemove) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return '\0';
    }
}

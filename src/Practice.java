public class Practice {
    public static void main(String[] args) {

        // Node head = new Node('g', null);
        // Node ryan = new Node('s', null);
        // head.next = ryan;
        // ryan.next = new Node('t', null);
        // ryan.next.next = new Node('x', null);
        
        // head = head.next;

        // printList(head);

        // //Expect to return true
        // System.out.println(contains(head, 'x'));

        // //Expect to return false
        // System.out.println(contains(head, 'g'));

        // remove(head, 't');
        // remove(head, 'x');
        // remove(head, 's');
        MyLL<Character> list = new MyLL<>();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        
        list.printBackwards();

        // list.printList(null);
        //        printList(head);

    MyLL<Integer> intList = new MyLL<>();
            // intList.addToBack(5);
            // intList.addToBack(99);
            // intList.addToBack(-333333);
            // intList.addToBack(66);
            //intList.addToBack("Hello");
        }

    public static void printList(Node start) {
        Node current = start;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node start, char toFind) {
        Node current = start;
        while (current != null) {
            if (current.value == toFind) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static char remove(Node head, char toRemove) {
        if (head == null) {
            return '\0';
        }
        if (head.value == toRemove) {
            head = head.next;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.value == toRemove) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return '\0';
    }
}
public class Link {
    Node head;
    Node tail;

    int size = 0;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        if(value == 0)
          size++;
    }

    public void addMid(int value) {
        if (head == null || size == 0) {
            addFirst(value);
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < size-1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}

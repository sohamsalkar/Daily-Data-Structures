//import jdk.javadoc.internal.doclets.formats.html.markup.Head;

class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}

class LinkedList {

    private Node head;
    private Node tail;

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public void setTail(Node node) {
        this.tail = node;
    }

    public void addAtEnd(String data) {
        Node node = new Node(data);

        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);

            this.tail = node;
        }
    }

    public void addAtBeginning(String data) {
        Node node = new Node(data);

        if (this.head == null) {
            this.head = this.tail = node;
        }

        else {
            node.setNext(this.head);
            this.head = node;
        }
    }

    public void display() {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node find(String data) {
        Node temp = this.head;

        while (temp != null) {
            if (temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public void insert(String data, String dataBefore) {
        Node node = new Node(data);

        if (this.head == null)
            this.head = this.tail = node;
        else {
            Node nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                if (nodeBefore == this.tail)
                    this.tail = node;
            } else
                System.out.println("Node not found");
        }
    }

    public void delete(String data) {

        if (this.head == null)
            System.out.println("List is empty");
        else {
            Node node = this.find(data);

            if (node == null)
                System.out.println("Node not found");

            if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);

                if (node == this.tail)
                    tail = null;
            } else {
                Node nodeBefore = null;
                Node temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }

                nodeBefore.setNext(node.getNext());

                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }
}

class Tester {

    public static void main(String args[]) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("10");
        linkedList1.addAtEnd("20");
        linkedList1.addAtEnd("30");
        linkedList1.addAtEnd("40");
        linkedList1.addAtEnd("50");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("10");
        linkedList2.addAtEnd("20");
        linkedList2.addAtEnd("30");
        linkedList2.addAtEnd("40");
        linkedList2.addAtEnd("50");

        System.out.println("Initial List");
        linkedList1.display();

        System.out.println("\nList after left shifting by 2 positions");
        shiftListLeft(linkedList1, 2);
        linkedList1.display();

        System.out.println("\nInitial List");
        linkedList2.display();

        System.out.println("\nList after right shifting by 2 positions");
        shiftListRight(linkedList2, 2);
        linkedList2.display();
    }

    public static void shiftListLeft(LinkedList linkedList, int n) {
        if (n == 0)
            return;
        Node temp = linkedList.getHead();
        int len = 1;
        while (temp.getNext() != null) {
            len++;
            temp = temp.getNext();
        }
        Node current = linkedList.getHead();
        int count = 1;
        while (count < (len - n) && current != null) {
            current = current.getNext();
            count++;
        }
        if (current == null)
            return;

        Node nthNode = current;
        while (current.getNext() != null)
            current = current.getNext();
        current.setNext(linkedList.getHead());
        linkedList.setHead(nthNode.getNext());
        nthNode.setNext(null);

    }

    public static void shiftListRight(LinkedList linkedList, int n) {
        if (n == 0)
            return;
        Node current = linkedList.getHead();
        int count = 1;
        while (count < n && current != null) {
            current = current.getNext();
            count++;
        }
        if (current == null)
            return;

        Node nthNode = current;
        while (current.getNext() != null)
            current = current.getNext();
        current.setNext(linkedList.getHead());
        linkedList.setHead(nthNode.getNext());
        nthNode.setNext(null);
    }
}

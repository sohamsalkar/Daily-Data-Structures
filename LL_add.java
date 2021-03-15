//import java.util.LinkedList;

public class LL_add {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();
        list.append("first");
        list.append("sec");
        list.append("third");
        list.append("frth");
        System.out.println("added all");
        list.display();
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

    public void append(String data) {
        Node node = new Node(data);
        if (this.head == null)
            this.head = this.tail = node;
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void display() {
        // Initialize temp to the head node
        Node temp = this.head;
        // Traverse the list and print data of each node
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

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
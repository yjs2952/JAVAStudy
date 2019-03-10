package algorithmStudy.book1.ch01;

public class LinkedListExample {

    public static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    private static void print_list(Node node) {
        while (node != null) {
            System.out.print(node.key + " ");
            node = node.next;
        }
    }

    private static void print_list2(Node node) {
        if (node == null) {
            return;
        }

        print_list2(node.next);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        print_list2(node);
    }
}

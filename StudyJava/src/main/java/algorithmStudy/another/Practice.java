package algorithmStudy.another;

public class Practice {

    static class Node {
        int value;
        Node nextNode;

        Node(int val) {
            value = val;
        }
    }

    private static Node solution(Node n1, Node n2) {

        if (n1 == null) return n2;
        if (n2 == null) return n1;

        Node merge;

        if (n1.value <= n2.value) {
            merge = n1;
            n1.nextNode = solution(n1.nextNode, n2);
        } else {
            merge = n2;
            n2.nextNode = solution(n1, n2.nextNode);
        }

        return merge;
    }

    private static void print(Node node) {
        if (node.nextNode == null) {
            System.out.print(node.value);
        } else {
            System.out.print(node.value + " ");
            print(node.nextNode);
        }
    }

    public static void main(String[] args) {
        Node n1_1 = new Node(1);
        Node n1_2 = new Node(3);
        Node n1_3 = new Node(6);
        Node n1_4 = new Node(7);
        Node n1_5 = new Node(9);
        Node n1_6 = new Node(11);
        Node n2_1 = new Node(2);
        Node n2_2 = new Node(4);
        Node n2_3 = new Node(5);
        Node n2_4 = new Node(8);
        Node n2_5 = new Node(10);
        Node n2_6 = new Node(12);
        Node n2_7 = new Node(13);
        Node n2_8 = new Node(14);
        Node n2_9 = new Node(15);

        n1_1.nextNode = n1_2;
        n1_2.nextNode = n1_3;
        n1_3.nextNode = n1_4;
        n1_4.nextNode = n1_5;
        n1_5.nextNode = n1_6;

        n2_1.nextNode = n2_2;
        n2_2.nextNode = n2_3;
        n2_3.nextNode = n2_4;
        n2_4.nextNode = n2_5;
        n2_5.nextNode = n2_6;
        n2_6.nextNode = n2_7;
        n2_7.nextNode = n2_8;
        n2_8.nextNode = n2_9;

        print(solution(n1_1, n2_2));
    }
}


class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class LeftViewBT {
    Node root;
    static int max_level_l = 0;
    static int max_level_r = 0;

    void leftViewUtil(Node node, int level) {

        if (node == null)
            return;

        if (max_level_l < level) {
            System.out.print(" " + node.data);
            max_level_l = level;
        }

        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    void rightViewUtil(Node node, int level) {

        if (node == null)
            return;

        if (max_level_r < level) {
            System.out.print(" " + node.data);
            max_level_r = level;
        }

        rightViewUtil(node.right, level + 1);
        rightViewUtil(node.left, level + 1);
    }

    void leftView() {
        leftViewUtil(root, 1);
    }

    void rightView() {
        rightViewUtil(root, 1);
    }

    public static void main(String args[]) {
        LeftViewBT tree = new LeftViewBT();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.root.right.right.right = new Node(60);

        tree.leftView();
        System.out.println();
        tree.rightView();
    }
}

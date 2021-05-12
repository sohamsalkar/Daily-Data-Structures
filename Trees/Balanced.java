class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Balanced {
    Node root;

    boolean isBalanced(Node root) {
        if (root != null) {
            boolean doghe = isBalanced(root.left) && isBalanced(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int h = Math.abs(lh - rh);

            if (h < 2 && doghe)
                return true;
            else
                return false;
        }
        return true;
    }

    static int height(Node node) {

        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    boolean isBalanced() {
        return isBalanced(root);
    }

    public static void main(String args[]) {
        // creating a binary tree and entering the nodes
        Balanced tree = new Balanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        // tree.root.right.left.left = new Node(7);
        // tree.root.right.left.left.left = new Node(8);
        // tree.root.right.left.left.left.left = new Node(9);

        System.out.println(tree.isBalanced());
    }

}

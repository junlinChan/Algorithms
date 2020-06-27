public class BinaryTree {

    class Node {

        public int data;

        public Node left;

        public Node right;

        public Node parent;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
            parent = null;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node find(int target) {
        Node cur = root;
        while (cur != null) {
            if (target < cur.data) {
                if (cur.left == null)
                    return cur;
                cur = cur.left;
            }
            else if (target > cur.data) {
                if (cur.right == null)
                    return cur;
                cur = cur.right;
            }
            else {
                return cur;
            }
        }
        return null;
    }

    public void put(int val) {
        Node node = new Node(val);
        if (root == null)
            root = node;
        else
        {
            Node parent = find(val);
            if (val < parent.data)
            {
                parent.left = node;
                parent.left.parent = parent;
                return;
            }
            else
            {
                parent.right = node;
                parent.right.parent = parent;
                return;
            }
        }
    }

}

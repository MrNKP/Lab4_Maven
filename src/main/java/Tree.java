public class Tree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public Node find(int key, Node from) {
        Node rez = null;
        if (from != null) {
            if (key == from.code) rez = from;
            if (rez == null && key > from.code) rez = find(key, from.right);
            if (rez == null && key < from.code) find(key, from.left);
        }
        return rez;
    }

    public void insert (int key, int data) {
        Node insNode = new Node();
        insNode.code = key;
        insNode.value = data;
        if (root == null) {
            root = insNode;
        }
        else {
            Node current = root;
            Node previous = null;
            boolean ins = false;
            while (!ins) {
                previous = current;
                if (key < previous.code) {
                    current = current.left;
                    if (current == null) {
                        previous.left = insNode;
                        ins = true;
                    }
                }
                else {
                    current = current.right;
                    if (current == null) {
                        previous.right = insNode;
                        ins = true;
                    }
                }
            }
        }
    }

    public void printTree() {
        Node start = root;
        print(start);
    }

    private void print(Node node) {
        if (node != null) {
            print(node.left);
            node.printNode();
            //print(node.left);
            print(node.right);
        }
    }
}

public class Node {
    public int code;
    public int value;
    public Node left;
    public Node right;

    public Node() {
        code = 0;
        value = 0;
        left = null;
        right = null;
    }

    public void printNode() {
        System.out.println("Code : " + code + " Value : " + value);
    }

}
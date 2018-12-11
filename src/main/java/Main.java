public class Main {
    public static void main(String[] args){
        Tree myTree = new Tree();
        myTree.insert(0, 9999);
        myTree.insert(3, 1234);
        myTree.insert(1, 4321);
        myTree.insert(4, 54);
        myTree.insert(2, 890);
        myTree.insert(5, 666);

        System.out.println("Finding Node with key == 4");
        Node findMyNode = new Node();
        findMyNode = myTree.find(4, myTree.getRoot());
        if (findMyNode != null) findMyNode.printNode();
        else System.out.println("Node can't be found");

        System.out.println("Finding Node with key == 6");
        findMyNode = myTree.find(6, myTree.getRoot());
        if (findMyNode != null) findMyNode.printNode();
        else System.out.println("Node can't be found");

        System.out.println("All Tree From root");
        myTree.printTree();

    }
}
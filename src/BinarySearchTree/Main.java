package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Tree treeInsert = new Tree();
        treeInsert.insert(25);
        treeInsert.insert(20);
        treeInsert.insert(15);
        treeInsert.insert(27);
        treeInsert.insert(30);
        treeInsert.insert(29);
        treeInsert.insert(26);
        treeInsert.insert(22);
        treeInsert.insert(32);
        treeInsert.insert(17);

        System.out.println("--Inorder traversal--");
        treeInsert.traverseInorder();
        System.out.println();
        System.out.println("--Preorder traversal--");
        treeInsert.traversePreorder();
        System.out.println();
        System.out.println("--Postorder traversal--");
        treeInsert.traversePostorder();
        System.out.println();

        System.out.println();
        System.out.println("Lets get some values");

        System.out.println("data = " + treeInsert.get(27));
        System.out.println("data = " + treeInsert.get(17));
        System.out.println("data = " + treeInsert.get(888));

        System.out.println("Print some min and max");

        System.out.println(treeInsert.min());
        System.out.println(treeInsert.max());

        System.out.println("------Now lets delete some nodes-------");
        treeInsert.traverseInorder();

        System.out.println();
        treeInsert.delete(25);
        treeInsert.traverseInorder();
        System.out.println();
    }

}

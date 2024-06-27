package P13;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta = new BinaryTreeArray21();
        int[] data = {6, 4, 8, 3, 5, 7, 9};
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.println("Inorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");

        System.out.println("Tambah new elements:");
        bta.add(10);
        bta.add(15);
        System.out.println("\nInorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}

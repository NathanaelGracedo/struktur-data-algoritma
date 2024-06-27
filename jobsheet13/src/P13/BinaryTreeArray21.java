package P13;

public class BinaryTreeArray21 {
    int[] data;
    int idxlast;

    public BinaryTreeArray21() {
        data = new int[10];
        idxlast = -1; // Initialize idxlast to -1 to indicate an empty tree
    }

    public void populateData(int[] data, int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(int data) {
        if (idxlast < this.data.length - 1) {
            idxlast++;
            this.data[idxlast] = data;
        } else {
            System.out.println("Tree is full");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
            System.out.print(this.data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(this.data[idxStart] + " ");
        }
    }
}

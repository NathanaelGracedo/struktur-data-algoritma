package P13;

public class BinaryTree21 {
    Node21 root;
    int size;
 
    public BinaryTree21() {
        root = null;
        size = 0;
    }
 
    public boolean isEmpty() {
        return root == null;
    }
 
    public void add(int data) {
        if (this.isEmpty()) {
            root = new Node21(null, data, null);
            return;
        }
 
        Node21 current = root;
        while (true) {
            if (data > current.data) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node21(null, data, null);
                    break;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node21(null, data, null);
                    break;
                }
            }
        }
    }
 
    public boolean find(int data) {
        boolean result = false;
        Node21 current = root;
        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }
 
    public void traversePreOrder(Node21 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
 
    public void traversePostOrder(Node21 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
 
    public void traverseInOrder(Node21 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }
 
    public Node21 getSuccessor(Node21 del) {
        Node21 successor = del.right;
        Node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
 
    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }
 
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node21 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
}

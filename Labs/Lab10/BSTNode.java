/**
 * The binary search tree node for integers ONLY.
 */
public class BSTNode {
    private int info;           // an integer contained in the node
    private BSTNode left;       // left child
    private BSTNode right;      // right child

    // initialize the node
    public BSTNode(int info) {
        this.info = info;
        left = null;
        right = null;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        int info = this.info;
        return info;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }
}

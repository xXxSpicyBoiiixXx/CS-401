/**
 * Binary search tree for integers ONLY.
 */
public class BinarySearchTree {
    protected BSTNode root;     // reference to the root of this binary search tree

    /**
     * Initializes the bst to empty creating a dummy root node.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Initialized the bst with a given root node
     * @param root A given binary tree node
     */
    public BinarySearchTree(BSTNode root) {
        this.root = root;
    }

    /**
     * returns true if this BST is empty, false otherwise
     * @return boolean value
     */
    public boolean isEmpty() {
        return root == null;
    }

    /////////////////// Your lab assignment starts from here //////////////////

    /**
     * Returns true if this BST contains a node with integer c
     * @param c an integer
     * @return
     */
    public boolean contains(int c) {
        return search(c, root);
    }

    /**
     * A recursive helper function for contains
     * Returns true if the subtree rooted at node contains integer c;
     * Otherwise return false.
     * @param c A target integer you want to search
     * @param node A binary search tree node
     * @return
     */
    public boolean search(int c, BSTNode node) {
        /* 1. Fill your code here */;
       if(node == null || c == node.getInfo())
       {
           if(node != null)
           {
               return true;
           }
           else
           {
               return false;
           }
       }

       else if(node.getInfo() < c)
       {
           return search(c, node.getRight());
       }

       else if(node.getInfo() > c)
        {
            return search(c, node.getLeft());
        }

       else{
           return false;
       }
        /* 1. End of your code */
    }

    /**
     * Adds integer c to this BST
     * @param c The integer that you want to add
     */
    public void add(int c) {
        root = recAdd(c, root);
    }

    /**
     * The recursive helper function for add.
     * Adds integer c to tree rooted at node; tree retains its BST property.
     * @param c The integer you want to add
     * @param node A binary tree node
     * @return binary tree node
     */
    public BSTNode recAdd(int c, BSTNode node) {
        /* 2. Fill your code here */

        if(node == null)
        {
            node = new BSTNode(c);
            return node;
        }
        if(c < node.getInfo())
        {
            node.setLeft(recAdd(c, node.getLeft()));
        }
        else if(c > node.getInfo())
        {
            node.setRight(recAdd(c, node.getRight()));
        }
        return node;
        /* 2. End of your code */
    }

    /**
     * An iterative implementation of add.
     * @param c The integer you want to add
     */
    public void iterAdd(int c) {
        /* 3. Fill your code here */
        BSTNode newNode = new BSTNode(c);
        BSTNode tempNode = root;
        BSTNode swapNode = null;
        if(tempNode == null)
        {
            add(c);
        }

        while(tempNode != null)
        {
            swapNode = tempNode;
            if(c < tempNode.getInfo())
            {
                tempNode = tempNode.getLeft();
            }
            else
            {
                tempNode = tempNode.getRight();
            }
        }

        if(swapNode == null)
        {
            add(c);
        }

        else if(c < swapNode.getInfo())
        {
            swapNode.setLeft(newNode);
        }

        else
        {
            swapNode.setRight(newNode);
        }

        add(c);
        /* 3. End of your code */
    }

    /**
     * Print the BST in preorder, inorder or postorder
     * @param t A enum type variable which is PREORDER, INORDER or POSTORDER
     */
    public void display(Traversal t) {
        switch(t) {
            case PREORDER:
                preorderDisplay(root);
                break;
            case INORDER:
                inorderDisplay(root);
                break;
            case POSTORDER:
                postorderDisplay(root);
                break;
            default:
                break;
        }
    }

    /**
     * Prints the integers of the subtree whose root is referenced by node.
     * Uses preorder traversal.
     * Can be implemented in a recursive way.
     * @param node
     */
    public void preorderDisplay(BSTNode node) {
        /* 4. Fill your code here */
        if (node != null) {
            System.out.print(node.getInfo() + " ");
            preorderDisplay(node.getLeft());
            preorderDisplay(node.getRight());
            /* 4. End of your code */
        }
    }

    /**
     * Prints the integers of the subtree whose root is referenced by node.
     * Uses inorder traversal.
     * Can be implemented in a recursive way.
     * @param node
     */
    public void inorderDisplay(BSTNode node) {
        /* 5. Fill your code here */
        if(node != null){
            inorderDisplay(node.getLeft());
            System.out.print(node.getInfo() + " ");
            inorderDisplay(node.getRight());
        }
        /* 5. End of your code */
   }

    /**
     * Prints the integers of the sbutree whose root is referenced by node.
     * uses postorder traversal.
     * Can be implemented in a recursive way.
     * @param node
     */
    public void postorderDisplay(BSTNode node) {
        /* 6. Fill your code here */
        if(node != null)
        {
            postorderDisplay(node.getLeft());
            postorderDisplay(node.getRight());
            System.out.print(node.getInfo() + " ");
        }
        
        /* 6. End of your code */
    }

    /**
     * Returns the maximum depth of this BST.
     * The maximum depth is the number of nodes along the longest path from the root node down
     * to the farthest leaf node.
     * @return
     */
    public int maxDepth() {
        return recMaxDepth(root);
    }

    /**
     * The recursive helper function for mexDepth
     * Returns the max depth of the subtree whose root is referenced by node
     * @param node
     * @return
     */
    private int recMaxDepth(BSTNode node) {
        /* 7. Fill your code here */
            if(node == null){
                return 0;
            }
            else{
                int leftDepth = recMaxDepth(node.getLeft());
                int rightDepth = recMaxDepth(node.getRight());

                if(leftDepth > rightDepth){
                    return leftDepth+1;
                }
                else{
                    return rightDepth+1;
                }

            }
        /* 7. End of your code */
    }
}
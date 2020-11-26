public class BinarySearchTree {

    protected Node root;

    class Node
    {
        private int info;
        private Node left;
        private Node right;

        public Node(int info)
        {
            this.info = info;
            left = null;
            right = null;
        }

        public void setInfo(int info)
        {
            this.info = info;
        }

        public int getInfo()
        {
            int info = this.info;
            return info;
        }

        public void setLeft(Node left)
        {
            this.left = left;
        }

        public void setRight(Node right)
        {
            this.right = right;
        }

        public Node getLeft()
        {
            return left;
        }

        public Node getRight()
        {
            return right;
        }
    }

    public BinarySearchTree()
    {
        root = null;
    }

    public BinarySearchTree(Node root)
    {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public boolean search(int c, Node node)
    {
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
    }

    public Node recAdd(int c, Node node)
    {
        if(node == null)
        {
            node = new Node(c);
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
    }

    public void display(Traversal t)
    {
        switch(t){
            case PREORDER:
                preorderDispaly(root);
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

    public void preorderDispaly(Node node)
    {
        if(node != null)
        {
            System.out.print(node.getInfo() + " ");
            preorderDispaly(node.getLeft());
            preorderDispaly(node.getRight());
        }
    }

    public void inorderDisplay(Node node)
    {
        if(node != null)
        {
            inorderDisplay(node.getLeft());
            System.out.print(node.getInfo() + " ");
            inorderDisplay(node.getRight());
        }
    }

    public void postorderDisplay(Node node)
    {
        if(node != null)
        {
            postorderDisplay(node.getLeft());
            postorderDisplay(node.getRight());
            System.out.print(node.getInfo() + " ");
        }
    }

    public int maxDepth()
    {
        return recMaxDepth(root);
    }

    private int recMaxDepth(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        else{
            int leftDepth = recMaxDepth(node.getLeft());
            int rightDepth = recMaxDepth(node.getRight());

            if(leftDepth > rightDepth)
            {
                return leftDepth+1;
            }
            else{
                return rightDepth+1;
            }
        }
    }
   /* // COME BACK TO FOR DELETION METHOD
    public Node delete(int c, Node root)
    {

    }

    */
}

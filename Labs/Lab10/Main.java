public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Check for recursive add function
        System.out.println("Add 25 15 50 10 35 70");
        bst.add(25);
        bst.add(15);
        bst.add(50);
        bst.add(10);
        bst.add(35);
        bst.add(70);

        /*
         *      root ---> 25
         *               /  \
         *              /    \
         *             /      \
         *            /        \
         *           /          \
         *         15            50
         *        /             /  \
         *       /             /    \
         *      10           35     70
         */

        // check for maximum depth and search
        System.out.println("The maximum depth is: " + bst.maxDepth());
        System.out.println("5 is in this tree: " + bst.contains(5));

        // inorder
        System.out.println("Inorder Traversal: ");
        bst.display(Traversal.INORDER);

        // preorder
        System.out.println("\nPreorder Traversal: ");
        bst.display(Traversal.PREORDER);

        // postorder
        System.out.println("\nPostorder Traversal: ");
        bst.display(Traversal.POSTORDER);

        // check for iterative add function
        System.out.println("\n");
        System.out.println("Continue adding 90 81 65 12");
        bst.iterAdd(90);
        bst.iterAdd(81);
        bst.iterAdd(65);
        bst.iterAdd(12);

        /*
         *      root ---> 25
         *               /  \
         *              /    \
         *             /      \
         *            /        \
         *           /          \
         *         15            50
         *        /             /  \
         *       /             /    \
         *      10            35    70
         *        \                /  \
         *        12             65   90
         *                           /
         *                          81
         */

        // check for depth and search
        System.out.println("The maximum depth is: " + bst.maxDepth());
        System.out.println("81 is in this tree: " + bst.contains(81));

        // inorder
        System.out.println("Inorder Traversal: ");
        bst.display(Traversal.INORDER);

        // preorder
        System.out.println("\nPreorder Traversal: ");
        bst.display(Traversal.PREORDER);

        // postorder
        System.out.println("\nPostorder Traversal: ");
        bst.display(Traversal.POSTORDER);
    }
}

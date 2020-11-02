public class LinkedList<T> {

    // Head node of the linked list in our case the queue
    Node<T> head;

    // Creates an empty list/queue
    public LinkedList(){
        head = null;
    }

    /*
     * Adds the node to the front of list/queue
     * @param information desired info to add
     */
    public void addToHead(T info){
        Node<T> newNode = new Node<>(info, null);
        if (head == null){
            head = newNode;
        }
        else{
            newNode.setNode(head);
            head = newNode;
        }
    }

    /*
     * Adds the node to the end of the linked list/queue
     * @param information desired info to add
     */

    public void addToTail(T info){
        Node <T> newNode = new Node<>(info, null);
        if(head == null){
            head = newNode;
        }
        else{
            Node currNode = head;
            while(currNode.getNode() != null){
                currNode = currNode.getNode();
            }

            currNode.setNode(newNode);
        }
    }

    /*
     * Get method for the head of the link list
     * @return The head of the node
     */

    public Node getHead(){
        return head;
    }

    /*
     * Removes the head of the linked list and reassigns head to the next node
     */
    public void removeHead()
    {
        if(head == null) {
            throw new UnderflowException("Removing things on an empty list");
        }
        else if(head.getNode() == null){
            head = null;
        }
        else{
            head = head.getNode();
        }
    }
    /*
     * Displays the list/queue
     */
    public void print(){
        if(head == null){
            ;
        }
        else{
            Node<T> currNode = head;
            while(currNode.getNode() != null)
            {
                System.out.println(currNode.getInfo());
                currNode = currNode.getNode();
            }
            System.out.println(currNode.getInfo());
        }
    }

    /*
     * Checks if the linked list/queue is empty
     * @return true if linked list is empty, false otherwise
     */

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull() {
        return false;
    }

}

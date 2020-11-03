public class FixedQueue<T> {

  
    private int DEFCAP = 100;
  
    private T[] queue;
   
    private int numElements = 0;
    
    private final int front = 0;
    
    private int rear = 0;


    FixedQueue() {
        queue = (T[]) new Object[DEFCAP];
    }

    /**
     * constructor method that allows queue size for input
     * @param sizeOfQueue max number of elements in queue
     */
    FixedQueue(int sizeOfQueue) {
        queue = (T[]) new Object[sizeOfQueue];
    }

    /**
     * adds generic object to the end of the queue
     * @param object object to be added to queue
     */
    public void enqueue(T object) {
        if (isEmpty()) {
            queue[0] = object;
            numElements++;
            return;
        } else if (!isFull()) {
            queue[rear+1] = object;
            rear++;
            numElements++;
            return;
        }
        System.out.println("Cannot enqueue on full queue.");
    }

    /**
     * removes object in the front of the queue and moves all other objects forward
     */
    public void dequeue() {
        if (!isEmpty()) {
            for (int i = front; i < rear; i++) {
                queue[i] = queue[i+1];
            }
            queue[rear] = null;
            numElements--;
            rear--;
            return;
        }
        System.out.println("Cannot dequeue from empty queue.");
    }

    /**
     * checks if queue if full
     * @return true if queue is full, false otherwise
     */
    public boolean isFull() {
        return numElements == queue.length;
    }

    /**
     * checks if queue is empty
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return numElements == 0;
    }

    /**
     * displays the queue (with no nulls) with the front of the queue on top
     */
    public void display() {
        if (!isEmpty()){
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
            return;
        }
        System.out.println("The queue is empty. Please enqueue an object.");
    }

    /**
     * displays the queue (with null for demonstration purposes) with the front of the queue on top
     */
    public void showArray() {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
    }
}

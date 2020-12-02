public class SortingLL {
    node head;
    node sorted;
    // node a, b;
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    node sortedMerge(node a, node b) {
        node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    node mergeSort(node h) {
        long startTime = System.nanoTime();
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        node middle = getMiddle(h);
        node nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        node left = mergeSort(h);

        // Apply mergeSort on right list
        node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        node sortedlist = sortedMerge(left, right);
        node print = sortedlist;

        while(print != null)
        {
            System.out.print(print.val + " ");
            print = print.next;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.print("\n Total execution time: " + elapsedTime + " nanoseconds.");

        return sortedlist;
    }

    // Utility function to get the middle of the linked list
    public static node getMiddle(node head) {
        if (head == null)
            return head;

        node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void push(int new_data) {
        /* allocate node */
        node new_node = new node(new_data);

        /* link the old list off the new node */
        new_node.next = head;

        /* move the head to point to the new node */
        head = new_node;
    }

    // function to sort a singly linked list using insertion sort
    void insertionSort(node headref)
    {
        long startTime = System.nanoTime();
        // Initialize sorted linked list
        sorted = null;
        node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
            node next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;
        node print = sorted;
        while(print != null)
        {
            System.out.print(print.val + " ");
            print = print.next;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.print("\n Total execution time: " + elapsedTime + " nanoseconds.");
    }

    void sortedInsert(node newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.val >= newnode.val)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.val < newnode.val)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    void addNode(int val)
    {
        if(head == null)
        {
            head = new node(val);
            return;
        }

        node curr = head;
        while(curr.next != null)
            curr = curr.next;

        node newNode = new node(val);
        curr.next = newNode;
    }

    node paritionLast(node start, node end)
    {
        if(start == end ||
                start == null || end == null)
            return start;

        node pivot_prev = start;
        node curr = start;
        int pivot = end.val;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while(start != end )
        {
            if(start.val < pivot)
            {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.val;
                curr.val = start.val;
                start.val = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.val;
        curr.val = pivot;
        end.val = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }

    void sort(node start, node end)
    {
        long startTime = System.nanoTime();
        if(start == end )
            return;

        // split list and partion recurse
        node pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if( pivot_prev != null &&
                pivot_prev == start )
            sort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if(pivot_prev != null &&
                pivot_prev.next != null)
            sort(pivot_prev.next.next, end);

        node print = start;
        while(print != null)
        {
            System.out.print(print.val + " ");
            print = print.next;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.print("\n Total execution time: " + elapsedTime + " nanoseconds.");

    }
}

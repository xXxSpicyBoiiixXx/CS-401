/*
# FILE: main.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/27/2020
REVISION: --
*/

// package Lab07;

public static class main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner nums = new Scanner(System.in);

        System.out.println("Initiating a queue for you...");
    LinkedListQueue<Example> queue = new LinkedListQueue<>();

        System.out.println("Queue initiated. Your queue is currently empty. What would you like to do?");
        System.out.println("Enqueue (a), Dequeue (r), Peek (p), Display (d), Quit (q)");
        String response = input.nextLine();
        System.out.println("Your input: "+ response);

        while (!response.equals("q")) {
        while (!"arpdq".contains(response)) {
            System.out.println("Please enter a for Enqueue, r for Dequeue, p for peek, d for display, or q for quit.");
            response = input.nextLine();
        }

        switch (response) {
            case "a":
                System.out.println("Do you want to enqueue your own Employee (0), or the Employee list from emp.txt (1)?");
                int push = nums.nextInt();
                while (!(push == 0 | push == 1)) {
                    System.out.println("Invalid response. Please respond with 0 (user input Employee) or 1 (emp.txt).");
                    push = nums.nextInt();
                }
                if (push == 0) {
                    System.out.println("What is the name of the employee you want to enqueue?");
                    String name = input.nextLine();
                    System.out.println("What is the ID of the employee you want to enqueue?");
                    String ID = input.nextLine();

                    queue.enqueue(new Employee(name, ID));
                    System.out.println("Successfully enqueued "+queue.peek()+" into the queue.");
                } else if (push == 1) {
                    while (text.hasNextLine()) {
                        String[] split = text.nextLine().split("\\s+");
                        queue.enqueue(new Employee(split[0], split[1]));
                    }
                    System.out.println("Successfully enqueued emp.txt into the queue.");
                }
                response = " ";
                break;
            case "r":
                if (!queue.isEmpty()) {
                    queue.dequeue();
                    System.out.println("Successfully Dequeued");
                    response = " ";
                } else {
                    System.out.println("The queue is empty! You need to enqueue something first.");
                    response = " ";
                }
                break;
            case "p":
                if (!queue.isEmpty()) {
                    System.out.println("The front of the queue is: "+queue.peek());
                    response = " ";
                } else {
                    System.out.println("The queue is empty! You need to enqueue something first.");
                    response = " ";
                }
                break;
            case "d":
                System.out.println("*******************************************");
                queue.display();
                System.out.println("*******************************************");
                response = " ";
                break;
            case "q":
                System.exit(1);
                break;
            default:
                response = " ";
        }
    }
}
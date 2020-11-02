public class CircularListTest {
    public static void main(String[] args) {
        CircularList<String> list = new CircularList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("c");
        list.add("d");
        list.add("f");

        System.out.println("The original list: \n" + list + " (Tail = \"" + list.getTail() + "\")\n");

        list.remove("c");
        list.remove("h");
        list.remove("f");
        System.out.println("After removing c, h, and f:\n" + list + " (Tail = \"" + list.getTail() + "\")\n");

        try {
            list.add(6, "h");
            list.add(8, "m");
        } catch (IndexOutOfBoundsException e){
            System.out.print("[EXCEPTION] ");
            System.out.println(e.getMessage());
        }

        System.out.println("After adding to index 6 and 8:\n" + list + " (Tail = \"" + list.getTail() + "\")\n");

        try {
            list.set(3, "k");
            list.set(9, "k");
        } catch (IndexOutOfBoundsException e) {
            System.out.print("[EXCEPTION] ");
            System.out.println(e.getMessage());
        }

        System.out.println("After setting k to index 3 and 9:\n" + list + " (Tail = \"" + list.getTail() + "\")\n");

        System.out.println("The index of d is " + list.indexOf("d"));
        System.out.println("The index of p is " + list.indexOf("p"));
        System.out.println("The index 5 is " + list.get(5));
        System.out.println("");

        try {
            for (int i = 0; i < 8; i++) {
                list.remove(0);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.print("[EXCEPTION] ");
            System.out.println(e.getMessage());
        }

        System.out.println("After several removes:\n" + list);
    }
}
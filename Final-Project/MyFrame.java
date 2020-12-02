import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class MyFrame<arr> extends JFrame{
    private JTextArea textArea;
    private PrintStream standardOut;



    private JMenuBar mb = new JMenuBar();
    private JMenu m1 = new JMenu("CS 401");
    private JMenu m2 = new JMenu("File");
    private JMenu m3 = new JMenu("Help");

    private JMenuItem m11 = new JMenuItem("About CS 401");
    private JMenuItem m12 = new JMenuItem("Md Ali");
    private JMenuItem m13 = new JMenuItem("Nam Nguyen");
    private JMenuItem m14 = new JMenuItem("About");
    private JMenuItem m15 = new JMenuItem("Exit");

    private JMenu m21 = new JMenu("Sort");
    private JMenu m22 = new JMenu("Search");
    private JMenuItem m23 = new JMenuItem("Binary Search Tree");
    private JMenuItem m25 = new JMenuItem("General Big O Descriptions");

    private JMenu m211 = new JMenu("Array");
    private JMenu m212 = new JMenu("Linked Lists");

    private JMenuItem m2111 = new JMenuItem("Insertion Sort");
    private JMenuItem m2112 = new JMenuItem("Bubble Sort");
    private JMenuItem m2113 = new JMenuItem("Merge Sort");
    private JMenuItem m2114 = new JMenuItem("Quick Sort");

    private JMenuItem m2121 = new JMenuItem("Insertion Sort");
    // Some issues with Bubble sort a singular linked list
    //private JMenuItem m2122 = new JMenuItem("Bubble Sort");
    private JMenuItem m2123 = new JMenuItem("Merge Sort");
    private JMenuItem m2124 = new JMenuItem("Quick Sort");

    private JMenu m221 = new JMenu("Array Search");
    private JMenu m222 = new JMenu("Linked Lists Search");

    private JMenuItem m2211 = new JMenuItem("Sequential Search");
    private JMenuItem m2212 = new JMenuItem("Fibonacci Search");
    private JMenuItem m2213 = new JMenuItem("Jump Search");
    private JMenuItem m2214 = new JMenuItem("Exponential Search");

    private JMenuItem m2221 = new JMenuItem("Iterative Search");
    private JMenuItem m2222 = new JMenuItem("Recursive Search");


    private JMenuItem m31 = new JMenuItem("Help");
    private JMenuItem m32 = new JMenuItem("Acknowledgements");
    private JMenuItem m33 = new JMenuItem("Space Station Easter Egg");

    public List<Integer> arrayList = new ArrayList<Integer>();
    SortingLL LinkedList = new SortingLL();
    //Node inputLL = new Node();
    SearchLinkedList list = new SearchLinkedList();
    BinarySearchTree bst = new BinarySearchTree();
    public MyFrame(){

        // Setting Title Stuff
        setTitle("CS401 Final Project");
        setSize(500,500);
        // setLocation(new Point(444,444));
        // setLayout(null);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //initComponent();
        initEvent();

        textArea = new JTextArea(50, 10);
        textArea.setEditable(true);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));

        // Keeps the reference of standard output stream
        standardOut = System.out;

        // Reassigns standard output stream and error output stream
        System.setOut(printStream);
        System.setErr(printStream);


        JButton btn = new JButton("OK");

        String[] choices = {"10 Numbers", "100 Numbers", "1000 Numbers", "Random"};
        JComboBox<String> cb = new JComboBox<String>(choices);
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Select a file to be as data.");

        add(panel);

        lbl.setVisible(true);

        panel.add(lbl);

        cb.setVisible(true);
        panel.add(cb);

        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String choice = (String) cb.getSelectedItem();
                try {
                    assert choice != null;
                    updateFile(choice);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        add(new JScrollPane(textArea));
        // Menu bar setup
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);

        m2.add(m21);

        m21.add(m211);
        m211.add(m2111);
        m211.add(m2112);
        m211.add(m2113);
        m211.add(m2114);

        m21.add(m212);
        m212.add(m2121);
        //m212.add(m2122);
        m212.add(m2123);
        m212.add(m2124);

        m2.add(m22);

        m22.add(m221);
        m221.add(m2211);
        m221.add(m2212);
        m221.add(m2213);
        m221.add(m2214);

        m22.add(m222);
        m222.add(m2221);
        m222.add(m2222);


        m2.add(m23);
        m2.add(m25);

        m3.add(m31);
        m3.add(m32);
        m3.add(m33);
        getContentPane().add(BorderLayout.NORTH, mb);
        getContentPane().add(BorderLayout.SOUTH,panel);
    }

    public int searchNum()
    {
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type the number you are looking for"));
        return value;
    }
    public void updateFile(String name) throws IOException {
        String file = null;
        if (name.equals("Random")) {
            String value = JOptionPane.showInputDialog(null, "Please enter how many random numbers you want to generate: ");
            int n = Integer.parseInt(value);
            RandomNumber.random(n);
            file = "random.txt";
        } else if (name.equals("10 Numbers")) {
            file = "TenNumbers.txt";

        } else if (name.equals("100 Numbers")) {
            file = "HundredNumbers.txt";
        } else if (name.equals("1000 Numbers")) {
            file = "ThousandNumbers.txt";

        }

        int print = JOptionPane.showConfirmDialog(null, "Would you like to print out your data?");

        if (print == JOptionPane.YES_OPTION) {
            Scanner input1;
            Scanner input2;
            Scanner input3;
            Scanner input4;
            assert file != null;
            input1 = new Scanner(new File(file));
            input2 = new Scanner(new File(file));
            input3 = new Scanner(new File(file));
            input4 = new Scanner(new File(file));
            while (input1.hasNextLine()) {
                arrayList.add(Integer.parseInt(input1.nextLine()));
            }
            while (input2.hasNextLine()) {
                LinkedList.push(Integer.parseInt(input2.nextLine()));
            }

            while (input4.hasNextLine()) {
                list.push(Integer.parseInt(input4.nextLine()));
            }
        while (input3.hasNextLine()) {
            System.out.println(input3.nextLine());
        }
        System.out.println();
    }
        else{
            Scanner input1;
            Scanner input2;
            Scanner input4;
            assert file != null;
            input1 = new Scanner(new File(file));
            input2 = new Scanner(new File(file));
            input4 = new Scanner(new File(file));
            while(input1.hasNextLine())
            {
                arrayList.add(Integer.parseInt(input1.nextLine()));}
            while(input2.hasNextLine())
            {LinkedList.push(Integer.parseInt(input2.nextLine()));}
            while (input4.hasNextLine()) {
                list.push(Integer.parseInt(input4.nextLine()));
            }
            System.out.println();
        }
    }

   /* public String fileToUse(String file) throw IOException{
        File myObject = new File(file);


    }*/
    private void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m11(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m12(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m13(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m14(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m15(e);
            }
        });

        m2111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2111(e);
            }
        });

        m2112.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2112(e);
            }
        });

        m2113.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2113(e);
            }
        });

        m2114.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2114(e);
            }
        });

        m2121.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2121(e);
            }
        });

        m2123.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2123(e);
            }
        });

        m2124.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2124(e);
            }
        });

        m2211.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2211(e);
            }
        });

        m2212.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2212(e);
            }
        });

        m2213.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2213(e);
            }
        });

        m2214.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2214(e);
            }
        });

        m2221.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2221(e);
            }
        });

        m2222.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m2222(e);
            }
        });

        m23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m23(e);
            }
        });

        m25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m25(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m31(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m32(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        m33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m33(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
    }

    public void m11(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("AboutCS401.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    // Reading introduction of Md Ali
    public void m12(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("mdAli.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    public void m13(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("nnam.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    public void m14(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("About.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    // Succesfully Exits out of the program
    private void m15(ActionEvent event){
        System.exit(0);
    }

    public void m2111(ActionEvent event)
    {
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
      SortingArray.insertionSortArray(arr);
    }

    public void m2112(ActionEvent event)
    {

        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SortingArray.bubbleSortArray(arr);
    }

    public void m2113(ActionEvent event)
    {

        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SortingArray.mergeSortArray(arr, arr.length);
    }

    public void m2114(ActionEvent event)
    {

        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SortingArray.quickSortArray(arr, 0, arr.length-1);
    }

    public void m2121(ActionEvent event)
    {
        LinkedList.insertionSort(LinkedList.head);
    }
    public void m2123(ActionEvent event){
       LinkedList.head = LinkedList.mergeSort(LinkedList.head);
    }

    public void m2124(ActionEvent event){
        SortingLL.node n = LinkedList.head;
        while(n.next != null)
        n = n.next;
        LinkedList.sort(LinkedList.head, n);
    }
    public void m2211(ActionEvent event)
    {
        int n = searchNum();
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SearchArray.search(arr, n);
    }
    public void m2212(ActionEvent event)
    {
        int n = searchNum();
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SearchArray.fibMonaccianSearch(arr,n,arr.length);
    }

    public void m2213(ActionEvent event)
    {
        int n = searchNum();
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SearchArray.jumpSearch(arr, n);
    }

    public void m2214(ActionEvent event)
    {
        int n = searchNum();
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        SearchArray.fibMonaccianSearch(arr,n,arr.length);
    }
    public void m2221(ActionEvent event)
    {
        int n = searchNum();

       SearchLinkedList.search(list.head, n);

    }

    public void m2222(ActionEvent event)
    {
        int n = searchNum();

        SearchLinkedList.RecursiveSearch(list.head, n);
    }

    public void m23(ActionEvent event)
    {
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr);
        for(int i = 0; i < arr.length; i++)
        {
            bst.add(arr[i]);
        }
        System.out.println("The maximum depth is: " + bst.maxDepth());
        System.out.println("Inorder Traversal: ");
        bst.display(Traversal.INORDER);
        System.out.println("\nPreorder Traversal: ");
        bst.display(Traversal.PREORDER);
        System.out.println("\nPostorder Traversal: ");
        bst.display(Traversal.POSTORDER);

    }

    public void m25(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BigO.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    public void m31(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Help.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    public void m32(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ACK.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

    public void m33(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("SpaceStationList.txt"));
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
        System.out.println();
    }

}

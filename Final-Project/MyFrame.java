import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
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
    private JMenu m23 = new JMenu("Binary Search Tree");
    private JMenu m25 = new JMenu("General Big O Descriptions");

    private JMenu m211 = new JMenu("Array");
    private JMenu m212 = new JMenu("Linked Lists");

    private JMenuItem m2111 = new JMenuItem("Insertion Sort");
    private JMenuItem m2112 = new JMenuItem("Bubble Sort");
    private JMenuItem m2113 = new JMenuItem("Merge Sort");
    private JMenuItem m2114 = new JMenuItem("Quick Sort");

    private JMenuItem m2121 = new JMenuItem("Insertion Sort");
    private JMenuItem m2122 = new JMenuItem("Bubble Sort");
    private JMenuItem m2123 = new JMenuItem("Merge Sort");
    private JMenuItem m2124 = new JMenuItem("Quick Sort");

    private JMenuItem m31 = new JMenuItem("Help");
    private JMenuItem m32 = new JMenuItem("Acknowledgements");
    private JMenuItem m33 = new JMenuItem("Space Station Easter Egg");

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
        m212.add(m2122);
        m212.add(m2123);
        m212.add(m2124);

        m2.add(m22);
        m2.add(m23);
        m2.add(m25);

        m3.add(m31);
        m3.add(m32);
        m3.add(m33);
        getContentPane().add(BorderLayout.NORTH, mb);
        getContentPane().add(BorderLayout.SOUTH,panel);
    }


    public void updateFile(String name) throws IOException {
        if(name.equals("Random"))
        {
            String value = JOptionPane.showInputDialog(null,"Please enter how many random numbers you want to generate: ");
            int n = Integer.parseInt(value);
            RandomNumber.random(n);

        }
        /*else
        {

        }*/

        int print = JOptionPane.showConfirmDialog(null, "Would you like to print out your data?");

        if(print == JOptionPane.YES_OPTION){
            Scanner input = new Scanner(new File("random.txt"));
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
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

    // Succesfully Exits out of the program
    private void m15(ActionEvent event){
        System.exit(0);
    }

    public void m2111(ActionEvent event)
    {   int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 2;
        arr[8] = 5;
        arr[9] = 7;
      SortingArray.insertionSortArray(arr);
    }

    public void m2112(ActionEvent event)
    {
        int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 2;
        arr[8] = 5;
        arr[9] = 7;
        SortingArray.bubbleSortArray(arr);
    }

    public void m2113(ActionEvent event)
    {
        int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 2;
        arr[8] = 5;
        arr[9] = 7;
        SortingArray.mergeSortArray(arr, arr.length);
    }

    public void m2114(ActionEvent event)
    {
        int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 2;
        arr[8] = 5;
        arr[9] = 7;
        SortingArray.quickSortArray(arr, 0, arr.length-1);
    }
}

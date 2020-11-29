import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class MyFrame extends JFrame{

    private JButton btnAdd = new JButton("Add");
    private JButton btnExit = new JButton("Exit");

    private JTextField txtA = new JTextField();
    private  JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();

    private JLabel lblA = new JLabel("A :");
    private JLabel lblB = new JLabel("B :");
    private JLabel lblC = new JLabel("C :");

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
    private JMenu m24 = new JMenu("Random Numbers");
    private JMenu m25 = new JMenu("General Big O Descriptions");

    private JMenu m211 = new JMenu("Array");
    private JMenu m212 = new JMenu("Linked Lists");

    private JMenuItem m2111 = new JMenuItem("Insertion Sort");
    private JMenuItem m2112 = new JMenuItem("Bubble Sort");
    private JMenuItem m2113 = new JMenuItem("Merge Sort");
    private JMenuItem m2114 = new JMenuItem("Quick Sort");

    private JMenuItem m31 = new JMenuItem("Help");
    private JMenuItem m32 = new JMenuItem("Acknowledgements");
    private JMenuItem m33 = new JMenuItem("Space Station Easter Egg");

    public MyFrame(){

        // Setting Title Stuff
        setTitle("CS401 Final Project");
        setSize(500,500);
        // setLocation(new Point(444,444));
        //setLayout(null);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //initComponent();
        initEvent();

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

        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        m2.add(m25);



        m3.add(m31);
        m3.add(m32);
        m3.add(m33);
        getContentPane().add(BorderLayout.NORTH, mb);

    }

   //private void updateTextArea(final)

    private void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

        /*m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    mdAli(e);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });*/
        m15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m15(e);
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAddClick(e);
            }
        });
    }

    /*public void mdAli(ActionEvent event) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/home/mordecai/IdeaProjects/Final-Project/src/mdAli.txt"));
        while(input.hasNextLine())
        {
            System.setOut(input.nextLine());
        }
    }*/
    private void m15(ActionEvent event){
        System.exit(0);
    }

    public void btnAddClick(ActionEvent evt){
        Integer x, y, z;
        try{
            x = Integer.parseInt(txtA.getText());
            y = Integer.parseInt(txtB.getText());
            z = x + y;
            txtC.setText(z.toString());
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

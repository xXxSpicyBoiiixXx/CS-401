import javax.swing.*;
import java.awt.*;

public class DropDown {

    public static void main(String args[]){
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("CS 401 Final Project");
        JMenu m2 = new JMenu("File");
        JMenu m3 = new JMenu("Edit");
        JMenu m4 = new JMenu("View");
        JMenu m5 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JMenuItem m21 = new JMenuItem("New Windows");
        JMenuItem m22 = new JMenuItem("New Tab");
        JMenuItem m23 = new JMenuItem("Open File...");
        JMenuItem m24 = new JMenuItem("Close Window");
        JMenuItem m25 = new JMenuItem("Close All Windows");
        JMenuItem m26 = new JMenuItem("Save");
        JMenuItem m27 = new JMenuItem("Save as...");
        JMenuItem m28 = new JMenuItem("Print");
        m2.add(m21);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }


}

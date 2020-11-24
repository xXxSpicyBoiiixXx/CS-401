import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{

    private JButton btnAdd = new JButton("Add");
    private JButton btnExit = new JButton("Exit");

    private JTextField txtA = new JTextField();
    private  JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();

    private JLabel lblA = new JLabel("A :");
    private JLabel lblB = new JLabel("B :");
    private JLabel lblC = new JLabel("C :");

    public MyFrame(){
        setTitle("Some Example");
        setSize(400,200);
        setLocation(new Point(300,200));
        setLayout(null);
        setResizable(false);

        initComponent();
        initEvent();
    }

    private void initComponent(){
        btnExit.setBounds(300,130,80,25);
        btnAdd.setBounds(300,100,80,25);

        txtA.setBounds(100,10,100,20);
        txtB.setBounds(100,35,100,20);
        txtC.setBounds(100,65,100,20);

        lblA.setBounds(20,10,100,20);
        lblB.setBounds(20,35,100,20);
        lblC.setBounds(20,65,100,25);

        add(btnExit);
        add(btnAdd);

        add(lblA);
        add(lblB);
        add(lblC);

        add(txtA);
        add(txtB);
        add(txtC);
    }

    private void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnExitClick(e);
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAddClick(e);
            }
        });
    }

    private void btnExitClick(ActionEvent evt){
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

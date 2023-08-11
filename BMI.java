import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMI extends JFrame implements ActionListener
{
    JTextField T1,T2,T3;
    JLabel l1,l2,l3;
    BMI(){
    getContentPane().setBackground(Color.white);
        setLayout(null);



        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("weights.jpg"));
        Image img2=img1.getImage().getScaledInstance(620,385,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel label2=new JLabel(img3);
        label2.setBounds(30,350,620,385);
        add(label2);



        JLabel heading=new JLabel("BMI CALCULATOR");
        heading.setBounds(230,35,400,40);
        heading.setFont(new Font("Gabriola",Font.BOLD,28));
        add(heading);


        l1 = new JLabel("Height(meters):");
        l1.setBounds(160,115,150,30);
        l1.setFont(new Font("Gabriola",Font.BOLD,20));
        add(l1);

        T1 = new JTextField();
        T1.setBounds(350,115,140,30);
        T1.setFont(new Font("System",Font.BOLD,16));
        add(T1);

        l2 = new JLabel("Weight(kg)");
        l2.setBounds(160,185,150,30);
        l2.setFont(new Font("Gabriola",Font.BOLD,22));
        add(l2);

        T2 = new JTextField();
        T2.setBounds(350,185,120,30);
        T2.setFont(new Font("System",Font.BOLD,16));
        add(T2);

        T3 = new JTextField();
        T3.setBounds(250,260,160,30);
        T3.setFont(new Font("System",Font.BOLD,16));
        add(T3);

        JButton b = new JButton("BMI");
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(300,310,60,30);
        b.addActionListener(this);
        add(b);

        setSize(700,900);
        setLocation(250,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        double val1=Double.parseDouble(T1.getText());
        int val2=Integer.parseInt(T2.getText());
        double result=val2/(Math.pow(val1,2));
        String s =String.format("%.2f",result);
        T3.setText(s);
    }
    public static void main(String[] args) {
        new BMI();
    }
}
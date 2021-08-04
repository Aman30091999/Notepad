package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Math_Question {
    Math_Question(){
         JFrame fr = new JFrame("Math Question Game");
                fr.setBounds(550, 250, 330, 300);
                fr.setBackground(Color.white);
                fr.setLocationRelativeTo(null);
                //fr.setDefaultCloseOperation(JFrame);
                fr.setLayout(new FlowLayout(56));
                Font f = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
                JTextField fg1 = new JTextField(8);
                fg1.setHorizontalAlignment(SwingConstants.CENTER);
                fg1.setText("45");
                fg1.setBackground(Color.WHITE);
                fg1.setForeground(Color.BLACK);
                fg1.setFont(f);
                fr.add(fg1);
                JLabel l = new JLabel("Choose");
                l.setFont(f);
                fr.add(l);
                JTextField fg = new JTextField(8);
                fg.setHorizontalAlignment(SwingConstants.CENTER);
                fg.setText("4");
                fg.setBackground(Color.WHITE);
                fg.setForeground(Color.BLACK);
                fg.setFont(f);
                fr.add(fg);
                JButton b = new JButton();
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setText("Multiply.");
                b.setFont(f);
                b.setBackground(Color.CYAN);
                b.setForeground(Color.BLACK);
                JButton b1 = new JButton();
                b1.setText("Add.");
                b1.setFont(f);
                b1.setBackground(Color.CYAN);
                b1.setForeground(Color.BLACK);
                JButton b2 = new JButton();
                b2.setHorizontalAlignment(SwingConstants.CENTER);
                b2.setText("Substract.");
                b2.setFont(f);
                b2.setBackground(Color.CYAN);
                b2.setForeground(Color.BLACK);
                JButton b3 = new JButton();
                b3.setHorizontalAlignment(SwingConstants.CENTER);
                b3.setText("Divide.");
                b3.setFont(f);
                b3.setBackground(Color.CYAN);
                b3.setForeground(Color.BLACK);
                JButton b4 = new JButton();
                b4.setHorizontalAlignment(SwingConstants.CENTER);
                b4.setText("Remender.");
                b4.setFont(f);
                b4.setBackground(Color.CYAN);
                b4.setForeground(Color.BLACK);
                JButton b5 = new JButton();
                b5.setHorizontalAlignment(SwingConstants.CENTER);
                b5.setText("GCD.");
                b5.setFont(f);
                b5.setBackground(Color.CYAN);
                b5.setForeground(Color.BLACK);
                JButton b6 = new JButton();
                b6.setHorizontalAlignment(SwingConstants.CENTER);
                b6.setText("LCM.");
                b6.setFont(f);
                b6.setBackground(Color.CYAN);
                b6.setForeground(Color.BLACK);
                JButton b7 = new JButton();
                b7.setHorizontalAlignment(SwingConstants.CENTER);
                b7.setText("Avg.");
                b7.setFont(f);
                b7.setBackground(Color.CYAN);
                b7.setForeground(Color.BLACK);
                JTextField l1 = new JTextField(10);
                l1.setFont(f);
                l1.setBackground(Color.white);
                l1.setForeground(Color.black);
                b.addActionListener(e -> {
                    int n1, n2;
                    int n3, n4;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    n4 = Integer.parseInt(s2);
                    n3 = n2 * n1;
                    l.setText("x");
                    if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b1.addActionListener(e -> {
                    int n1, n2, n3, n4;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    n4 = Integer.parseInt(s2);
                    n3 = n2 + n1;
                    l.setText("+");
                    if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b2.addActionListener(e -> {
                    int n1, n2;
                    int n3, n4;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    n4 = Integer.parseInt(s2);
                    n3 = n2 - n1;
                    l.setText("-");
                    if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b3.addActionListener(e -> {
                    int n1, n2;
                    float n3, n4;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    n4 = Float.parseFloat(s2);
                    n3 =(float) n2 / n1;
                    System.out.println(n3);
                    l.setText("/");
                    if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b4.addActionListener(e -> {
                    int n1, n2;
                    int n3, n4;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    n4 = Integer.parseInt(s2);
                    n3 = n2 % n1;
                    l.setText("%");
                   if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong !"+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b5.addActionListener(e -> {
                    int n1, n2;
                    BigInteger n3;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    int n4 = Integer.parseInt(s2);
                    BigInteger a = new BigInteger(s);
                    BigInteger be = new BigInteger(s1);
                    BigInteger bw = new BigInteger(s2);
                    n3 = a.gcd(be);
                    //assign biginteger to int
                    int n5 = n3.intValue();
                    // System.out.println(n3);
                    l.setText("GCD");
                    if (n4 == n5) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(n5));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n5));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b6.addActionListener(e -> {
                    int n1, n2;
                    BigInteger n3;
                    String s = fg.getText();
                    n1 = Integer.parseInt(s);
                    String s1 = fg1.getText();
                    n2 = Integer.parseInt(s1);
                    String s2 = l1.getText();
                    int n4 = Integer.parseInt(s2);
                    BigInteger a = new BigInteger(s);
                    BigInteger be = new BigInteger(s1);
                    BigInteger bw = new BigInteger(s2);
                    n3 = a.gcd(be);
                    //assign biginteger to int
                    int n5 = n3.intValue();
                    int lcm = n1 * n2 / n5;
                    // System.out.println(n3);
                    l.setText("LCM");
                    if (n4 == lcm) {
                        JOptionPane.showConfirmDialog(null, " Correct : "+String.valueOf(lcm));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(lcm));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                b7.addActionListener(e -> {
                    float n1, n2;
                    String s = fg.getText();
                    n1 = Float.parseFloat(s);
                    String s1 = fg1.getText();
                    n2 = Float.parseFloat(s1);
                    String s2 = l1.getText();
                    float n4 = Float.parseFloat(s2);
                    float n3 = n2 + n1;
                    n3 /= 2;
                    l.setText("Avg.");
                    if (n3 == n4) {
                        JOptionPane.showConfirmDialog(null, "Correct : "+String.valueOf(n3));
                    } else {
                        JOptionPane.showConfirmDialog(null, String.valueOf(n4)+" Wrong ! "+" Correct is : "+String.valueOf(n3));
                    }
                    int num = (int) (Math.random() * 100);
                    int num2 = (int) (Math.random() * 100);
                    fg1.setText(String.valueOf(num));
                    fg.setText(String.valueOf(num2));
                    l1.setText("");
                });
                Font font1 = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
                Label l2 = new Label("You have Enjoy this Math Question..");
                l2.setFont(font1);
                l2.setBackground(Color.white);
                l2.setForeground(Color.blue);
                fr.setLayout(new FlowLayout());
                fr.add(b);
                fr.add(b1);
                fr.add(b2);
                fr.add(b3);
                fr.add(b4);
                fr.add(b5);
                fr.add(b6);
                fr.add(b7);
                fr.add(l1);
                fr.add(l2);
                fr.setVisible(true);
    }
    public static void main(String[] args){
        Math_Question mq=new Math_Question();
    }
}

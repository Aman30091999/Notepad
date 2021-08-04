package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Even_Odd_Prime {

    int num;

    Even_Odd_Prime() {
        JFrame fr = new JFrame("Even/Odd & Prime Game");
        fr.setBounds(550, 250, 400, 300);
        fr.setBackground(Color.white);
        fr.setLocationRelativeTo(null);
        //fr.setDefaultCloseOperation(JFrame);
        fr.setLayout(new FlowLayout(56));
        Font f = new Font("Serif", Font.ITALIC | Font.BOLD, 20);
        JTextField fg = new JTextField(20);
        fg.setHorizontalAlignment(SwingConstants.CENTER);
        fg.setText("");
        fg.setBackground(Color.WHITE);
        fg.setForeground(Color.BLACK);
        fg.setFont(f);
        fr.add(fg);
        JRadioButton r1 = new JRadioButton("Even");
        JRadioButton r2 = new JRadioButton("Odd");
        JRadioButton r3 = new JRadioButton("Prime");
        JRadioButton r4 = new JRadioButton("Not Prime");
        r1.setFont(f);
        r2.setFont(f);
        r3.setFont(f);
        r4.setFont(f);
        fr.add(r1);
        fr.add(r2);
        fr.add(r3);
        fr.add(r4);
        JButton b = new JButton();
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setText(" START");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(f);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        b.addActionListener(e -> {
            if (r1.isSelected() != r2.isSelected()) {
                if (r1.isSelected()) {
                    if (num % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Even Number..! ");
                    }
                }
                if (r2.isSelected()) {
                    if (num % 2 != 0) {
                        JOptionPane.showMessageDialog(null, "Odd Number..! ");
                    }
                }
            } else if (r1.isSelected() == true || r2.isSelected() == true) {
                JOptionPane.showMessageDialog(null, "Please Choose One Option Odd or Even...! ");
            }
            //
            if (r3.isSelected() != r4.isSelected()) {
                int i, m = 0, flag = 0;

                m = num / 2;
                if (num == 0 || num == 1) {
                    JOptionPane.showMessageDialog(null, "Not Prime Number..! ");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (num % i == 0) {
                            JOptionPane.showMessageDialog(null, "Not Prime Number..! ");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        JOptionPane.showMessageDialog(null, "Prime Number..! ");
                    }
                }
            } else if (r3.isSelected() == true || r4.isSelected() == true) {
                JOptionPane.showMessageDialog(null, "Please Choose One Option Prime or Not...! ");
            }
            num = (int) (Math.random() * 10000);
            String s = String.valueOf(num);
            fg.setText(s);
            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            b.setText("Solve");
        });

        Font font1 = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
        JLabel l2 = new JLabel("You have Showing true Answer in message..!");
        l2.setFont(font1);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setBackground(Color.DARK_GRAY);
        l2.setForeground(Color.blue);
        fr.setLayout(new FlowLayout());
        fr.add(b);
        fr.add(l2);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        Even_Odd_Prime eop = new Even_Odd_Prime();
    }
}

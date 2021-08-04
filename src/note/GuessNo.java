package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuessNo {

    int num;

    GuessNo() {
        JFrame fr = new JFrame("Guessing Number Game");
        fr.setBounds(550, 250, 500, 200);
        fr.setBackground(Color.white);
        fr.setLocationRelativeTo(null);
        //fr.setDefaultCloseOperation(JFrame);
        fr.setLayout(new FlowLayout(56));
        Font f = new Font("Roboto", Font.ITALIC | Font.BOLD, 18);
        JLabel l = new JLabel("Please Guess No.-");
        l.setFont(f);
        fr.add(l);
        JTextField fg = new JTextField(10);
        fg.setHorizontalAlignment(SwingConstants.CENTER);
        fg.setBackground(Color.WHITE);
        fg.setForeground(Color.BLACK);
        fg.setFont(f);
        fr.add(fg);
        JButton b = new JButton();
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setText("GuessNo.");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(f);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);
        num = (int) (Math.random() * 100);
        b.addActionListener(e -> {
            int n;
            do {
                String s = fg.getText();
                n = Integer.parseInt(s);
                if (n == num) {
                    JOptionPane.showMessageDialog(null, " Correct Number Guess !!!.." + s);
                    num = (int) (Math.random() * 100);
                    break;
                } else if (n > num) {
                    JOptionPane.showMessageDialog(null, "Your Number to large = " + s);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Your Number to Small = " + s);
                    break;
                }
            } while (n >= 0);
            if (n == 0) {
                JOptionPane.showMessageDialog(null, "Your Answer = " + String.valueOf(num));
            }
            fg.setText("");
        });
        Font font1 = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
        JLabel l2 = new JLabel("Remember You ! You Enter Only 0 to 100");
        l2.setFont(font1);
        l2.setBackground(Color.DARK_GRAY);
        l2.setForeground(Color.blue);
        JLabel l1 = new JLabel("You have answer You Enter  0..!");
        l1.setFont(font1);
        l1.setBackground(Color.DARK_GRAY);
        l1.setForeground(Color.RED);
        fr.setLayout(new FlowLayout());
        fr.add(b);
        fr.add(l2);
        fr.add(l1);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        GuessNo g = new GuessNo();
    }
}

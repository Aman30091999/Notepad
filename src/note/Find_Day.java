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

public class Find_Day {
   Find_Day(){
        JFrame f = new JFrame();
                f.setBackground(Color.yellow);
                f.setBounds(500, 250, 380, 280);
                f.setLocationRelativeTo(null);
                Font font = new Font("Serif", Font.PLAIN, 22);
                JButton b = new JButton();
                b.setText("Find Day");
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setMnemonic(KeyEvent.VK_ALT);
                b.setFont(font);
                b.setBackground(Color.RED);
                b.setForeground(Color.BLACK);

                JTextField t = new JTextField(5);
                t.setHorizontalAlignment(SwingConstants.CENTER);
                t.setFont(font);
                f.add(t);
                JTextField t1 = new JTextField(5);
                t1.setHorizontalAlignment(SwingConstants.CENTER);
                t1.setFont(font);
                f.add(t1);
                JTextField t2 = new JTextField(6);
                t2.setHorizontalAlignment(SwingConstants.CENTER);
                t2.setFont(font);
                f.add(t2);

                JTextField l = new JTextField(7);
                t2.setHorizontalAlignment(SwingConstants.CENTER);
                t.setLocation(550, 170);

                l.setText("DAY");
                l.setHorizontalAlignment(SwingConstants.CENTER);
                l.setFont(font);
                l.setBackground(Color.cyan);
                l.setForeground(Color.BLACK);
                JTextField l1 = new JTextField(9);
                l1.setHorizontalAlignment(SwingConstants.CENTER);
                l1.setText("Year");
                l1.setHorizontalAlignment(SwingConstants.CENTER);
                l1.setFont(font);
                l1.setBackground(Color.cyan);
                l1.setForeground(Color.BLACK);
                b.addActionListener(e -> {
                    int date, month, year, day, add = 0, plus = 0;
                    String s = t.getText();
                    String s1 = t1.getText();
                    String s2 = t2.getText();
                    date = Integer.parseInt(s);
                    month = Integer.parseInt(s1);
                    year = Integer.parseInt(s2);
                    if (date <= 31 && month <= 12) {
                        if (year > 1) {
                            year = year % 400;
                            int cut = year % 4;
                            int leapyears = (year - cut) / 4;
                            int nonleap = year - leapyears;
                            plus = (nonleap + 2 * leapyears) % 7 - 1;
                        }
                        for (int m = 1; m <= month; m++) {
                            if (m == 1 || m == 3) {
                                add = 0;
                                add += add;
                            }
                            if (m == 5 || m == 7 || m == 10 || m == 12) {
                                add = 2;
                                plus += add;
                            }
                            if (m == 2 || m == 4 || m == 6 || m == 8 || m == 9 || m == 11) {
                                add = 3;
                                plus += add;
                            }
                        }
                        day = (date + plus) % 7;
                        if (day == 0) {
                            l.setText("Sunday");
                        }
                        if (day == 1) {
                            l.setText("Monday");
                        }
                        if (day == 2) {
                            l.setText("Tuesday");
                        }
                        if (day == 3) {
                            l.setText("Wednesday");
                        }
                        if (day == 4) {
                            l.setText("Thursday");
                        }
                        if (day == 5) {
                            l.setText("Friday");
                        }
                        if (day == 6) {
                            l.setText("Saturday");
                        }
                        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                            l1.setText("Leap Year");
                        } else {
                            l1.setText("Not Leap Year");
                        }

                    } else {
                        JOptionPane.showConfirmDialog(null, "Enter a Valid date and Month");
                    }
                });
                f.add(l1);
                f.add(l);
                Font font1 = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
                JLabel l2 = new JLabel("Remember What is the Day of the Date..");
                l2.setFont(font1);
                l2.setBackground(Color.DARK_GRAY);
                l2.setForeground(Color.blue);
                f.setLayout(new FlowLayout());
                f.add(b);
                f.add(l2);
                f.setVisible(true);

   }
   public static void main(String[] args){
       Find_Day fd=new Find_Day();
   }
}

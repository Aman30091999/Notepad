package note;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class Age_Calculator {

    int cd, cm, cy, bd, bm, by;

    Age_Calculator() {
        JFrame fr = new JFrame("Age Calculator.");
        fr.setBounds(50, 20, 550, 300);
        fr.setBackground(Color.white);
        fr.setLocationRelativeTo(null);
        //fr.setDefaultCloseOperation(JFrame);
        fr.setLayout(new FlowLayout(56));
        Font f = new Font("Serif", Font.ITALIC | Font.BOLD, 19);
        //Date of birth
        JLabel l = new JLabel("Current Date : ");
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setFont(f);
        fr.add(l);
        JLabel l1 = new JLabel("dd ");
        l1.setFont(f);
        fr.add(l1);
        JTextField fg = new JTextField(4);
        fg.setHorizontalAlignment(SwingConstants.CENTER);
        fg.setBackground(Color.WHITE);
        fg.setForeground(Color.BLACK);
        fg.setFont(f);
        fr.add(fg);
        JLabel l2 = new JLabel("mm ");
        l2.setFont(f);
        fr.add(l2);
        JTextField fg2 = new JTextField(4);
        fg2.setHorizontalAlignment(SwingConstants.CENTER);
        fg2.setBackground(Color.WHITE);
        fg2.setForeground(Color.BLACK);
        fg2.setFont(f);
        fr.add(fg2);
        JLabel l3 = new JLabel("yy ");
        l3.setFont(f);
        fr.add(l3);
        JTextField fg3 = new JTextField(4);
        fg3.setHorizontalAlignment(SwingConstants.CENTER);
        fg3.setBackground(Color.WHITE);
        fg3.setForeground(Color.BLACK);
        fg3.setFont(f);
        fr.add(fg3);
        //Current Date
        JLabel l4 = new JLabel("Date of Birth : ");
        l4.setFont(f);
        fr.add(l4);
        JLabel l5 = new JLabel("dd ");
        l5.setFont(f);
        fr.add(l5);
        JTextField fg4 = new JTextField(4);
        fg4.setHorizontalAlignment(SwingConstants.CENTER);
        fg4.setBackground(Color.WHITE);
        fg4.setForeground(Color.BLACK);
        fg4.setFont(f);
        fr.add(fg4);
        JLabel l6 = new JLabel("mm ");
        l6.setFont(f);
        fr.add(l6);
        JTextField fg5 = new JTextField(4);
        fg5.setHorizontalAlignment(SwingConstants.CENTER);
        fg5.setBackground(Color.WHITE);
        fg5.setForeground(Color.BLACK);
        fg5.setFont(f);
        fr.add(fg5);
        JLabel l7 = new JLabel("yy ");
        l7.setFont(f);
        fr.add(l7);
        JTextField fg6 = new JTextField(4);
        fg6.setHorizontalAlignment(SwingConstants.CENTER);
        fg6.setBackground(Color.WHITE);
        fg6.setForeground(Color.BLACK);
        fg6.setFont(f);
        fr.add(fg6);
        JLabel l8 = new JLabel(" Total Age     : ");
        l8.setFont(f);
        fr.add(l8);
        JLabel l9 = new JLabel("dd ");
        l9.setFont(f);
        fr.add(l9);
        JTextField fg7 = new JTextField(4);
        fg7.setHorizontalAlignment(SwingConstants.CENTER);
        fg7.setBackground(Color.WHITE);
        fg7.setForeground(Color.BLACK);
        fg7.setFont(f);
        fr.add(fg7);
        JLabel l10 = new JLabel("mm ");
        l10.setFont(f);
        fr.add(l10);
        JTextField fg8 = new JTextField(4);
        fg8.setHorizontalAlignment(SwingConstants.CENTER);
        fg8.setBackground(Color.WHITE);
        fg8.setForeground(Color.BLACK);
        fg8.setFont(f);
        fr.add(fg8);
        JLabel l11 = new JLabel("yy ");
        l11.setFont(f);
        fr.add(l11);
        JTextField fg9 = new JTextField(4);
        fg9.setHorizontalAlignment(SwingConstants.CENTER);
        fg9.setBackground(Color.WHITE);
        fg9.setForeground(Color.BLACK);
        fg9.setFont(f);
        fr.add(fg9);
        //Total Age
        JButton b = new JButton();
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setText("Calculate Age .");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(f);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        b.addActionListener(e -> {
            String s = fg.getText();
            int cd = Integer.parseInt(s);
            String s1 = fg2.getText();
            int cm = Integer.parseInt(s1);
            String s2 = fg3.getText();
            int cy = Integer.parseInt(s2);

            String s4 = fg4.getText();
            int bd = Integer.parseInt(s4);
            String s5 = fg5.getText();
            int bm = Integer.parseInt(s5);
            String s6 = fg6.getText();
            int by = Integer.parseInt(s6);

            int month[] = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};
            if (bd < 32 && cd < 32 && cm < 13 && bm < 13) {

                if (bd > cd) {
                    cm = cm - 1;
                    cd = cd + month[bm - 1];
                }
                if (bm > cm) {
                    cy = cy - 1;
                    cm = cm + 12;
                }

                // calculate date, month, year
                int td = cd - bd;
                int tm = cm - bm;
                int ty = cy - by;

                fg7.setText(String.valueOf(td));
                fg8.setText(String.valueOf(tm));
                fg9.setText(String.valueOf(ty));
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a right Day and Month");
            }
        });
        Label lol = new Label("  *--------------Enjoying This Game..----------------*  ");
        lol.setFont(f);
        lol.setBackground(Color.WHITE);
        lol.setForeground(Color.BLUE);
        Label lol1 = new Label("  Warning ! Not a Fill Total age Columns...   ");
        lol1.setFont(f);
        lol1.setBackground(Color.WHITE);
        lol1.setForeground(Color.RED);
        fr.setLayout(new FlowLayout());
        fr.add(b);
        fr.add(lol1);
        fr.add(lol);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        Age_Calculator a = new Age_Calculator();
    }
}

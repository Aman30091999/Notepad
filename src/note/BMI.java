package note;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class BMI {

    BMI() {
        JFrame f = new JFrame("BMI");
        f.setBackground(Color.yellow);
        f.setBounds(500, 250, 500, 350);
        f.setLocationRelativeTo(null);
        Font font = new Font("Serif", Font.PLAIN, 22);
        JButton b = new JButton();
        b.setText(" BMI Count");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(font);
        b.setBackground(Color.RED);
        b.setForeground(Color.BLACK);
        JLabel height = new JLabel("Height(Foot)");
        height.setHorizontalAlignment(SwingConstants.CENTER);
        height.setFont(font);
        f.add(height);
        JTextField t = new JTextField(5);
        t.setHorizontalAlignment(SwingConstants.CENTER);
        t.setFont(font);
        f.add(t);
        JLabel weight = new JLabel(" Weight(KG):");
        weight.setHorizontalAlignment(SwingConstants.CENTER);
        weight.setFont(font);
        f.add(weight);
        JTextField t1 = new JTextField(5);
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t1.setFont(font);
        f.add(t1);
        JLabel bm = new JLabel(" BMI-Count :");
        bm.setHorizontalAlignment(SwingConstants.CENTER);
        bm.setFont(font);
        f.add(bm);
        JTextField l = new JTextField(18);
        l.setFont(font);
        f.add(l);
        b.addActionListener(e -> {
            float bmi, h, w;
            String s = t.getText();
            String s1 = t1.getText();
            h = Float.parseFloat(s);
            w = Float.parseFloat(s1);
            h /= 3.28084;
            bmi = w / (h * h);
            System.out.println(bmi + " " + w + " " + h);
            l.setText(String.valueOf(bmi) + " Kg/m2.");
        });

        Font font1 = new Font("Serif", Font.ITALIC | Font.PLAIN, 20);
        Label l1 = new Label("  *----------    Underweight = < 18.5    ----------*   ");
        l1.setBackground(Color.WHITE);
        l1.setFont(font1);
        l1.setForeground(Color.blue);
        Label l2 = new Label(" *---------  Normal weight = 18.5 - 24.9  ---------* ");
        l2.setBackground(Color.WHITE);
        l2.setFont(font1);
        l2.setForeground(Color.blue);
        Label l3 = new Label("   *---------    Overweight = 25 - 29.9    ---------*   ");
        l3.setBackground(Color.WHITE);
        l3.setFont(font1);
        l3.setForeground(Color.blue);
        Label l4 = new Label("*---------   Obesity = BMI of 30 or greater   ---------*");
        l4.setBackground(Color.WHITE);
        l4.setFont(font1);
        l4.setForeground(Color.blue);
        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        BMI fd = new BMI();
    }
}

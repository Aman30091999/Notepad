package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ASCIICode {
    ASCIICode(){
         JFrame f = new JFrame("ASCII Code");
                f.setBackground(Color.white);
                f.setBounds(300, 250, 380, 260);
                Font fa = new Font("Serif", Font.ITALIC | Font.BOLD, 20);
                Font fa1 = new Font("Serif", Font.ITALIC | Font.BOLD, 17);
                TextArea tv = new TextArea(2, 15);
                tv.setFont(fa);
                tv.setBackground(Color.WHITE);
                f.add(tv);
                Label jk = new Label("Enter only one Character/Number/Symbols . ");
                jk.setBackground(Color.white);
                jk.setFont(fa1);
                jk.setForeground(Color.BLACK);
                f.add(jk);
                JButton b = new JButton("Code Convert");
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setBounds(100, 150, 150, 129);
                b.setMnemonic(KeyEvent.VK_ALT);
                b.setFont(fa);
                b.setBackground(Color.blue);
                b.setForeground(Color.white);
                f.add(b);
                JTextField l = new JTextField(7);
                l.setHorizontalAlignment(SwingConstants.CENTER);
                l.setBounds(140, 190, 250, 250);
                l.setFont(fa);
                l.setBackground(Color.cyan);
                l.setForeground(Color.BLACK);

                f.add(l);

                JLabel ll = new JLabel("Find Binary......!");
                ll.setBounds(170, 230, 250, 250);
                ll.setFont(fa);
                ll.setForeground(Color.cyan);
                f.add(ll);
                b.addActionListener(e -> {
                    String s = tv.getText();
                    char c = s.charAt(0);
                    int a = c;
                    String cv = String.valueOf(a);
                    l.setText(cv);
//
                    ll.setText("Binary No.- " + Integer.toBinaryString(a));
                });
                f.setLayout(new FlowLayout());
                f.setVisible(true);
            }
    
    public static void main(String[] args){
        ASCIICode a=new ASCIICode();
    }
}

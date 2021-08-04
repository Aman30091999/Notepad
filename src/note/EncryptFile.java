package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static note.NotePad.operate;

public class EncryptFile {
    EncryptFile(){
        JFrame f = new JFrame();
        f.setTitle("File Encryption");
        f.setBounds(250, 150, 450, 100);
        f.setBackground(Color.lightGray);
        f.setLocationRelativeTo(null);
        Font font = new Font("Roboto", Font.ITALIC | Font.BOLD, 22);
        JButton b = new JButton();
        b.setText("Set Secuity");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(font);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        JTextField t = new JTextField(10);
        t.setFont(font);
        f.add(t);
        b.addActionListener(e -> {
            System.out.println("Remember Your Keys");
            String text = t.getText();
            int temp = Integer.parseInt(text);
            operate(temp);//key  
        });

        f.setLayout(new FlowLayout());
        f.add(b);
        f.setVisible(true);
    }
    public static void main(String[] args){
        EncryptFile er=new EncryptFile();
    }
}

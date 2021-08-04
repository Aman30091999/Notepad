package note;

import net.sourceforge.tess4j.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.util.*;
import java.time.LocalTime;
import java.util.concurrent.*;
import static note.FlappyBird.flappyBird;

public class NotePad extends Frame {

    int num = (int) (Math.random() * 10000);
    //copy copyall selectall paste we useing it.
    String s = "";
    //using multiple Style for font 
    Font f;
    MenuItem mi22, mi23, mi24, mi25, mi26, mi27, m31, m32, m33, m34, m35;

    public NotePad() {
        Image im = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aman Gupta\\Documents\\NetBeansProjects\\myNotepad\\src\\note\\notepad.png");
        setIconImage(im);

        f = new Font("Serif", Font.PLAIN, 14);
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Format");
        Menu m5 = new Menu("Themes");
        Menu m8 = new Menu("Help");
        Menu m9 = new Menu("Gaming");
        Menu m10 = new Menu("Features");
        //font
        Menu m11 = new Menu("Menu Font");
        m5.setFont(f);
        m3.setFont(f);
        m2.setFont(f);
        m1.setFont(f);
        m8.setFont(f);
        m9.setFont(f);
        m10.setFont(f);
        m11.setFont(f);
        //Menu m4=new Menu("Open");

        MenuItem fs = new MenuItem("Text Size");
        MenuItem t1 = new MenuItem("Pink Mozarella");
        MenuItem t2 = new MenuItem("Oceanic");
        MenuItem t3 = new MenuItem("Silver Voilet");
        MenuItem t4 = new MenuItem("Dark Mode");
        MenuItem t5 = new MenuItem("Light");
        MenuItem mi1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem openall = new MenuItem("Open All");
        MenuItem mi3 = new MenuItem("Save             Ctrl + S");
        MenuItem mi4 = new MenuItem("Save As");
        MenuItem td = new MenuItem("Time & Date");
        MenuItem print = new MenuItem("Print");
        MenuItem exit = new MenuItem("Exit               Ctrl + E");

        MenuItem mi5 = new MenuItem("cut");
        MenuItem mi6 = new MenuItem("copy                      Ctrl + C");
        MenuItem mi11 = new MenuItem("copy all                  Ctrl + A");
        MenuItem mi7 = new MenuItem("Paste                     Ctrl + V");
        MenuItem mi12 = new MenuItem("No Paste                    Ctrl + V");
        MenuItem del = new MenuItem("Delete                   Ctrl + D");
        MenuItem find = new MenuItem("PDF Reder ");
        MenuItem textreader = new MenuItem("ImagerText Reader");
        MenuItem search = new MenuItem("Search");
        MenuItem replace = new MenuItem("Replace");
        MenuItem gotos = new MenuItem("GOTO");
        MenuItem selectall = new MenuItem("SelectAll");
        //
        MenuItem aash = new MenuItem("ASCII Code      Alt + A");
        MenuItem unit = new MenuItem("Unit Convertor                           Ctrl + U");
        MenuItem fday = new MenuItem("Find Day                                    Ctrl + F");
        MenuItem tictac = new MenuItem("Tic Tac Toe Game                      Alt  + T");
        MenuItem ep = new MenuItem("Even/Odd Prime Game                Ctrl + P");
        MenuItem math = new MenuItem("Math Queston Game                   Ctrl + M");
        MenuItem GuessNo = new MenuItem("Guess No. Game                        Ctrl + G");
        MenuItem mi19 = new MenuItem("Typing Master                           Ctrl + W");
        MenuItem snake = new MenuItem("Snake Game                                Alt + S");
        MenuItem agecal = new MenuItem("Age Calculator                             Alt + C");
        MenuItem flapy = new MenuItem("Flapy Bird                                   Alt + F");
        MenuItem bmi = new MenuItem(" BMI                                          Alt + B");

        //Font
        Menu mi8 = new Menu("Font-Style");
        MenuItem f1 = new MenuItem("Tahoma");
        f1.setFont(new Font("Thahoma", Font.ITALIC | Font.BOLD, 14));
        MenuItem f2 = new MenuItem("SERIF");
        f2.setFont(new Font("Serif", Font.ITALIC, 14));
        MenuItem f3 = new MenuItem("SansSerif");
        f3.setFont(new Font("SensSerif", Font.ITALIC, 14));
        MenuItem f4 = new MenuItem("PLAIN");
        f4.setFont(new Font("Serif", Font.PLAIN, 14));
        MenuItem f5 = new MenuItem("MONOSPACED");
        f5.setFont(new Font("MONOSPACED", Font.ITALIC, 14));
        MenuItem f6 = new MenuItem("BOLD ITALIC");
        f6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 14));
        MenuItem f7 = new MenuItem("DIALOG");
        f7.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 14));
        MenuItem f8 = new MenuItem("HANGING_BASELINE");
        f8.setFont(new Font("Serif", Font.HANGING_BASELINE, 14));
        MenuItem f9 = new MenuItem("SERIF BOLD");
        f9.setFont(new Font("Serif", Font.BOLD | Font.PLAIN, 14));
        mi8.add(f1);
        mi8.add(f2);
        mi8.add(f3);
        mi8.add(f4);
        mi8.add(f5);
        mi8.add(f6);
        mi8.add(f7);
        mi8.add(f8);
        mi8.add(f9);
//Font-Color
        Menu a = new Menu("Font-Color");
        MenuItem a1 = new MenuItem("BLACK");
        MenuItem a2 = new MenuItem("WHITE");
        MenuItem a3 = new MenuItem("RED");
        MenuItem a4 = new MenuItem("GREEN");
        MenuItem a5 = new MenuItem("YELLOW");
        MenuItem a6 = new MenuItem("GRAY");
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);
        MenuItem mi10 = new MenuItem("Help");

        //typing master
        //Encryption
        MenuItem mi20 = new MenuItem("Encryption       Ctrl + I");
        MenuItem mi21 = new MenuItem("Terminal         Ctrl + T");
        //font type
        mi22 = new MenuItem("TAHOMA ITALIC");
        mi22.setFont(new Font("Tahoma", Font.ITALIC | Font.HANGING_BASELINE, 15));
        mi23 = new MenuItem("TAHOMA BOLD");
        mi23.setFont(new Font("Tahoma", Font.BOLD, 15));
        mi24 = new MenuItem("ROMAN_BASELINE");
        mi24.setFont(new Font("MONOSPACED", Font.LAYOUT_NO_START_CONTEXT, 15));
        mi25 = new MenuItem("PLAIN");
        mi25.setFont(new Font("SansSerif", Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
        mi26 = new MenuItem("SERIF ITALIC");
        mi26.setFont(new Font("Serif", Font.LAYOUT_NO_START_CONTEXT, 15));
        mi27 = new MenuItem("SERIF BOLD");
        mi27.setFont(new Font("Serif", Font.PLAIN, 15));
        m31 = new MenuItem("SansSerif ITALIC");
        m31.setFont(new Font("SansSerif", Font.ITALIC, 15));
        m32 = new MenuItem("HANGING_BASELINE");
        m32.setFont(new Font("Serif", Font.HANGING_BASELINE, 15));
        m33 = new MenuItem("BOLD ITALIC");
        m33.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
        //Font italic
        mi22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("DIALOG_INPUT", Font.ITALIC, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);

            }
        });
        mi23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Tahoma", Font.BOLD, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        mi24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("MONOSPACED", Font.LAYOUT_NO_START_CONTEXT, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        mi25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("SansSerif", Font.LAYOUT_NO_LIMIT_CONTEXT, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        mi26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.ITALIC, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        mi27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.PLAIN, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        m31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("SansSerif", Font.ITALIC, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        m32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.HANGING_BASELINE, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });
        m33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.BOLD | Font.ITALIC, 15);
                m5.setFont(f);
                m3.setFont(f);
                m2.setFont(f);
                m1.setFont(f);
                m8.setFont(f);
                m9.setFont(f);
                m10.setFont(f);
                m11.setFont(f);
            }
        });

        CheckboxMenuItem cmi1 = new CheckboxMenuItem("Word Wrap", true);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m5);
        //mb.add(m6);
        mb.add(m8);
        mb.add(m9);
        mb.add(m10);
        mb.add(m11);
        m11.add(mi22);
        m11.add(mi23);
        m11.add(mi24);
        m11.add(mi25);
        m11.add(mi26);
        m11.add(mi27);
        m11.add(m31);
        m11.add(m32);
        m11.add(m33);
        m10.add(aash);
        m3.add(fs);
        m1.add(mi1);
        m1.add(open);
        m1.add(openall);
        //m1.add(m4);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(td);
        m1.add(print);
        m1.add(exit);
        //Edit
        m2.add(del);
        m2.add(gotos);
        m2.add(search);
        m2.add(replace);
        m2.add(selectall);

        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi11);
        //  m2.add(mi12);
        m2.add(mi7);
        m3.add(mi8);
        m3.add(a);
        m3.add(cmi1);
        //m4.add(mi9);
        //m4.add(mi10);
        m5.add(t1);
        m5.add(t2);
        m5.add(t3);
        m5.add(t4);
        m5.add(t5);
        //helping
        m8.add(mi10);
        //typing master
        m9.add(mi19);
        //GuessNumber Game
        m9.add(GuessNo);
        //Math Queston
        m9.add(math);
        //Even/Odd & Prime Number
        m9.add(ep);
        //Tic-Tac-Toe Game
        m9.add(tictac);
        //Find a Day of Date
        m9.add(fday);
        //Unit Convertor
        m9.add(unit);
        //Snake Game
        m9.add(snake);
        //age Calculator
        m9.add(agecal);
        //flapy bird
        m9.add(flapy);
        //BMI
        m9.add(bmi);
        //Encryption
        m10.add(mi20);
        //image text Reader
        m10.add(textreader);
        m10.add(find);
        //add terminal
        m10.add(mi21);
        setMenuBar(mb);
//TextArea
        TextArea ta = new TextArea("What you have to type today?", 23, 34); //TextArea.SCROLLBARS_VERTICAL_ONLY);
        Color clr = new Color(200, 100, 150);
        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S) {
                    String fname = JOptionPane.showInputDialog("Enter File Name");
                    JFileChooser j = new JFileChooser("f:");

                    // Invoke the showsSaveDialog function to show the save dialog
                    int r = j.showSaveDialog(null);

                    if (r == JFileChooser.APPROVE_OPTION) {

                        // Set the label to the path of the selected directory
                        File fi = new File(j.getSelectedFile().getAbsolutePath());

                        try {
                            // Create a file writer
                            FileWriter wr = new FileWriter(fi, false);

                            // Create buffered writer to write
                            BufferedWriter w = new BufferedWriter(wr);

                            // Write
                            w.write(ta.getText());

                            w.flush();
                            w.close();
                        } catch (Exception evt) {
                            JOptionPane.showMessageDialog(null, evt.getMessage());
                        }
                    }
                }
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_D) {
                    ta.setText(ta.getText().replace(ta.getSelectedText(), ""));
                }

                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_E) {
                    System.exit(2);
                }
                //math question
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_M) {
                    Math_Question mq = new Math_Question();
                }
                //unit converor
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_U) {
                    UnitConvertor uc = new UnitConvertor();
                }
                //Find day
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_F) {
                    Find_Day fd = new Find_Day();
                }
                //GuessNo
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_G) {
                    GuessNo g = new GuessNo();
                }
                //tic tac toe
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_T) {
                    TicTac t = new TicTac();
                }
                //event odd
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_P) {
                    Even_Odd_Prime eop = new Even_Odd_Prime();
                }
                //ASCII Code
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_A) {
                    ASCIICode a = new ASCIICode();
                }
                //Age Calculator
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_C) {
                    new Age_Calculator();
                }
                //Snake Game
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_S) {
                    new GameFrame();
                }
                //flappy bird
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_F) {
                    flappyBird = new FlappyBird();
                }
                //BMI
                if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_B) {
                    BMI fd = new BMI();
                }
                //terminal
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_T) {//crtl+t
                    try {
                        Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start"});
                    } catch (Exception as) {
                        as.printStackTrace();
                    }
                }
                //WPS
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_W) {//crtl+t
                    try {
                        WPM();
                    } catch (Exception er) {
                        er.printStackTrace();
                    }
                }
                //Encryption
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_I) {
                    EncryptFile er = new EncryptFile();
                }
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_A) {
                    String st = ta.getText();
                    System.out.println(st);
                }

            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        ta.setFont(new Font("Roboto", Font.ITALIC, 14));
        add(ta);

        // String cmdText = ev.getActionCommand();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );
        //time & Date
        td.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.insert(new Date().toString(), ta.getSelectionStart());

            }
        }
        );
        //Find Day
        fday.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Find_Day fd = new Find_Day();
            }
        });

        //Even/Odd Prime Number
        ep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Even_Odd_Prime eop = new Even_Odd_Prime();
            }
        }
        );
        //TicTacToe
        tictac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                TicTac ty = new TicTac();
            }
        });
        //Snake Game
        snake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new GameFrame();
            }
        });
        //age Calculator
        agecal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Age_Calculator();
            }
        });
        //GuessNo.
        GuessNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GuessNo g = new GuessNo();
            }
        }
        );
        //math question
        math.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Math_Question mq = new Math_Question();
            }
        }
        );
        //Unit Convertor
        unit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                UnitConvertor uc = new UnitConvertor();
            }
        });
        //flapy bird
        flapy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                flappyBird = new FlappyBird();
            }
        });
        //BMI
        bmi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                BMI fd = new BMI();
            }
        });
        //goto
        gotos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JFrame fr = new JFrame("Search");
                fr.setBounds(550, 250, 240, 200);
                fr.setBackground(Color.white);
                fr.setLocationRelativeTo(null);
                //fr.setDefaultCloseOperation(JFrame);
                fr.setLayout(new FlowLayout(56));
                JTextField fg = new JTextField(10);
                Font f = new Font("Roboto", Font.ITALIC | Font.BOLD, 22);
                fg.setBackground(Color.WHITE);
                fg.setForeground(Color.BLACK);
                fg.setFont(f);
                fr.add(fg);
                JButton b = new JButton("Search");
                b.setBackground(Color.CYAN);
                b.setForeground(Color.BLACK);
                b.setFont(f);
                b.addActionListener(e -> {
                    int pos = ta.getCaretPosition();
                    int currentLine = 0;
                    String text = ta.getText();
                    //if (IJ.isWindows()) {
                    text = text.replaceAll("\r\n", "\n");
                    //}
                    char[] chars = new char[text.length()];
                    chars = text.toCharArray();
                    int count = 0;
                    int start = 0, end = 0;
                    int len = chars.length;
                    for (int i = 0; i < len; i++) {
                        if (chars[i] == '\n') {
                            count++;
                            start = end;
                            end = i;
                            if (pos >= start && pos < end) {
                                currentLine = count;
                                break;
                            }
                        }
                    }
                    if (currentLine == 0 && pos > end) {
                        currentLine = count;
                    }

                    JOptionPane.showMessageDialog(null, currentLine);
                }
                );

                fr.add(b);
                fr.setVisible(true);
            }
        });

        //Search
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JFrame fr = new JFrame("Search");
                fr.setBounds(250, 20, 300, 150);
                fr.setBackground(Color.darkGray);
                fr.setLocationRelativeTo(null);
                //fr.setDefaultCloseOperation(JFrame);
                fr.setLayout(new FlowLayout(56));
                JTextField fg = new JTextField(10);
                fg.setHorizontalAlignment(SwingConstants.CENTER);
                //fg.setBounds(150, 150, 250, 50);
                Font f = new Font("Serif", Font.ITALIC | Font.PLAIN, 23);
                fg.setBackground(Color.WHITE);
                fg.setForeground(Color.BLACK);
                fg.setFont(f);
                fr.add(fg);
                JButton b = new JButton("Search");
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setBackground(Color.CYAN);
                b.setForeground(Color.BLACK);
                b.setMnemonic(KeyEvent.VK_ALT);
                b.setFont(f);
                b.addActionListener(e -> {
                    String s = ta.getText().toLowerCase();
                    String s1 = fg.getText().toLowerCase();

                    if (s.contains(s1)) {
                        JOptionPane.showMessageDialog(null, s1 + " is Available Your TXT File");
                    } else {
                        JOptionPane.showMessageDialog(null, s1 + " is not Available Your TXT File");
                    }
                }
                );

                fr.add(b);
                fr.setVisible(true);
            }
        });

//Replace
        replace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JFrame fr = new JFrame("Replace");
                //fr.setTitle("File Encryption");
                fr.setBounds(350, 250, 300, 200);
                fr.setBackground(Color.white);
                fr.setLocationRelativeTo(null);
                //fr.setDefaultCloseOperation(JFrame);
                fr.setLayout(new FlowLayout(56));
                JTextField fg = new JTextField(13);
                fg.setHorizontalAlignment(SwingConstants.CENTER);
                //fg.setBounds(150, 150, 250, 50);
                Font f = new Font("Serif", Font.ITALIC | Font.PLAIN, 23);
                fg.setBackground(Color.WHITE);
                fg.setForeground(Color.BLACK);
                fg.setFont(f);
                fr.add(fg);
                JTextField fg1 = new JTextField(13);
                fg1.setHorizontalAlignment(SwingConstants.CENTER);
                fg1.setBackground(Color.WHITE);
                fg1.setForeground(Color.BLACK);
                fg1.setFont(f);
                fr.add(fg1);
                JButton b = new JButton("Replace");
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setBackground(Color.CYAN);
                b.setMnemonic(KeyEvent.VK_ALT);
                b.setForeground(Color.BLACK);
                b.setFont(f);
                b.addActionListener(e -> {
                    String s = ta.getText().toLowerCase();
                    String s1 = fg.getText().toLowerCase();
                    String s2 = fg1.getText();
                    if (s.contains(s1)) {
                        ta.setText(s.replace(s1, s2));
                        JOptionPane.showMessageDialog(null, "You Change is SuccessFully");
                    } else {
                        JOptionPane.showMessageDialog(null, "You Word In Not Present in File");
                    }
                    fg.setText("");
                    fg1.setText("");
                }
                );
                //fr.add(b1);
                fr.add(b);
                fr.setVisible(true);

            }
        });
        //Exit

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);

            }
        }
        );

        print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(NotePad.this.add(ta),
                        "Get ur printer repaired first! It seems u dont have one!",
                        "Bad Printer",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        }
        );
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("");
            }
        }
        );
        selectall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.selectAll();
            }
        }
        );
        mi3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // String st = ta.getText();
                //Save ss = new Save(st);
                JFileChooser j = new JFileChooser("f:");

                // Invoke the showsSaveDialog function to show the save dialog
                int r = j.showSaveDialog(null);

                if (r == JFileChooser.APPROVE_OPTION) {

                    // Set the label to the path of the selected directory
                    File fi = new File(j.getSelectedFile().getAbsolutePath());

                    try {
                        // Create a file writer
                        FileWriter wr = new FileWriter(fi, false);

                        // Create buffered writer to write
                        BufferedWriter w = new BufferedWriter(wr);

                        // Write
                        w.write(ta.getText());

                        w.flush();
                        w.close();
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(null, evt.getMessage());
                    }
                }
            }
        });
        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                ta.setText("");
            }
        });
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                PDFManager pdfManager = new PDFManager();

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {

                    try {
                        pdfManager.setFilePath(fileChooser.getSelectedFile().getAbsolutePath());
                        String text = pdfManager.toText();
                        ta.setText(text);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //open folder
        textreader.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //call class.
                Tesseract tesseract = new Tesseract();
                tesseract.setDatapath("C:\\Program Files (x86)\\Tesseract-OCR\\tessdata");
                //choose File
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {

                    try {
                        //image read
                        String text = tesseract.doOCR(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                        ta.setText(text);
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(fileChooser, evt.getMessage());
                    }
                }

            }

        }
        );
        //Open File Using.
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File fi = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    try {
                        // String
                        String s1 = "", sl = "";

                        // File reader
                        FileReader fr = new FileReader(fi);

                        // Buffered reader
                        BufferedReader br = new BufferedReader(fr);

                        // Initialize sl
                        sl = br.readLine();

                        // Take the input from the file
                        while ((s1 = br.readLine()) != null) {
                            sl = sl + "\n" + s1;
                        }

                        // Set the text
                        ta.setText(sl);
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(fileChooser, evt.getMessage());
                    }

                }
            }
        });
        //OPen All type File
        openall.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JFileChooser f = new JFileChooser();
                f.showOpenDialog(null);
                File fi = new File(f.getSelectedFile().getAbsolutePath());
                try {
                    Desktop.getDesktop().open(fi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        mi4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // String fname = JOptionPane.showInputDialog("Enter File Name");
                JFileChooser chooser = new JFileChooser();
                File fi = null;
                chooser.setDialogTitle("Save As...");
                chooser.setApproveButtonText("Save Now");
                chooser.setApproveButtonMnemonic(KeyEvent.VK_S);
                chooser.setApproveButtonToolTipText("Click me to save!");

                do {
                    fi = chooser.getSelectedFile();
                    if (!fi.exists()) {
                        break;
                    }
                    if (JOptionPane.showConfirmDialog(
                            null, "<html>" + fi.getPath() + " already exists.<br>Do you want to replace it?<html>",
                            "Save As", JOptionPane.YES_NO_OPTION
                    ) == JOptionPane.YES_OPTION) {
                        break;
                    }
                } while (true);

            }
        });
        //help
        mi10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Created by:Aman Gupta \n Email-Akum96392@gmail.com \n http://localhost:8080/ChatBot/ :)");

            }
        });
//Typing Master
        mi19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    WPM();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//Encrpyprion
        mi20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                EncryptFile er = new EncryptFile();
            }
        });
        //terminal
        mi21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Just one line and you are done ! 
                    // We have given a command to start cmd
                    // /K : Carries out command specified by string
                    //Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"});
                    Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start"});
                    // Runtime.getRuntime().exec(new String[] {"javac .java","java"});

                } catch (Exception e) {
                    System.out.println("HEY Buddy ! U r Doing Something Wrong ");
                    e.printStackTrace();
                }
            }
        });
        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                s = ta.getSelectedText();

                System.out.println(s); //come here
            }
        });
        mi11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                s = ta.getText();
                System.out.println(s);

            }
        });
        mi7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.insert(s, ta.getCaretPosition());
            }
        });
        mi12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                try {
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                    ta.append((String) c.getData(DataFlavor.stringFlavor));
                    //System.out.println(c.getData(DataFlavor.stringFlavor));
                } catch (Exception e) {
                }
            }
        });
        //font Name
        f1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Thahoma", Font.ITALIC | Font.BOLD, 14);
                ta.setFont(f);
            }
        });
        f2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("SensSerif", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.PLAIN, 14);
                ta.setFont(f);
            }
        });
        f5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("MONOSPACED", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.BOLD | Font.ITALIC, 14);
                ta.setFont(f);
                ta.setForeground(Color.black);
            }
        });
        f7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Tahoma", Font.TRUETYPE_FONT, 14);
                ta.setFont(f);
                ta.setForeground(Color.BLACK);
            }
        });
        f8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.HANGING_BASELINE, 14);
                ta.setFont(f);
                ta.setForeground(Color.blue);
            }
        });
        f9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.BOLD | Font.PLAIN, 14);
                ta.setFont(f);
                ta.setForeground(Color.blue);
            }
        });
        //Font-Color
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.black);
            }
        });
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.WHITE);
            }
        });
        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.RED);
            }
        });
        a4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.GREEN);
            }
        });
        a5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.yellow);
            }
        });
        a6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setForeground(Color.DARK_GRAY);
            }
        });
        mi5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                    StringSelection testData;
                    String selt = ta.getSelectedText();
                    if ((selt.length() > 0)) {
                        testData = new StringSelection(selt);
                    } else {
                        testData = new StringSelection("Test Data");
                    }

                    c.setContents(testData, testData);
                    ta.setText(ta.getText().replace(ta.getSelectedText(), ""));

                } catch (Exception e) {
                }
            }
        });
        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(200, 100, 150);
                ta.setBackground(clr);
                ta.setForeground(Color.YELLOW);
                ta.setFont(new Font("Harrington", Font.PLAIN, 24));
            }
        });
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(200, 200, 250);
                ta.setBackground(clr);
                ta.setForeground(Color.BLACK);
                ta.setFont(new Font("Arial Unicode MS", Font.PLAIN, 24));

            }
        });
        t3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(50, 40, 50);
                ta.setBackground(clr);
                ta.setForeground(Color.WHITE);
                ta.setFont(new Font("Roboto", Font.PLAIN, 14));
            }
        });
        t4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(0, 0, 0);
                ta.setBackground(clr);
                ta.setForeground(Color.WHITE);
                ta.setFont(new Font("Roboto", Font.BOLD, 20));
            }
        });
        t5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //Color clr = new Color(0, 0, 0);

                ta.setBackground(Color.white);
                ta.setForeground(Color.BLACK);

                ta.setFont(new Font("Roboto", Font.BOLD, 20));
            }
        });

        fs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String size = JOptionPane.showInputDialog(null, "Enter Numeric Values Only!");
                Float fsize = Float.parseFloat(size);
                Font font = ta.getFont();
                float nsize = fsize;
                ta.setFont(font.deriveFont(nsize));
            }
        });
//ASCII Code
        aash.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ASCIICode a = new ASCIICode();
            }
        });
        try {
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("A.ttf")));
        } catch (IOException | FontFormatException e) {
            //Handle exception
        }

    }

    public static void main(String[] args) {
        NotePad m = new NotePad();
        m.setTitle("NotePad");
        m.setSize(650, 650);

        m.setBackground(Color.WHITE);
        m.setResizable(true);
        m.setVisible(true);
        Dimension dim = m.getToolkit().getScreenSize();
        int screenWidth = dim.width;
        int screenHeight = dim.height;
        int frameWidth = screenWidth / 3;
        int frameHeight = screenHeight / 3;
        m.setLocation((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2);

    }

    private static void WPM() throws InterruptedException {
        JFrame f = new JFrame();
        f.setTitle("Typing Master");
        f.setBounds(550, 250, 700, 400);
        f.setBackground(Color.white);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout(56));

        //f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        Font font = new Font("Serif", Font.PLAIN, 22);
//
        System.out.println("Welcome");
        TimeUnit.SECONDS.sleep(1);
        Random r = new Random();
//create button
        JButton b = new JButton();
        b.setText("Check Typing Speed.");
        b.setMnemonic(KeyEvent.VK_ALT);
        b.setFont(font);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        //create textField
        double start = LocalTime.now().toNanoOfDay();
        TextArea t = new TextArea(9, 42);
        t.setBackground(Color.WHITE);
        t.requestFocusInWindow();

        t.setFont(font);
        JScrollPane s = new JScrollPane();
        s.add(t);
        f.add(t);

        //button action
        b.addActionListener(e -> {

            String text = t.getText();
            String words[] = text.split("\\s");
            int n = words.length;
            double end = LocalTime.now().toNanoOfDay();
            double elsetime = end - start;
            double sec = elsetime / 1000000000.0;
            int numc = text.length();
            String w = "Words";
            int wps = (int) (((double) (numc / 5) / sec) * 60);
            System.out.println("WPS");
            System.out.println(wps);
            System.out.println("text No.");
            System.out.println(n);
            JOptionPane.showConfirmDialog(null, wps);
            //  JOptionPane.showInternalConfirmDialog(null, wps, "speed", n);
            JOptionPane.showConfirmDialog(null, n);
        });
        f.add(b);
        f.setVisible(true);

    }

    //Encryption Operation 
//Encyption key are passed in this function.
    public static void operate(int key) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        //file input stream

        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;
            for (byte b : data) {
                System.out.println(b);
                data[i] = (byte) (b ^ key);//xor b and key
                i++;
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

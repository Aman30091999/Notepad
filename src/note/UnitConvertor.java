package note;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UnitConvertor {

    UnitConvertor() {
        JFrame fr = new JFrame("Unit Convertor");
        fr.setBounds(550, 250, 500, 200);
        fr.setBackground(Color.white);
        fr.setLocationRelativeTo(null);
        //fr.setDefaultCloseOperation(JFrame);
        fr.setLayout(new FlowLayout(56));
        JTextField fg = new JTextField(10);
        fg.setHorizontalAlignment(SwingConstants.CENTER);
        Font f = new Font("Serif", Font.ITALIC | Font.PLAIN, 18);
        fg.setBackground(Color.WHITE);
        fg.setForeground(Color.BLACK);
        fg.setFont(f);
        fr.add(fg);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Units ");
        m.setFont(f);
        JMenuItem m1 = new JMenuItem("Meter To KM");
        m1.setFont(f);
        JMenuItem m2 = new JMenuItem("KM To Meter");
        JMenuItem m3 = new JMenuItem("Meter To CM");
        JMenuItem m4 = new JMenuItem("Miles To KM");
        JMenuItem m5 = new JMenuItem("Yard To KM");
        JMenuItem m6 = new JMenuItem("Foot To KM");
        JMenuItem m7 = new JMenuItem("Inch To KM");
        JMenuItem m8 = new JMenuItem("Foot To meter");
        JMenuItem m9 = new JMenuItem("Foot To Inch");
        JMenuItem m11 = new JMenuItem("Hectare To Sq. KM");
        JMenuItem m12 = new JMenuItem("Acre To  Hectare");
        JMenuItem m13 = new JMenuItem("Leter To Mililiter");
        m2.setFont(f);
        m3.setFont(f);
        m4.setFont(f);
        m5.setFont(f);
        m6.setFont(f);
        m7.setFont(f);
        m8.setFont(f);
        m9.setFont(f);
        m11.setFont(f);
        m12.setFont(f);
        m13.setFont(f);
        //Time
        JMenu t = new JMenu("Time ");
        t.setFont(f);
        mb.add(t);
        JMenuItem m10 = new JMenuItem("Second To  MiliSecond");
        JMenuItem m14 = new JMenuItem("Second To Minute");
        JMenuItem m15 = new JMenuItem("Second To Hours");
        JMenuItem m16 = new JMenuItem("Day To Second");
        JMenuItem m17 = new JMenuItem("Day To  Minute");
        JMenuItem m18 = new JMenuItem("Week To Second");
        JMenuItem m19 = new JMenuItem("Week To Minute");
        JMenuItem m20 = new JMenuItem("Month To Second");
        JMenuItem m21 = new JMenuItem("Month To Minute");
        m10.setFont(f);
        m14.setFont(f);
        m15.setFont(f);
        m16.setFont(f);
        m17.setFont(f);
        m18.setFont(f);
        m19.setFont(f);
        m20.setFont(f);
        m21.setFont(f);
        //Temprature
        JMenu mt = new JMenu("Temprature ");
        mt.setFont(f);
        mb.add(mt);
        JMenuItem m22 = new JMenuItem("Cesius To Fahrenheit");
        JMenuItem m23 = new JMenuItem("Fahrenheit To  Kelven");
        JMenuItem m24 = new JMenuItem("Kelvin To Cesius");
        JMenuItem m25 = new JMenuItem("Cesius To Kelvein");
        JMenuItem m26 = new JMenuItem("Fahrenheit To Cesius");
        m22.setFont(f);
        m23.setFont(f);
        m24.setFont(f);
        m25.setFont(f);
        m26.setFont(f);
        //Spped
        JMenu ms = new JMenu("Speed ");
        ms.setFont(f);
        mb.add(ms);
        JMenuItem m27 = new JMenuItem("Meter/sec To Km/hrs");
        JMenuItem m28 = new JMenuItem("KM/hrs To meter/sec");
        JMenuItem m29 = new JMenuItem("Miles/hrs To Km/hrs");
        JMenuItem m30 = new JMenuItem("Km/hrs To Foot/sec");
        m27.setFont(f);
        m28.setFont(f);
        m29.setFont(f);
        m30.setFont(f);
        //Frequency
        JMenu mm = new JMenu("Frequency ");
        mm.setFont(f);
        mb.add(mm);
        JMenuItem m31 = new JMenuItem("Hertz To Kilohertz");
        JMenuItem m32 = new JMenuItem("Kilohertz To Megahertz");
        JMenuItem m33 = new JMenuItem("Hertz To Megahertz");
        m31.setFont(f);
        m32.setFont(f);
        m33.setFont(f);
        //Area 
        JMenu a = new JMenu("Area ");
        a.setFont(f);
        mb.add(a);
        JMenuItem a1 = new JMenuItem("Meter Sq. to Ft Sq. ");
        JMenuItem a2 = new JMenuItem("Ft Sq. To cm Sq.");
        JMenuItem a3 = new JMenuItem("mi Sq. To acre");
        JMenuItem a4 = new JMenuItem("Ac To M Sq.");
        JMenuItem a5 = new JMenuItem("Are To M Sq.");
        JMenuItem a6 = new JMenuItem("Hecture To Km Sq. ,M Sq.");
        JMenuItem a7 = new JMenuItem("Hecture To Ac, Are");
        JMenuItem a9 = new JMenuItem("KM Sq. To Ha, Meter Sq.");
        JMenuItem a8 = new JMenuItem("Acre To Ft Sq.");
        a1.setFont(f);
        a2.setFont(f);
        a3.setFont(f);
        a4.setFont(f);
        a5.setFont(f);
        a6.setFont(f);
        a7.setFont(f);
        a8.setFont(f);
        a9.setFont(f);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        m.add(m6);
        m.add(m7);
        m.add(m8);
        m.add(m9);
        t.add(m10);
        m.add(m11);
        m.add(m12);
        m.add(m13);
        t.add(m14);
        t.add(m15);
        t.add(m16);
        t.add(m17);
        t.add(m18);
        t.add(m19);
        t.add(m20);
        t.add(m21);
        mt.add(m22);
        mt.add(m23);
        mt.add(m24);
        mt.add(m25);
        mt.add(m26);
        ms.add(m27);
        ms.add(m28);
        ms.add(m29);
        ms.add(m30);
        mm.add(m31);
        mm.add(m32);
        mm.add(m33);
        //mm.add(m34);
        //Area
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);
        a.add(a7);
        a.add(a8);
        a.add(a9);

        mb.add(m);

        fr.add(mb);
        JTextArea er = new JTextArea(2, 14);
        er.setFont(f);

        m1.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            float meter = u / 1000;
            er.setText(Float.toString(meter) + " KM");
        });
        m10.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            float meter = u * 1000;
            er.setText(Float.toString(meter) + " Milisecond");
        });
        //KM To Meter
        m2.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            float meter = u * 1000;
            er.setText(Float.toString(meter) + " meter");
        });
        m3.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            float meter = u * 100;
            er.setText(Float.toString(meter) + " Cm");
        });
        m4.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 1.60934;
            er.setText(Double.toString(meter) + " Km");
        });
        m5.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.0009144;
            er.setText(Double.toString(meter) + " Km");
        });
        m6.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.0003048;
            er.setText(Double.toString(meter) + " Km");
        });
        m7.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 2.54e-5;
            er.setText(Double.toString(meter) + " Cm");
        });
        m8.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.3048;
            er.setText(Double.toString(meter) + " m");
        });
        m9.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 12;
            er.setText(Double.toString(meter) + " inch");
        });
        m11.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u / 100;
            er.setText(Double.toString(meter) + " sq.km");
        });
        m12.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.404686;
            er.setText(Double.toString(meter) + " Km");
        });
        m13.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 1000;
            er.setText(Double.toString(meter) + " Mililiter");
        });
        m14.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.0166667;
            er.setText(Double.toString(meter) + " minute");
        });
        m15.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 0.00027777833333;
            er.setText(Double.toString(meter) + " hrs.");
        });
        m16.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 86400;
            er.setText(Double.toString(meter) + " Sec.");
        });
        m17.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u / 1440;
            er.setText(Double.toString(meter) + " min");
        });
        m18.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 604800;
            er.setText(Double.toString(meter) + " sec");
        });
        m19.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 10080;
            er.setText(Double.toString(meter) + " min");
        });
        m20.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 2.628e+6;
            er.setText(Double.toString(meter) + " sec");
        });
        m21.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 43799.9999995274;
            er.setText(Double.toString(meter) + " min.");
        });
        m22.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            float meter = (u * 9 / 5) + 32;
            er.setText(Float.toString(meter) + " 'F");
        });
        m23.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = (u - 32) * 5 / 9 + 273.15;
            er.setText(Double.toString(meter) + " 'K");
        });

        m24.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u - 273.15;
            er.setText(Double.toString(meter) + " 'C");
        });
        m25.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u + 273.15;
            er.setText(Double.toString(meter) + " 'K");
        });
        m26.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = (u - 32) * 5 / 9;
            er.setText(Double.toString(meter) + " 'C");
        });
        m27.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 3.6;
            er.setText(Double.toString(meter) + " Km/hrs");
        });

        m28.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u / 3.6;
            er.setText(Double.toString(meter) + " m/sec");
        });
        m29.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 1.60934;
            er.setText(Double.toString(meter) + " Km/hrs");
        });
        m30.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u / 1.097;
            er.setText(Double.toString(meter) + " 'C");
        });
        m31.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 1000;
            er.setText(Double.toString(meter) + " KiloHertz");
        });
        m32.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u * 1000;
            er.setText(Double.toString(meter) + " MegaHertz");
        });
        m33.addActionListener(e -> {
            String q = fg.getText();
            int u = Integer.parseInt(q);
            double meter = u / 1e+6;
            er.setText(Double.toString(meter) + " MegaHertz");
        });
        a1.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double av = u * 10.76;
            er.setText(Double.toString(av) + " Ft Sq.");
        });
        a2.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double ft = u * 929;
            er.setText(Double.toString(ft) + " CM Sq.");
        });
        a3.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double mi = u * 640;
            er.setText(Double.toString(mi) + " acres.");
        });
        a4.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double ac = u * 4046.85;
            er.setText(Double.toString(ac) + " meter Sq.");
        });
        a5.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double are = u * 100;
            er.setText(Double.toString(are) + " meter Sq.");
        });
        a6.addActionListener(e -> {
            String q = fg.getText();
            float ha = Float.parseFloat(q);
            double km = ha / 100;
            double meter = ha * 10000;
            er.setText(Double.toString(km) + " km Sq." + "\n " + Double.toString(meter) + " m. sq.");
        });
        a7.addActionListener(e -> {
            String q = fg.getText();
            float ha = Float.parseFloat(q);
            double are = ha * 100;
            double ac = ha * 2.471;
            er.setText(Double.toString(are) + " are" + " \n " + Double.toString(ac) + " ac");
        });
        a9.addActionListener(e -> {
            String q = fg.getText();
            float km = Float.parseFloat(q);
            double ha = km * 100;
            double meter = km * 1000000;
            er.setText(Double.toString(ha) + " Ha" + " \n " + Double.toString(meter) + " Meter Sq.");
        });
        a8.addActionListener(e -> {
            String q = fg.getText();
            float u = Float.parseFloat(q);
            double ac = u * 43560;
            er.setText(Double.toString(ac) + " Ft Sq.");
        });
        fr.add(er);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        UnitConvertor uc = new UnitConvertor();
    }
}

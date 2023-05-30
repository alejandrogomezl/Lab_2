package PaqComplex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test extends JFrame {
    private JTextField real1;
    private JTextField img1;
    private JTextField real2;
    private JTextField real3;
    private JTextField img2;
    private JTextField img3;
    private JComboBox comboBox1;
    private JButton calculate;
    private JPanel mainPanel;

    public Test() {
        setContentPane(mainPanel);
        setTitle("Imaginary Number Calculator");
        setSize(600, 250);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComplexNumber x = new ComplexNumber(Double.parseDouble(real1.getText()), Double.parseDouble(img1.getText()));
                ComplexNumber y = new ComplexNumber(Double.parseDouble(real2.getText()), Double.parseDouble(img2.getText()));
                ComplexNumber z = new ComplexNumber();

                switch (comboBox1.getSelectedIndex()) {
                    case 0:
                        z = x.add(y);
                        break;
                    case 1:
                        z = x.sub(y);
                        break;
                    case 2:
                        z = x.mult(y);
                        break;
                }

                real3.setText(String.valueOf(z.getReal()));
                img3.setText(String.valueOf(z.getImg()));
            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

        public static void main(String[] args) {
        new Test();
    }
}
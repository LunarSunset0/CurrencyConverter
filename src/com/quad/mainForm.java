package com.quad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField2;
    private JComboBox comboBox2;
    private JComboBox comboBox1;

    public mainForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = textField2.getText();
                int result = Integer.parseInt(x);
                JOptionPane.showMessageDialog(null, convert(result));

            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("app");
        frame.setContentPane(new mainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public double convert(int result)
    {
    double conversion = 0;
    double index[][] = new double[3][3];
    String cb1 = (String)comboBox1.getSelectedItem(); int boxIndex1 = comboBox1.getSelectedIndex();
    String cb2 = (String)comboBox1.getSelectedItem(); int boxIndex2 = comboBox2.getSelectedIndex();
    index[0][0]= 1; index[0][1]= .92;index[0][2]= .77;
    index[1][0]= 1.09; index[1][1]= 1;index[1][2]= .84;
    index[2][0]= 1.29; index[2][1]= 1.19;index[2][2]= 1;
    conversion = result * index[boxIndex1][boxIndex2];

        //Dollar to Euro, 1 to .92 //Dollar to Pound, 1 to .77
        //Euro to Dollars, 1 to 1.09 //Euro to Pound, 1 to .84
        //Pound to Dollars, 1 to 1.29 //Pound to Euros, 1 to 1.19


    return conversion;

    }
}


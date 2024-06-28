package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField nombreTxt;
    private JPasswordField contrasenaTxt;
    private JButton aceptarBtn;
    public JPanel mainPanel;

    public form1() {
        aceptarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("este es el botón de aceptar");
                int a=0;
                int b=2;
                System.out.println(a+b);
                JFrame frame = new JFrame("bienvenido");
                frame.setContentPane(new form3().menu3);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setPreferredSize(new Dimension(800, 600));
                frame.setMinimumSize(new Dimension(800, 600));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

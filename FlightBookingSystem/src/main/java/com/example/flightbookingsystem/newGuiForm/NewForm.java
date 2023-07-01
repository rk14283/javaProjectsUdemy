package com.example.flightbookingsystem.newGuiForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewForm extends JFrame {
    private JButton message;
    private JPanel PanelMain;
    private JTextField usernameTextField;
    private JTextField textField1;
    private JButton loginButton;




        public NewForm() {
            JPanel panel = new JPanel();
            JLabel usernameLabel = new JLabel("Username:");
            panel.add(usernameLabel);
        }
    }

//    message.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(null,"Hello World");
//     }
//    });

//        textField1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               JOptionPane.showMessageDialog(null, "name");
//            }
//        });



//    public static void main(String[] args) {
//        JFrame frame = new JFrame("NewForm");
//        frame.setContentPane(new NewForm().PanelMain);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}

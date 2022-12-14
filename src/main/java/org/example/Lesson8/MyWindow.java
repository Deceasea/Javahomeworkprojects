package org.example.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow(){
        setVisible(true);

        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setResizable(false);

        JButton firstButton = new JButton("Выход");
        ActionListener listener = new CloseActionListener();
        firstButton.addActionListener(listener);

        JButton secondButton = new JButton("Кнопка 2");


        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(secondButton);
        panel.add(firstButton);

        add(panel, BorderLayout.SOUTH);

    }

}

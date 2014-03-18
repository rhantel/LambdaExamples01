package com.example.lambda;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Roland
 */
public class ListenerTest {
    public static void main(String[] args) {
        JButton testButton = new JButton("Test Button");
        testButton.addActionListener( 
            e -> { System.out.println("Click detected by Lambda Listener"); } 
        );
        
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

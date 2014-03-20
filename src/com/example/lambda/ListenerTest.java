package com.example.lambda;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileFilter;
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
            ae -> System.out.println("Hallo Welt")                
        );       

        FileFilter f = File::canRead;
        
        Operation operation = (x,y) -> {
            return x+y;
        };
        
        String s = new String();
        
        System.out.println(operation.operiere(1, 2));
        
        operation = (x,y) -> x-y;
        
        System.out.println(operation.operiere(1, 2));
        
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

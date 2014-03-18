package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Roland
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("=== RunnableTest ===");
        
        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }            
        };
        
        // Add Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");
        
        // Run em!
        r1.run();
        r2.run();     
        
        List<String> l = new ArrayList<>();
        l.add("yolo");
        l.add("abc");
        l.add("zdf");
        
        System.out.println(l);
        
        Collections.sort(l, (t1, t2) -> t1.compareTo(t2));
        
        System.out.println(l);
    }
}

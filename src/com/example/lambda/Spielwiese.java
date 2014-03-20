package com.example.lambda;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Roland
 */
public class Spielwiese {
    public static void main(String[] args) {
        Collection<Object> collection = new ArrayList<>();
        
        collection.add("Hallo");
        collection.add(BigInteger.valueOf(99));
        collection.add(1);
        collection.add(BigInteger.TEN);
        
        collection.removeIf(o -> o instanceof BigInteger);
        
        System.out.println(collection);
    }
}

package com.example.lambda;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Roland
 */
public class CollectionsTest 
{
    public static void main(String[] args)
    {
        Collection<Object> coll = new ArrayList<>();
        coll.add("Hallo");
        coll.add("Welt");
        coll.add(1);
        
        coll.stream().filter(t -> t instanceof String).forEach(t -> System.out.println(t));
    }
}

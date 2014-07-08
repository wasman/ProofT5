package com.dio.training.proof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterratorProof {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Value1");
        list.add("Value2");
        list.add("Value3");
        list.add("Value4");
        list.add("Value5");

        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        System.out.println("Print list with remove..");

        while(iterator.hasNext()){
            try {
                iterator.remove();
            }catch (IllegalStateException ex) {
                ex.printStackTrace();
                break;
            }
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            iterator.hasNext();
            iterator.hasNext();
            System.out.println(list);
        }



    }
}

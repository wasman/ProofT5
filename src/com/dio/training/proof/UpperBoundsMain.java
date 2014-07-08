package com.dio.training.proof;

import java.util.concurrent.ArrayBlockingQueue;

//http://www.janeve.me/articles/which-java-collection-to-use
public class UpperBoundsMain {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

        for (int i =0 ; i<11; i++) {
            try {
                queue.add(1);
            }catch (IllegalStateException ex) {
                System.out.println( ex.getMessage());
            }
        }
    }
}

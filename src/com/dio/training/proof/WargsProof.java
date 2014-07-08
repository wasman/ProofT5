package com.dio.training.proof;

import java.util.List;

import static java.util.Arrays.asList;

public class WargsProof {
    public static void main(String[] args) {
        String[] strings = {"val1", "val2", "val2"};
        printValues("Array in parameter", strings);

//      does not compile
//        printValues("Array in parameter", {"val1", "val2", "val2"});


        printValues("As varargs parameters", "case2_val1", "case2_val2", "case2_val2");

        List<String> values = asList("case3_val1", "case3_val2", "case3_val2");
        printValues("As Array from List", values.toArray());

        printValues("As constructed Array in parameter", new String[] {"case4_val1", "case4_val2", "case4_val2"});
    }

    public static void printValues(String testCaseName, Object... values) {
        System.out.println("Test Case name is " + testCaseName);

        for (Object val : values) {
            System.out.println("Class for value is " + val.getClass());
            System.out.println(val);
        }
    }
}

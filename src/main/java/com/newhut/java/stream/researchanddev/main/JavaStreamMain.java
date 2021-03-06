/*
 * Copyright Ummu Hanisah. 
 * All Rights Reserved
 */
package com.newhut.java.stream.researchanddev.main;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author uha
 * @since 20/12/2020 07.10pm
 */
public class JavaStreamMain {

    public static void main(String[] args) throws IOException {
        JavaStreamMain jsm = new JavaStreamMain();
        jsm.streamOfWithArraySortFilterAndPrintDemo();
    }

    // 1. Integer Stream
    private void integerStreamWithRangeDemo() {
        IntStream // class
                .range(1, 10) // range function - gives us range of integer from 1 to 9
                .forEach(System.out::print); // forEach, there is terminal operation - then we call print function
        System.out.println("");
    }

    /* Output
    #########
    123456789
     */
    
    // 2. Integer Stream with skip
    private void integerStreamWithSkipDemo() {
        IntStream // class
                .range(1, 10) // range function - gives us range of integer from 1 to 9
                .skip(5) // skip the first 5 elements of our streams, so we should print integer 6 to 9
                .forEach(x -> System.out.println(x));
        // we're using simple lambda expression to print item x, x is the parameter(series of integer) to pass to the forEach function
        System.out.println("");
    }

    /* Output
    #########
    6
    7
    8
    9
     */
    
    // 3. Integer Stream with Sum
    private void integerStreamWithSumDemo() {
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        // 0 + 1 + 2 + 3 + 4 
    }

    /* Output
    #########
    10
     */
    
    // 4. Stream.of, sorted, findFirst
    private void streamOfWithSortedAndFindFirstDemo() {
        Stream.of("Ummu", "Rina", "Insyirah") // can be used with any type.
                .sorted() // alphabetical sort
                .findFirst() // find the first item
                .ifPresent(System.out::println);
    }

    /* Output
    #########
    Insyirah
     */
    
    // 5. Stream from Array, filter, sort, and print
    private void streamOfWithArraySortFilterAndPrintDemo() {
        String[] names = {"Ummu", "Rina", "Insyirah", "Umar"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("U")) // filter itme that only start with "U"
                .sorted() // sort them
                .forEach(System.out::println); // for each item that pass the sort we're going to print it out
    }

    /* Output
    #########
    Umar
    Ummu
     */
}

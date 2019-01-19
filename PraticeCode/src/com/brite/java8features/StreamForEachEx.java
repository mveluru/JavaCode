package com.brite.java8features;

import java.util.Arrays;
import java.util.List;
 
public class StreamForEachEx {
 
    public static void main(String a[]) {
 
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles.stream().forEach(System.out::println);
    }
}
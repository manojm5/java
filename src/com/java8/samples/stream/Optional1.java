package com.java8.samples.stream;

import java.util.Optional;
public class Optional1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        
        optional.isPresent();           
        optional.get();                 // 
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     
    }

}
package com.capgemini.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
 
public class GetDateTime {
 
    public static void main(String a[]) {
 
        // get current date without time
        LocalDate ldObj = LocalDate.now();
        System.out.println("Current date without time: "+ldObj);
 
        // get current time without date
        LocalTime ltObj = LocalTime.now();
        System.out.println("Current time without date: "+ltObj);
 
        // get current date and time together without timezone information
        LocalDateTime ldtObj = LocalDateTime.now();
        System.out.println("Current date & time without zone: "+ldtObj);
 
        // get current date and time together along with timezone information
        ZonedDateTime zdtObj = ZonedDateTime.now();
        System.out.println("Current date & time with zone: "+zdtObj);
    }
}
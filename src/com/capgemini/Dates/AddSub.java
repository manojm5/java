package com.capgemini.Dates;

import java.time.LocalDateTime;

public class AddSub {
 
    public static void main(String[] args) {
 
        LocalDateTime ldTime = LocalDateTime.now();
        System.out.println("Current date time: "+ldTime);
 
        // add 10 days to current time
        LocalDateTime advLdTime = ldTime.plusDays(10);
        System.out.println("Date time after 10 days: "+advLdTime);
 
        // add 5 hours to crrent time
        LocalDateTime advLdTime1 = ldTime.plusHours(5);
        System.out.println("Date time after adding 5 hours: "+advLdTime1);
 
        // date one month before
        LocalDateTime prevLdTime = ldTime.minusMonths(1);
        System.out.println("Date one month before: "+prevLdTime);
 
        // date two week before
        LocalDateTime prevLdTime1 = ldTime.minusWeeks(2);
        System.out.println("Date two weeks before: "+prevLdTime1);
    }
}
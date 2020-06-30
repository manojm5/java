package com.capgemini.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
 
public class DateParse{
 
    public static void main(String[] args) {
 
        // create a date time object (2018-01-01 10:30)
        LocalDateTime dtObj = LocalDateTime.of(2018, Month.JANUARY, 1, 10, 35);
        System.out.println("date time obj: "+dtObj);
 
        // format ISO date time (2016-01-01T10:35:00)
        String isoObj = dtObj.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("date time obj in ISO format: "+isoObj);
 
        // format basic ISO date format (20160101)
        String basicIsoObj = dtObj.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("date time obj in basic ISO format: "+basicIsoObj);
 
        // format as ISO week date (2015-W53-5)
        String isoWeekObj = dtObj.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println("date time obj in ISO week format: "+isoWeekObj);
 
        // french date formatting (1. janvier 2016)
        String frenchDate = dtObj.format(DateTimeFormatter.ofPattern("d. MMMM yyyy", new Locale("fr")));
        System.out.println("date time obj in french date format: "+frenchDate);
 
        // user custom pattern (01/01/16)
        String custDtObj = dtObj.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println("date time obj in custom format: "+custDtObj);
 
 
        // parsing string to date object
        LocalDate isoDateObj = LocalDate.parse("2016-02-22");
        System.out.println("iso date: "+isoDateObj);
 
        // custom date string to date object
        LocalDate custPatternObj = LocalDate.parse("02-2016-22", DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        System.out.println("custom date format: "+custPatternObj);
    }
}
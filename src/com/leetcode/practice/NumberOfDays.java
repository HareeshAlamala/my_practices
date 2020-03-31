package com.leetcode.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {

    public static void main(String[] args) {

    }
    public int daysBetweenDates(String date1, String date2) {
        LocalDate dateBefore = LocalDate.parse(date1);
        LocalDate dateAfter = LocalDate.parse(date2);
        return (int)ChronoUnit.DAYS.between(dateBefore, dateAfter);
    }
}

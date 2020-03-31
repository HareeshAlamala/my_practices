package com.hackerearth.practice;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeConverted {

    public static void main(String[] args) throws Exception{

        String date = "17-03-2020";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        long currentTS =  simpleDateFormat.parse(date).getTime();

        System.out.println("-->"+currentTS);

    }

    public String dayOfTheWeek(int day, int month, int year) {

        Map<Integer,String> dayWeek = new HashMap<>();
        dayWeek.put(1,"Monday");
        dayWeek.put(2,"Tuesday");
        dayWeek.put(3,"Wednesday");
        dayWeek.put(4,"Thursday");
        dayWeek.put(5,"Friday");
        dayWeek.put(6,"Saturday");
        dayWeek.put(7,"Sunday");
        LocalDate localDate = LocalDate.of(year,month,day);

        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        return dayWeek.get(dayOfWeek.getValue());


    }


}

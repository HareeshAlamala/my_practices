package com.practice.dcp;

public class ClockAngle_Problem_303 {

    /**
     * Given a clock time in hh:mm format, determine, to the nearest degree, the angle between the hour and the minute hands.
     *
     * Bonus: When, during the course of a day, will the angle be zero?
     */
    public static void main(String[] args) {

        String time = "03:00";

        int hours = Integer.parseInt(time.substring(0,2))%12;
        int minutes = Integer.parseInt(time.substring(3))%60;

        System.out.println(Math.abs((hours*60+minutes)*0.5) - (minutes*6));
    }
}

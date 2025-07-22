package com.collection.map.scenario;
/*
15. Weekly Planner - EnumMap<Day, String>: Task per day.
*/

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Question15 {
    public static void main(String[] args) {
        Map<Day,String> user=new EnumMap<>(Day.class);
        user.put(Day.MONDAY,"Back day");
        user.put(Day.TUESDAY,"Bicep day");
        user.put(Day.WEDNESDAY,"Chest day");
        user.put(Day.THURSDAY,"Tricep day");
        user.put(Day.FRIDAY,"Cardio day");
        user.put(Day.SATURDAY,"Leg day");
        user.put(Day.SUNDAY,"Rest day");
        user.forEach((k,v)->System.out.println(k.ordinal()+":"+v));
    }
}
enum Day
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

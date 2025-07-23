package com.collection.map.scenario;
/*19. Nested Map - Class Performance Tracker:
        - Map<String, Map<String, Integer>>: Add student marks, find topper.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question19 {
    public static Map<String,Map<String,Integer>> siom=new HashMap<>();
    public static void addStudent(String division,String studentName,int marks)
    {
        if(!siom.containsKey(division)){
            HashMap<String,Integer> map=new HashMap<>();
            map.put(studentName,marks);
            siom.put(division,map);
            return;
        }
        Map<String,Integer> map=siom.get(division);
        if(isPresentStudent(division,studentName)){
            System.out.println("student "+studentName+" is already added");
            return;
        }
        map.put(studentName,marks);
        System.out.println("student added sucessfully");
    }
    public static  boolean isPresentDivision(String divison)
    {
        if(divison==null||divison.equals("")) {
            return false;
        }
        return siom.containsKey(divison);
    }
    public static boolean isPresentStudent(String division,String studentName)
    {
        if(division==null||studentName==null)
            return false;

        Map<String,Integer> map=siom.get(division);
        if(!map.containsKey(studentName))
            return false;
        return true;
    }
    public static void topper()
    {
        Set<Map.Entry<String,Map<String,Integer>>> set=siom.entrySet();
        int highestMarks=Integer.MIN_VALUE;
        String topperName=null;
        for(Map.Entry<String,Map<String,Integer>> entry:set) {
            Map<String,Integer> map=entry.getValue();
            for(Map.Entry<String,Integer> entry1:map.entrySet()) {
                if(entry1.getValue()>highestMarks) {
                    topperName=entry1.getKey();
                    highestMarks=entry1.getValue();
                }
            }
        }
        System.out.println("Topper Name:"+topperName+" Marks:"+highestMarks);
    }
    public static void main(String[] args) {
        addStudent("MCA-A", "Akash", 78);
        addStudent("MCA-A", "Priya", 82);
        addStudent("MCA-A", "Rohan", 69);
        addStudent("MCA-A", "Sneha", 91);
        addStudent("MCA-A", "Kunal", 74);

        addStudent("MCA-B", "Swati", 88);
        addStudent("MCA-B", "Amit", 79);
        addStudent("MCA-B", "Neha", 83);
        addStudent("MCA-B", "Soham", 75);
        addStudent("MCA-B", "Tina", 100);

        addStudent("MCA-C", "Raj", 81);
        addStudent("MCA-C", "Meena", 77);
        addStudent("MCA-C", "Jay", 92);
        addStudent("MCA-C", "Disha", 68);
        addStudent("MCA-C", "Karan", 85);

        addStudent("MCA-D", "Simran", 89);
        addStudent("MCA-D", "Yash", 73);
        addStudent("MCA-D", "Anjali", 91);
        addStudent("MCA-D", "Om", 76);
        addStudent("MCA-D", "Nikita", 80);

        topper();
    }
}

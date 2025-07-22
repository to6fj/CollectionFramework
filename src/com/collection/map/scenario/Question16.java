package com.collection.map.scenario;

/*
16. GC Demonstration - Store temp objects and observe cleanup.
*/

public class Question16 {
    public  static  void createPerson(String firstName, String lastName, int age) {
        Person person = new Person(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        person=person2;
        Runtime.getRuntime().gc();
        createPerson("shubham","Puri",25);
        Runtime.getRuntime().gc();
        Person person3 = new Person();
        person3=null;
        System.gc();
    }
}
class Person
{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    protected  void  finalize() {
        System.out.println("Person finalized method called");
    }
}

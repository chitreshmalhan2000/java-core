package com.learning.core.day5;
import java.util.*;
class Person implements Comparable<Person> {
      String id;
      String name;
      int age;
      double salary;

    public Person(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }
   /* public String toString() {    //for Q8.
        return name.toUpperCase();
    }*/

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.id.equals(other.id);
    }

    
   public int compareTo(Person other) {
        return this.id.compareTo(other.id);
    }
   
    }


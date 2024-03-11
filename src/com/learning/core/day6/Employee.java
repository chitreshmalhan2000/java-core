package com.learning.core.day6;
import java.util.*;
public class Employee {
    int id;
    String name;
    String department;
    String designation;

   public Employee(int id, String name, String designation, String department) {
       this.id = id;
       this.name = name;
       this.designation = designation;
       this.department = department;
   }

   @Override
   public String toString() {
       return id + " " + name + " " + designation + " " + department;
   }
   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       Employee employee = (Employee) obj;
       return id == employee.id;
   }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


package com.learning.core.day1;
                 //D01P02
public class TestClass {
    public static void main(String[] args) {
        MedicineInfo t = new Tablet();
        MedicineInfo s = new Syrup();
        MedicineInfo o = new Ointment();
        t.displayLabel();
        s.displayLabel();
        o.displayLabel();
    }
}

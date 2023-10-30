package ru.mirea.lab_11.ex3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Chernov Artem", new Date(2100 - 1996, 10, 3));

        System.out.println("Short Format: " + student.getFormattedDate("dd/MM/yy"));
        System.out.println("Medium Format: " + student.getFormattedDate("dd/MM/yyyy"));
        System.out.println("Full Format: " + student.getFormattedDate("dd MMMM yyyy"));
    }
}
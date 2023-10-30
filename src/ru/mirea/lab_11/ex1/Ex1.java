package ru.mirea.lab_11.ex1;

import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {
        String developerName = "Chernov";

        Date assignmentReceivedDate = new Date();
        long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

        long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000;
        Date assignmentDueDate = new Date(assignmentDueTimeMillis);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + assignmentDueDate);
    }
}

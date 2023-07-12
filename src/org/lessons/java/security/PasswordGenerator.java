package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        String userName;
        String userSurname;
        String userColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;


        userName = "Leonardo";
        userSurname = "Roca";
        userColor = "Yellow";
        dayOfBirth = 1;
        monthOfBirth = 3;
        yearOfBirth = 1998 ;

        String password = userName + "-" + userSurname + "-" + userColor + "-" + yearOfBirth;
        System.out.println("la tua password generata è: " +password);









    }
}




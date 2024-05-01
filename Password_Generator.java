package Beginner.Password_Generator;

import java.util.*;

public class  Password_Generator {
    public static void main(String[] args) {
        System.out.println(password(8));
    }

    public static char[] password(int length) {
        String upper_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String lower_char = "abcdefghijklmnopqrstuvwxyz";

        String numbers = "1234567890";

        String symbols = "!@#$%^&*()-_=+\\/~?";
        String combination = upper_char + lower_char + numbers + symbols;

        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Generated Password is: ");
        return password;
    }
}

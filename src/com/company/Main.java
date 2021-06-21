package com.company;

public class Main {

    public static void main(String[] args) {
        String nameOFMYFriend;
        final int NUM = 30;
        String word = "Thenkn_you";

        nameOFMYFriend = NUM + word;
        System.out.println(nameOFMYFriend);

        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");

        } else {
            System.out.println("Вы сохранили ноль");
        }


    }
}

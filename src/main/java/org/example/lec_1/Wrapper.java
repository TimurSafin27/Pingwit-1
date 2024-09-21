package org.example.lec_1;

public class Wrapper {
    public static void main(String[] args) {
        int myInt = 100;
        Integer myInteger = 100;

        Integer sum = myInteger + myInt;
        System.out.println(sum);

        String name = "Egorka";
        String surname = "Petrovich";
        String fullName = name + " " + surname;
        System.out.println(fullName);
    }
}

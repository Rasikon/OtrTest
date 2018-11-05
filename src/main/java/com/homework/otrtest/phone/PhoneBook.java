package com.homework.otrtest.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PhoneBook {
    private static Map<String, List<String>> phonebook = new HashMap<>();

    static {
        phonebook.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+88002000500", "+8800200600")));
        phonebook.put("Петров П.П.", new ArrayList<>(Arrays.asList("+88002000700")));
        phonebook.put("Сидоров С.С.", new ArrayList<>(Arrays.asList("+88002000800", "+88002000900", "+88002000000")));
    }

    public static void printNumbers(String s) {
        int count = 1;
        if (phonebook.containsKey(s)) {
            List<String> numbers = phonebook.get(s);
            for (String num : numbers) {
                System.out.println(count + ". " + num);
                count++;
            }
        } else {
            System.out.println("no entry exists");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static Map<String, List<String>> getPhonebook() {
        return phonebook;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        printNumbers(s);
        reader.close();

    }

}

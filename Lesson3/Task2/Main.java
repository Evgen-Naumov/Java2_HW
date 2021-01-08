package Lesson3.hw3.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List> book = new HashMap<>();
        PhoneBook phoneBook  = new PhoneBook(book);
        phoneBook.setItem("Иванов","899965482536");
        phoneBook.setItem("Иванов","56-89-78");
        phoneBook.setItem("иванов","56-89-78");
        phoneBook.setItem("Петров","56983659");
        phoneBook.setItem("Сидоров","25-56-89");


        List<String> PersonalPhone = phoneBook.getPhone("Иванов");
        printphone("Иванов",PersonalPhone);

        PersonalPhone = phoneBook.getPhone("Васин");
        printphone("Васин",PersonalPhone);


        PersonalPhone = phoneBook.getPhone("Сидоров");
        printphone("Сидоров",PersonalPhone);

        PersonalPhone = phoneBook.getPhone("Петров");
        printphone("Петров",PersonalPhone);

    }

    private static void printphone(String name,List<String> PersonalPhone){
        System.out.println(name + ":");
        if(PersonalPhone.isEmpty()){
            System.out.println("Номера телефонов не найдены");
        }
        int n=1;
        for (String PhoneNumber: PersonalPhone) {
            System.out.printf("Телефон №%d :%s",n++,PhoneNumber);
            System.out.println();
            ;
        };

    }
}

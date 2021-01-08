package Lesson3.hw3.Task2;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PhoneBook {
    private HashMap<String, List> Phonebooks;

    public PhoneBook(HashMap<String, List> book) {
        this.Phonebooks = book;
    }


    public void setItem(String name,String phone) {
        List<String> personalphone = this.Phonebooks.get(name);
        if (personalphone==null){
            personalphone = new ArrayList();
        }
        personalphone.add(phone);
        this.Phonebooks.put(name,personalphone);
    }

    public List<String> getPhone(String name){

        if(name.isBlank()){
            return new ArrayList<>();
        }
        List<String> PersonalPhone = this.Phonebooks.get(name);
        if (PersonalPhone==null){
            return new ArrayList<>();
        }
        return PersonalPhone;
    }

    public void printPhone(String name){
        List<String> listPhone = getPhone(name);

        System.out.println(name + ":");
        if(listPhone.isEmpty()){
            System.out.println("Номера телефонов не найдены");
        }
        int n=1;
        for (String PhoneNumber: listPhone) {
            System.out.printf("Телефон №%d :%s",n++,PhoneNumber);
            System.out.println();
            ;
        };
    }


}

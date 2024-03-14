package com.learning.core.day6;
import java.util.HashMap;
import java.util.Map;
public class D06P01 {
  static class PhoneBook {
        private Map<String, Long> phoneBook;

        public PhoneBook() {
            phoneBook = new HashMap<>();
        }

        public void addContact(String name, long phoneNumber) {
            phoneBook.put(name, phoneNumber);
        }

        public void listContacts() {
            System.out.println("Phone Book Details:");
            for (Map.Entry<String, Long> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Amal", 998787823L);
        phoneBook.addContact("Manvitha", 937843978L);
        phoneBook.addContact("Joseph", 7882221113L);
        phoneBook.addContact("Smith", 8293893311L);
        phoneBook.addContact("Kathe", 7234560011L);

        phoneBook.listContacts();
    }
}
package com.teachmeskills.task7.phone;

public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+372(29)1234567","Samsung S20");
        Phone phone3 = new Phone("+375(29)5267898","Nokia 3310", 121);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        System.out.println();
        phone1.whoCalling("Alex");
        System.out.println(phone1.getNumber());
        phone1.whoCalling("Gleb");
        System.out.println(phone2.getNumber());
        phone1.whoCalling("Dmitry");
        System.out.println(phone3.getNumber());
        System.out.println();
        phone1.whoCalling("Alex", "+372(29)1234567");
        phone2.whoCalling("Gleb", "+375(29)5267898");
        phone3.whoCalling("Bob", "+375(29)4985966");
        System.out.println();
        phone1.multicastMessage("1");
        phone2.multicastMessage("2", "2", "3");
        phone3.multicastMessage("7", "6");
    }
}

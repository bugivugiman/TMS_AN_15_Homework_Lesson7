package com.teachmeskills.task7.phone;

public class Phone {

    //Fields
    String number;
    String model;
    int weight;

    //Constructors
    public Phone(){

    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone (String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Methods
    public void whoCalling(String name){
        System.out.println("----------------");
        System.out.println("calling " + name);
        System.out.println("----------------");
    }

    public void whoCalling(String name, String number){
        System.out.println("----------------");
        System.out.println("calling " + name + " / " + number);
        System.out.println("----------------");
    }

    public void multicastMessage(String [] numbers){
        for(String i : numbers){
            System.out.println("message received: " + number);
        }
    }
    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number: " + number + '\'' +
                ", model:  " + model + '\'' +
                ", weight: " + weight +
                '}';
    }
}
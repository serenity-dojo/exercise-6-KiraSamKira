package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if(animal == "Cat") {
            if (isPremium) {
                return "Salmon";
            }
            return "Tuna";
        }
        if(animal == "Dog") {
            if (isPremium) {
                return "Deluxe Dog Food";
            }
            return "Dog Food";
        }
        if(animal == "Hamster") {
            if (isPremium) {
                return "Lettuce";
            }
            return "Cabbage";
        }

        return "Food";
    }
}

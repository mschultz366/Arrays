package com.company;

public class Main {

    public static void main(String[] args) {

        String[] shopList;
        shopList = new String[] {
                "Taco",
                "Burrito",
                "Horchata",
                "Torta",
                "Tamale"
        };

        for (String s : shopList) {
            System.out.println(s);
        }
    }
}

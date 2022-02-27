package com.company;

public class VowelCountDeclarative {

    public static int getCount(String str) {

        return (int) str.toLowerCase()
                .chars().filter(c -> "aeiou".indexOf(c) >=0)
                .count();
    }
}

package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCountImperative {

    public static void main(String[] args) {
        VowelCountImperative vowelCount = new VowelCountImperative();
        System.out.println(vowelCount.vowelsCount("aeiou"));
        System.out.println(vowelCount.vowelsCount("kingkong"));
        System.out.println(vowelCount.vowelsCount("I am Lord Hudson"));
    }

    public int vowelsCount(String string) {

        String vowels = "aeiou";
        String newString = string.toLowerCase();
        System.out.println("String " + newString);
        int count = 0;
        String regex = "[a-z\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newString);

        if (matcher.matches()) {
            for (int i = 0; i < newString.length(); i++) {
                for (int j = 0; j < vowels.length(); j++) {
                    if (vowels.charAt(j) == newString.charAt(i)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}

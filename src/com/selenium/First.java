package com.selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class First {
    //1
    public static char[] outUpper (){
        char [] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (65 + i);
        }
        return alphabet;
    }

    //2
    public static char[] outLower() {
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }
        return alpha;
    }

    //3
    public static char[] outRU() {
        char[] alpha = new char[32];
        for (int i = 0; i < 32; i++) {
            alpha[i] = (char) (1072 + i);
        }
        return alpha;
    }

    //4
    public static char[] outInt() {
            char[] numbers = new char[10];
            for (int i = 0; i <= 9; i++) {
                numbers[i] = (char) (48 + i);
            }
            return numbers;
        }
    //5
    public static char[] symbolsASCII() {
        char[] symbols = new char[95];
        for (char i = 0; i <= 94; i++) {
            symbols[i] = (char) (32 + i);
        }
        return symbols;
    }
    //1
    public static String intToString(int num) {
        String str = String.valueOf(num);
      return str;
         }
    //2
    public static String doubleToString(double num) {
        String str = String.valueOf(num);
          return str;
    }

    //3
    public static int stringToInt(String myString) {
        int i = Integer.parseInt(myString);
           return i;
    }

    //4
    public static double stringToDouble(String myString) {
        double i = Double.valueOf(myString);
           return i;
    }
    //1
    public static int lengthOfSmallestWord(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
            return min;
    }
    //1
       public static String replaceTo$(String str, int quantity) {
        String[] words = str.split(" ");
        String result= " ";
             for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
            }
        }
        return result;

    }

    public static String add_space(String value){
        Pattern pattern = Pattern.compile("[\\pP\\W]");
        Matcher matcher = pattern.matcher(value);
        while(matcher.find()) {
            String w = matcher.group();
            value = value.replaceAll("\\" + w, w + " ");
            value = value.replaceAll("\\s+", " ");
        }
        return value;
    }

    public static String getUniqueChar(String value){
        String result = "";
        for(int i = 0; i < value.length(); i++) {
            if (result.indexOf(value.charAt(i)) == - 1) {
                result += value.charAt(i);
            }
        }
        return result;
    }

    public static int amountOfWords(String str){
        String[] words = str.split(" ");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            amount++;
        }
        return amount;
    }

    public static String deletePosition(String str, int startIndex, int amountToDelete){
        return str.replace(str.substring(startIndex, (startIndex + amountToDelete)), "");
    }

    public static StringBuilder reverse(String str){
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        return string;
    }

    public static String deleteLastWord(String str) {
        int a = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                a = i;
                break;
            }
        }
        return str.substring(0, a);
    }
}







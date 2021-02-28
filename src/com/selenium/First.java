package com.selenium;

public class First {
    public static int alphabet() {
        char[] alpha = new char[26];
        int i;
        for (i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }
        return alpha[i];
    }

    //1
    public static void outUpper() {
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (65 + i);
        }
        System.out.println(alpha);
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
    public void outInt() {
        for (int i = 48; i <= 57; i++) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    //5
    public static void symbolsASCII() {
        for (char i = 32; i <= 126; i++) {
            System.out.print(i + " ");
        }
    }
    //1
    public void intToString(int num) {
        String str = String.valueOf(num);
        System.out.print(str + " ");
    }
    //2
    public void doubleToString(double num) {
        String str = String.valueOf(num);
        System.out.print(str + " ");
    }

    //3
    public void stringToInt(String myString) {
        int i = Integer.parseInt(myString);
        System.out.print(i + " ");
    }

    //4
    public void stringToDouble(String myString) {
        double i = Integer.parseInt(myString);
        System.out.print(i + " ");
    }
    //1
    public static void lengthOfSmallestWord(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        System.out.println(min);
    }

}






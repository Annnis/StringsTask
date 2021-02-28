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
    public static void outUpper(){
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (65 + i);
        }
        System.out.println(alpha);
    }
    //2
    public static char[] outLower(){
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }
        return alpha ;
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
    char[] alpha = new char[32];
    for (int i = 0; i < 32; i++) {
        alpha[i] = (char) (1072 + i);
    }
    return alpha;
}
    }




package com.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    private static String actual;
    private static String expected;

    @Test
    public void outUpper() {
        actual = First.outUpper();
        expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outLower_Test(){
        String actual = First.outLower();
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void outRU() {
        actual = First.outRU();
        expected = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
        Assertions.assertArrayEquals(new String[]{expected}, new String[]{actual});
    }

//    @Test
//    public void symbolsASCII() {
//      actual = First.symbolsASCII();
//      expected = new char[]{' ', '!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '/', ']', '^','_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~',' '};
//      Assertions.assertEquals(actual, expected);

    @Test
    public void test_integer_to_String() {
        actual = First.intToString(5);
        expected = "5";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_double_to_String() {
        actual = First.doubleToString(5.0);
        expected = "5.0";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Integer() {
        int actual = First.stringToInt("5");
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Double() {
        double actual = First.stringToDouble("5.0");
        double expected = 5.0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_shortestWord() {
        int actual = First.lengthOfSmallestWord("car apple id fox");
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

        @Test
    public void test_add_space() {
        String actual = First.replaceTo$("cara apple id fox",4);
        String expected = "c$$$";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void add_space() {
        actual = First.add_space("cara?apple.id fox");
        expected = "cara? apple. id fox";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_getUniqueChar() {
        actual = First.getUniqueChar("Five hjh Five bhbh");
        expected = "Five hjb";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_amountOfWords() {
        int actual = First.amountOfWords("Five hjh Five bhbh");
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_deletePosition() {
        actual = First.deletePosition("Five hjh Five bhbh",4,6);
        expected = "Fiveive bhbh";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_reverse(){
        String actual = First.reverse("qwertyuiop");
        String expected = "poiuytrewq";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void deleteLastWord() {
        String actual = First.deleteLastWord("Five hjh Five bhbh");
        String expected = "Five hjh Five";
        Assertions.assertEquals(actual, expected);
    }

}







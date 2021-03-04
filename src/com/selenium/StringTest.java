package com.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void outUpper() {
        char[] actual = First.outUpper();
        char[] expected = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void outLower() {
        char[] actual = First.outLower();
        char[] expected = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void outRU() {
        char[] actual = First.outRU();
        char[] expected = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Assertions.assertArrayEquals(actual, expected);
    }

//    @Test
//    public void symbolsASCII() {
//        char[] actual = First.symbolsASCII();
//        char[] expected = new char[]{' ', '!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '/', ']', '^','_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~',' '};
//                Assertions.assertArrayEquals(actual, expected);

    @Test
    public void test_integer_to_String() {
        String actual = First.intToString(5);
        String expected = "5";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_double_to_String() {
        String actual = First.doubleToString(5.0);
        String expected = "5.0";
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

//    @Test
//    public void test_add_space() {
//        String actual = First.add_space("cara apple id fox", 4);
//        String expected = "c$$$";
//        Assertions.assertEquals(actual, expected);
//    }
    @Test
    public void test_add_space() {
        String actual = First.add_space("пять,шесть.а");
        String expected = "п я т ь , ш е с т ь . а ";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_getUniqueChar() {
        String actual = First.getUniqueChar("Five hjh Five bhbh");
        String expected = "Five hjb";
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
        String actual = First.deletePosition("Five hjh Five bhbh",4,6);
        String expected = "Fiveive bhbh";
        Assertions.assertEquals(actual, expected);
    }
//    @Test
//    public void reverse() {
//            StringBuffer sbOne = new StringBuffer(First.reverse("yuyuyu"));
//            StringBuffer sbTwo = new StringBuffer("hello");
//            First iui = new First();
//            boolean hel = iui.StringBuff(sbOne, sbTwo);
//        Assertions.assertEquals(true, hel);
//        }

    @Test
    public void deleteLastWord() {
        String actual = First.deleteLastWord("Five hjh Five bhbh");
        String expected = "Five hjh Five";
        Assertions.assertEquals(actual, expected);
    }

}






package com.thomas.romannumberconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class RomanNumberConverterTest {

    @Test
    public void shouldUnderstandTheISymbol() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("I");
        assertEquals(1, number);
    }
    @Test
    public void shouldUnderstandTheVSymbol() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("V");
        assertEquals(5, number);
    }

    @Test
    public void shouldUnderstandTwoSymbolsLikeII() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("II");
        assertEquals(2, number);
    }

    @Test
    public void shouldUnderstandFourSymbolsInPairsLikeXXII() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("XXII");
        assertEquals(22, number);
    }

    @Test
    public void shouldUnderstandNumbersLikeIX() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("IX");
        assertEquals(9, number);
    }

    @Test
    public void shouldUnderstandComplexNumbersLikeXXIV() {
        RomanNumberConverter roman = new RomanNumberConverter();
        int number = roman.convert("XXIV");
        assertEquals(24, number);
    }

}

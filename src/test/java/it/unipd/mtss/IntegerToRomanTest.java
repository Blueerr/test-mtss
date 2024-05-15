////////////////////////////////////////////////////////////////////
// [GIOVANNI] [SALVO'] [MATRICOLA1]
// [LUCA] [GAZZOLA] [MATRICOLA2]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class IntegerToRomanTest
        extends TestCase {
    
    @Test
    public void testConvertOneToRoman() {
        int number = 1;
        String expectedRoman = "I";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFiveToRoman() {
        int number = 5;
        String expectedRoman = "V";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertTenToRoman() {
        int number = 10;
        String expectedRoman = "X";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertFiftyToRoman() {
        int number = 50;
        String expectedRoman = "L";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertOneHundredToRoman() {
        int number = 100;
        String expectedRoman = "C";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertFiveHundredToRoman() {
        int number = 500;
        String expectedRoman = "D";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertOneThousandToRoman() {
        int number = 1000;
        String expectedRoman = "M";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }
    
    @Test
    public void testConvertTwoToRoman() {
        int number = 2;
        String expectedRoman = "II";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourToRoman() {
        int number = 4;
        String expectedRoman = "IV";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNineToRoman() {
        int number = 9;
        String expectedRoman = "IX";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourtyToRoman() {
        int number = 40;
        String expectedRoman = "XL";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNintyToRoman() {
        int number = 90;
        String expectedRoman = "XC";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourHundredToRoman() {
        int number = 400;
        String expectedRoman = "CD";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNineHundredToRoman() {
        int number = 900;
        String expectedRoman = "CM";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }
}

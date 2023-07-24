package org.example;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPeakTest {


    @Test
    void sampleTestCase(){

        String[] givenArray = new String[]{"1", "2", "3", "3", "4", "0", "10", "6", "5", "-1", "-3", "2", "3"};
        int actualAnswer = 6;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseOne(){

        String[] givenArray = new String[]{};
        int actualAnswer = 0;
        int userOutput = LongestPeak.longestPeak(givenArray);
        System.out.println(userOutput);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseTwo(){

        String[] givenArray = new String[]{"1","3","2"};
        int actualAnswer = 3;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseThree(){

        String[] givenArray = new String[]{"5", "4", "3", "2", "1", "2", "1"};
        int actualAnswer = 3;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseFour(){

        String[] givenArray = new String[]{"5", "4", "3", "2", "1", "2", "10", "12", "-3", "5", "6", "7", "10"};
        int actualAnswer = 5;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseFive(){

        String[] givenArray = new String[]{"5", "4", "3", "2", "1", "2", "10", "12"};
        int actualAnswer = 0;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseSix(){

        String[] givenArray = new String[]{"1", "2", "3", "4", "5", "6", "10", "100", "1000"};
        int actualAnswer = 0;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseSeven(){

        String[] givenArray = new String[]{"1", "2", "3", "3", "2", "1"};
        int actualAnswer = 0;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseEigth(){

        String[] givenArray = new String[]{"1", "1", "3", "2", "1"};
        int actualAnswer = 4;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseNine(){

        String[] givenArray = new String[]{"1", "1", "1", "2", "3", "10", "12", "-3", "-3", "2", "3", "45", "800", "99", "98", "0", "-1", "-1", "2", "3", "4", "5", "0", "-1", "-1"};
        int actualAnswer = 9;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

    @Test
    void testCaseTen(){

        String[] givenArray = new String[]{"1", "2", "3", "3", "4", "0", "10"};
        int actualAnswer = 3;
        int userOutput = LongestPeak.longestPeak(givenArray);
        assertTrue(userOutput==actualAnswer);

    }

}

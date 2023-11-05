package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        // Start a loop, going to check each string until value is found
        for (int i = 0; i < array.length; i++) {

            // If value is found using compareTo (returns an int, 0 means equal), return true and end
             if (array[i].compareTo(value) == 0) {
                    return true;
             }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        int k = array.length;
        int j = array.length-1;
        String[] newArr = new String[k];

        for (int i = 0; i < k; i++){
            newArr[i] = array[j-i];
        }
        return newArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        // Create a new string array to compare to array, revArr, make same size
        String[] revArr = new String[array.length];

        // Populate the revArr from array in reverse order
        for (int i = 0; i < array.length; i++) {
            revArr[i] = array[array.length-i-1];
        }

        // Compare if the now reversed arrays, not the strings in teh arrays, are equal.
        if (Arrays.equals(revArr, array)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        // Alphabet: Array of 26 letters from alphabet
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // Counter: Array of 26 ints to track appearance of letter in array
        int[] alphabetCounter = new int[26];

        // Loop through each string in the array
        for (int i = 0; i < array.length; i++) {

            // Make the ith string a character array
            char [] strChar = array[i].toCharArray();

            // Loop through each character in the character array
            for (int j = 0; j < strChar.length; j++) {

                // Get the jth character in the character array, make lower case for code/index compare
                Character testChar = strChar[j];
                Character testChar2 = Character.toLowerCase(testChar);

                // Loop through the alphabet to count appearance of letters
                for (int a = 0; a < 26; a++) {

                    // When the letter is found, add one to that letters counter
                    if (testChar2.compareTo(alphabet[a]) == 0) {
                        alphabetCounter[a] = alphabetCounter[a] + 1;
                    }

                }


            }

        }
        // LOOP: Consider the array has all letters unless the count of any letter is 0
        Boolean hasAlphabet = true;
        for (int x = 0; x < 26; x++ ) {
            if (alphabetCounter[x] == 0) {
                hasAlphabet = false;
                break;
            }

        }

        return hasAlphabet;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int occurenceCounter = 0;
            for (int i = 0; i < array.length; i++) {

                if (array[i].equals(value)) {
                    occurenceCounter = occurenceCounter + 1;
                }
            }
        return occurenceCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        // can use an array list instead to make it work i think

        String[] newArr = new String[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {

            } else {
                newArr[i] = array[i];
            }
        }

        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
   public static String[] packConsecutiveDuplicates(String[] array) {
       return null;
   }



}

package com.zipcodewilmington;

import java.util.ArrayList;
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

        // There is a simpler and better way to do this, but I haven't found my way there yet
        // Solving this like a checklist...aka using a counter

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

        // can use an array list instead, so we can make adding to it easy
        ArrayList<String> newArr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {

            } else {
                newArr.add(array[i]);
            }
        }

        // Turn the arraylist back into a String array
        String[] newArrStr = new String[newArr.size()];
        for (int j = 0; j < newArr.size(); j++) {
            newArrStr[j] = newArr.get(j);
        }

        return newArrStr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        // Make an array list to hold non-consecutive duplicate strings from array
        ArrayList<String> newArr = new ArrayList<>();

        // LOOP: Check element 0 to element [length -1], don't go out of bounds of array in conditional
        for (int i = 0; i < (array.length - 1); i++) {

            //CONDITIONAL:  If element n == element n+1 is False, add it to new array
            if (array[i].equals(array[i + 1])) {

            } else {
                newArr.add(array[i]);
            }
        }

        // Now add the last element of the array.  The prior duplicates would not have been added anyway.
        newArr.add(array[array.length-1]);

        // BAD LOGIC BELOW - Always need to add the last element from original array.
        /*
        // If last element of array is not equal to previous element, add last element
        for (int j = array.length-1; j > array.length-2; j--) {

            if(array[j].equals(array[j-1])) {

            } else {
                newArr.add(array[j]);
            }
        }
        */

        /*
        //CONDITIONAL:  If the last 2 elements of the array are not equal, add the LAST element
        if (array[array.length-1].equals(array[array.length-2])) {
        } else {
            newArr.add(array[array.length-1]);
        }

         */

        // Convert the array list to array to match expected return for test
        String[] newArrStr = new String[newArr.size()];
        for (int j = 0; j < newArr.size(); j++) {
            newArrStr[j] = newArr.get(j);
        }


    return newArrStr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
   public static String[] packConsecutiveDuplicates(String[] array) {

       /* Planning:
          Can I split the array, if turned into string, by some regex or something when character changes?  Yes, but above my understanding.
          So, what about...
          Use a string builder to build matched strings, separate by spaces
          Get the string from string builder then split it by spaces
          Convert back to String[] array and return
          Tricky part is figuring out how many times to loop if checking one element from array to next
          and not go out of bounds
       */

       // Make a string builder to build out a string of groups of matching letters
       // ex: array = ["a", "a", "b", "c", "c", "d"] -> stringbuilder = "aa b cc d"
       StringBuilder groupedLetters = new StringBuilder();
       groupedLetters.append(array[0]);

       // Still need to loop array length -1 times, but starting at 1 to make conditional work, so use array.length in loop condition
       for (int i = 1; i < (array.length); i++) {

                String letter2 = array[i];
                String letter1 = array[i-1];

                if (letter1.equals(letter2)) {
                    groupedLetters.append(letter2);
                } else {
                    groupedLetters.append(" ");
                    groupedLetters.append(letter2);
                }
       }

       String newArrStr = groupedLetters.toString();
       String[] newArr = newArrStr.split(" ");
       return newArr;
   }



}

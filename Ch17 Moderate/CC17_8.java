/*
CC19.8: Design a method to find the frequency of occurrences of any given word 
in a book.
*/

import java.util.Hashtable;
import java.util.HashMap;

public class CC19_8 {
    public static void main(String[] args) {
        String[] testArr = {"Abc", "abc", "cba", "xyz", "XYZ", "uv", "UV"};
        System.out.println(findWord(testArr, "abc "));
        System.out.println(findWord2(testArr, "abc "));
    }
    
    // Solution 1: Hashtable
    public static Integer findWord(String[] book, String target) {
        if (book == null || book.length == 0 || target == null || target.length() == 0) {
            return null;
        }
        
        Hashtable<String, Integer> myTable = new Hashtable<String, Integer>();
        for (String word: book) {
            word = word.toLowerCase();
            if (word.trim() != "") {
                if (!myTable.containsKey(word)) {
                    myTable.put(word, 1);
                } else {
                    myTable.put(word, myTable.get(word) + 1);
                }
            }
        }
        
        System.out.println(myTable);
        return myTable.get(target.toLowerCase().trim());
    }
    
    // Solution 2: HashMap
    public static Integer findWord2(String[] book, String target) {
        if (book == null || target == null || book.length == 0 || target.length() == 0) {
            return null;
        }
        
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        for (String word: book) {
            word = word.toLowerCase();
            if (word.trim() != "") {
                if (!myMap.containsKey(word)) {
                    myMap.put(word, 1);
                } else {
                    myMap.put(word, myMap.get(word) + 1); // myMap.get(word)++ does NOT work
                }
            }
        }
        
        System.out.println(myMap);
        return myMap.get(target.toLowerCase().trim());
    }
}

package org.pursuit;
//Create a `class` called `Algorithms` in a file called `Algorithms.java` in the `org.pursuit` package.
//
//        This class should implement the `DataStructures` interface.
//
//        This class should `@Override` 4 (four) methods from the `DataStructures` interface, and have the following functionality:
//        * `stringToCharArray`, which should take every `char` in the `String` parameter passed into the method, add it to a `char[]` array, then return that `char[]` array object
//        * `multiplicationTableList`, which should add every number from 1 to 10, multiplied by the parameter passed into the method, to an `ArrayList` object with a parameterized type of `Integer`, then return that `ArrayList<Integer>` object
//        * `wordLength`, which should take every `String` in the `String[]` array parameter passed into the method, and put it in a `HashMap` object with with parameterized key/values types of `String` and `Integer` respectively, with the `String` as a key, and the `String`'s size as a value, then return that `HashMap<String, Integer>` object
//        * `uniqueCharacters`, which should take every unique `char` in the `String` parameter passed into the method, and add it to a `HashSet` object with a parameterized type of `Character`, then return that `HashSet<Character>` object

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {

    //* `stringToCharArray`, which should take every `char` in the `String` parameter passed into the method, add it to a `char[]` array, then return that `char[]` array object

    @Override
    public char[] stringToCharArray(String word) {
        char[] newArray = new char[0];
        for (int i = 0; i < word.length()-1; i++) {
            newArray = new char[i];
        }
        return newArray;
    }
//* `multiplicationTableList`, which should add every number from 1 to 10, multiplied by the parameter passed into the method, to an `ArrayList` object with a parameterized type of `Integer`, then return that `ArrayList<Integer>` object

    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= 10 ; i++) {
            answer.add(i);
        }
        return answer;
    }
//* `wordLength`, which should take every `String` in the `String[]` array parameter passed into the method, and put it in a `HashMap` object with with parameterized key/values types of `String` and `Integer` respectively, with the `String` as a key, and the `String`'s size as a value, then return that `HashMap<String, Integer>` object

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {
        HashMap<String, Integer> wordLength = new HashMap<>();
        for (String word: wordArray) {
            wordLength.put(word, word.length());
        }
        return wordLength;
    }
//* `uniqueCharacters`, which should take every unique `char` in the `String` parameter passed into the method, and add it to a `HashSet` object with a parameterized type of `Character`, then return that `HashSet<Character>` object

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> answer = new HashSet<>();
        for (char i = 0; i <= word.length()-1 ; i++) {
            answer.add(i);
        }
        return answer;
    }
}

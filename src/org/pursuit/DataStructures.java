package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//This interface should have 4 (four) method signatures:
//        * `stringToCharArray`, which accepts a parameter of type `String` called `word`, and returns an object of type `char[]`
//        * `multiplicationTableList`, which accepts a parameter of type `int` called `number`, and returns an object of type `ArrayList<Integer>`
//        * `wordLength`, which accepts a parameter of type `String[]` called `wordArray`, and returns an object of type `HashMap<String, Integer>`
//        * `uniqueCharacters`, which accepts a parameter of type `String` called `word`, and returns an object of type `HashSet<Character>`
public interface DataStructures {

    public char[] stringToCharArray(String word);

    public ArrayList<Integer> multiplicationTableList(int number);

    public HashMap<String, Integer> wordLength(String[] wordArray);

    public HashSet<Character> uniqueCharacters(String word);




}

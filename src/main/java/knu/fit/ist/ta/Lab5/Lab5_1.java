/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Admin
 */
public class Lab5_1 {
    public static String text;
    private static String[] words;
    
    public Lab5_1(String text)
    {
        this.text = text;
        String textWithoutPunctuation = text;
        textWithoutPunctuation = textWithoutPunctuation.replace("!", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("?", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(",", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(":", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("(", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(")", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(".", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("'", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(";", "");
        textWithoutPunctuation = textWithoutPunctuation.toLowerCase();
        words = textWithoutPunctuation.split("\\s+");
    }
    
    public String GetText()
    {
        return text;
    }
    
    public static String FindWord(String word)
    {
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        for (int i = 0; i < words.length; i++)
            dictionary.put(i, words[i]);
        List<Map.Entry<Integer, String>> list = new ArrayList<>(dictionary.entrySet());
        int listLength = list.size();
        Entry<Integer, String> key;
        int j;
        for (int i = 1; i < listLength; i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0) {
                if (key.getValue().compareTo(list.get(j).getValue()) > 0) {
                  break;
                }
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }

        return Integer.toString(jumpSearch(list, word) + 1);
    }
    
    public static int jumpSearch(List<Map.Entry<Integer, String>> list, String x)
    {
        int n = list.size();
 
        int step = (int)Math.floor(Math.sqrt(n));
 
        int prev = 0;
        while (list.get(Math.min(step, n)-1).getValue().compareTo(x) < 0)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        
        while (list.get(prev).getValue().compareTo(x) < 0)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (list.get(prev).getValue().equals(x))
            return list.get(prev).getKey();
 
        return -1;
    }
    
    public String GetMostPopularWords()
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
           if(dictionary.containsKey(words[i]))
               dictionary.put(words[i], dictionary.get(words[i]) + 1);
           else
               dictionary.put(words[i], 1);
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public String MostPopularSequences(int length)
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;
        for (int i = 0; i < words.length; i++) {
            currentWordLength = words[i].length();
            for (int j = 0; j < currentWordLength - length; j++) {
                sequence = words[i].substring(j, j + length);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                   dictionary.put(sequence, 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public void Sort(List<Map.Entry<String, Integer>> list)
    {
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j).getKey().compareTo(list.get(j + 1).getKey()) > 0) { 
                    Entry<String, Integer> temp = list.get(j); 
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

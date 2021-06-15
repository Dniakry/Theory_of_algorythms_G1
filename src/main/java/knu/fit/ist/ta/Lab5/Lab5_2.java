/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lab5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Lab5_2 {
    private int modelsNumber;
    private LinkedList<Model> list;
    
    public Lab5_2(int modelsNumber)
    {
        this.modelsNumber = modelsNumber;
        list = new LinkedList<Model>();
    }
    
    public void InitList()
    {
        Random rd = new Random();
        list.clear();
        for (int i = 0; i < modelsNumber; i++)
            list.add(new Model("model #" + i, (short)rd.nextInt(32767)));
    }
    
    public String DisplayList()
    {
        String s = "";
        Iterator<Model> itr = list.iterator();
        for (int i = 0; itr.hasNext(); i++) {
            s += i + ". " + itr.next() + "<br/>";
        }
        return s;
    }
    
    public int IndexOf(Model find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).equals(find))
                return i;
        return result;
    }
    
    public int IndexOf(String find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).getStringField().equals(find))
                return i;
        return result;
    }
    
    public int IndexOf(Short find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).getShortField().equals(find))
                return i;
        return result;
    }
    
    public void Sort(Comparator<Model> comparator)
    {
        int listLength = list.size();
        Model key;
        int j;
        for (int i = 1; i < listLength; ++i) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && comparator.compare(list.get(j), key) > 1) {
                list.set(j + 1, list.get(j--));
            }
            list.set(j + 1, key);
        }
    }
    
        public void SortByStringField()
    {
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j).getStringField().compareTo(list.get(j + 1).getStringField())  > 0) { 
                    Model temp = list.get(j); 
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    
    public void SortByShortField()
    {
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j).getShortField().compareTo(list.get(j + 1).getShortField()) > 0) { 
                    Model temp = list.get(j); 
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
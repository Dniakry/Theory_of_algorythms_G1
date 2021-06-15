/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.laba_3;

import java.util.Arrays;
import java.util.Random;

public class Lab3 {
    private int[] array;
    
    public Lab3(int length)
    {
        if(length < 0)
            length = 20;
        array = new int[length];
    }
    
    public int GetArrayLength()
    {
        return array.length;
    }
    
    public void InitArray()
    {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
    }
    
    public int GetMaximumSum()
    {
        int max = Integer.MIN_VALUE;
        int buff = 0;
        int sum = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            buff = array[i];
            sum = 0;
            do {
                sum += buff % 10;
                buff /= 10;
            } while (buff > 0);
            if(sum > max)
                max = sum;
        }
        
        return max;
    }
    
    public String DisplayArray()
    {
        return Arrays.toString(array);
    }
}
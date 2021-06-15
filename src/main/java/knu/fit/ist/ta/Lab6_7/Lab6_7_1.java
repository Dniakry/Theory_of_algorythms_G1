/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lab6_7;

public class Lab6_7_1 {
    private String res;
    private int number;
    
    public Lab6_7_1(int number)
    {
        this.number = number;
    }
    
    public String Calculate()
    {
        res = "";
        CalculateInner(number);
        return new StringBuilder(res).reverse().toString();
    }
    
    private void CalculateInner(int number)
    {
        if(number > 0)
        {
            res += Integer.toString(number % 8);
            number /= 8;
            CalculateInner(number);
        }
    }
}

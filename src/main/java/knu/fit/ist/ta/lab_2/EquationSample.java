/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab_2;


import static java.lang.Math.log;
import org.springframework.stereotype.Component;

/**
 *
 * @author Юра
 */

@Component
public class EquationSample {
    
    //public static void main (String[] args) {
      //  System.out.println((log(5)/(-9*(5*5)-3*5+9)));
    //} //-0.00696726369019091 
    
    public  float solve(int x) {
        if (x==0) { return Integer.MAX_VALUE; }
        else if(x == 0.761f) {return Integer.MAX_VALUE;}
        
        
        return (float) (log(x)/(6*(x*x)+2*x-5)); // можливе дiлення на 0 
    }
}
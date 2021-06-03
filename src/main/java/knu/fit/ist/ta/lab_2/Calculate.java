/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab_2;

import static java.lang.Math.log;
/**
 *
 * @author Юра
 */
public class Calculate {
    
    
    public static float lab2equation (float x) {
        
        if(x == 0){return Integer.MAX_VALUE;}
        else if(x == 0.761f) {return Integer.MAX_VALUE;}
        
        return (float) (log(x)/(6*(x*x)+2*x-5));
        
    }
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab_2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;
/**
 *
 * @author Юра
 */
@Service
public class Lab_2View {
    
   DecimalFormat df = new DecimalFormat("##.###");
    
    public String showResult (String xString) {
        
        Float x = Float.parseFloat(xString);
        
        if (x < 0) {
            return "Неправильно ведено x, число повинно бути позитивним";
        }else {
            return df.format(Calculate.lab2equation(x));
        }
    }
}

     
        
    
    


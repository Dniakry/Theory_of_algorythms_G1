/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

/**
 *
 * @author Юра
 */
public class SimpleApp {
    
    
       public static void main(String[] args){
       MyFirstJavaClass fDD =  new MyFirstJavaClass(5);
       
       
       System.out.println(fDD.toString());
       
        MyFirstJavaClass.setStaticinit(10);
       
        System.out.println(MyFirstJavaClass.toStringStatic());
        
//        DecimalFormat df = new DecimalFormat("###.###");
//        System.out.println(df.format(PI));
        
        float f1 = 2.035678f;
        
        float f2 = 2.035678f;
        
           System.out.println (Math.abs(f1 - f2)<= 0.01f);
        
        
       
} 
    
    
    
}

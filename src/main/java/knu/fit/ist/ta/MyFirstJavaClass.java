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
public class MyFirstJavaClass {

    private double mydouble;
    private static double staticinit;
    
     public MyFirstJavaClass() {
    }

    public MyFirstJavaClass(double mydouble) {
        this.mydouble = mydouble;
    }
     
     
    
    public static double getStaticinit() {
        return staticinit;
    }

    public static void setStaticinit(double aStaticinit) {
        staticinit = aStaticinit;
    }

    public double getMydouble() {
        return mydouble;
    }

    public void setMydouble(double mydouble) {
        this.mydouble = mydouble;
    }

    @Override
    public String toString() {
        return "MyFirstJavaClass{" + "myfloat=" + mydouble + '}';
    }
    
    public static String toStringStatic() {
        return "MyFirstJavaClass{" + "staticinit=" + staticinit + '}';
    }
    
    
    
}

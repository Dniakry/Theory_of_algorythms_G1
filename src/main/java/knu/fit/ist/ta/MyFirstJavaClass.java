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

    private int myint;
    private static int staticinit;
    
     public MyFirstJavaClass() {
    }

    public MyFirstJavaClass(int myint) {
        this.myint = myint;
    }
     
     
    
    public static int getStaticinit() {
        return staticinit;
    }

    public static void setStaticinit(int aStaticinit) {
        staticinit = aStaticinit;
    }

    public int getMyint() {
        return myint;
    }

    public void setMyint(int myint) {
        this.myint = myint;
    }

    @Override
    public String toString() {
        return "MyFirstJavaClass{" + "myint=" + myint + '}';
    }
    
    public static String toStringStatic() {
        return "MyFirstJavaClass{" + "staticinit=" + staticinit + '}';
    }
    
    
    
}

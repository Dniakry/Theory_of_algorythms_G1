/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havrylenko.exam.exam_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Formul {
    public List<Double> args;
    public static List<Double> results;
    
    public Formul(){
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
    }
    
    public Formul(int length) {
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
        Random random = new Random();
        
        for (int i = 0; i < length; i++)
            args.add((double)random.nextInt(100));
    }
    
    public void SetArgs(double[] args) {
        this.args.clear();
        for (int i = 0; i < args.length; i++)
            this.args.add(args[i]);
    }
    
    public String Calculate() {
        results.clear();
        int length = args.size();

        for (int i = 0; i < length; i++)
            results.add(Calculate.Calculate(args.get(i)));
        
        return results.toString();
    }
    
    public String GetArgs() {
        return args.toString();
    }
}

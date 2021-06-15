/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lab8;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ruslan
 */
public class Algorithms {
    private int[] _array;
    
    public Algorithms(int length)
    {
        _array = GenerateArray(length);
    }
    
    public int[] GenerateArray(int length)
    {
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
           array[i] = rd.nextInt();
        return array;
    }
    
    public AlgorithmDetails ShellSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = array.length-1;
        int comparisons = 0;
        long startTime = System.nanoTime();
        int n = array.length;
 
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            comparisons++;
            for (int i = gap; i < n; i += 1)
            {
                comparisons++;
                temp = array[i];
                substitutions++;
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                    substitutions++;
                }
 
                array[j] = temp;
            }
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    public AlgorithmDetails HeapSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        long startTime = System.nanoTime();
        int n = array.length;
 
        for (int i = n / 2 - 1; i >= 0; i--){
            details = heapify(array, n, i, details);
            details.setComparisons(details.getComparisons() + 1);
        }

        for (int i = n - 1; i > 0; i--) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
            details = heapify(array, i, 0, details);
        }
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
 
    AlgorithmDetails heapify(int arr[], int n, int i, AlgorithmDetails details)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        details.setComparisons(details.getComparisons() + 2);
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        details.setComparisons(details.getComparisons() + 2);
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        details.setComparisons(details.getComparisons() + 1);
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            details.setSubstitutions(details.getSubstitutions()+ 1);
            details = heapify(arr, n, largest, details);
        }
        return details;
    }
    
    void MergeSortInner(int arr[], int l, int m, int r, AlgorithmDetails details)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            details.setComparisons(details.getComparisons() + 3);
            details.setSubstitutions(details.getSubstitutions()+ 1);
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
        }
    }
 
    public void MergeSortOuter(int arr[], int l, int r, AlgorithmDetails details)
    {
        details.setComparisons(details.getComparisons()+ 1);
        if (l < r) {
            int m =l+ (r-l)/2;
            
            MergeSortOuter(arr, l, m, details);
            MergeSortOuter(arr, m + 1, r, details);
 
            MergeSortInner(arr, l, m, r, details);
        }

    }
    
    public AlgorithmDetails MergeSort()
    {
        AlgorithmDetails details = new AlgorithmDetails();
        int[] array = Arrays.copyOf(_array, _array.length);
        long startTime = System.nanoTime();
        MergeSortOuter(array, 0, array.length - 1, details);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
}

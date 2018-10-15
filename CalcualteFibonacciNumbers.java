package com.geeks.algoexamples;

public class CalcualteFibonacciNumbers {
	
    static long[] fNum = new long[100];
    
    public static long getFibonacciNum (int n) {
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fNum[n] > 0) return fNum[n];
        
        fNum[n] = getFibonacciNum(n-1) + getFibonacciNum(n-2);
        return fNum[n];
    }
    
    public static void main (String[] args) {
        int n = 98;
        // int n = Integer.parseInt(args[0]);
        for (int i=1; i <=n; i++)
        System.out.println ("index " + i + ":= " + getFibonacciNum(i) + "   ");
        System.out.println();
        

    }

}

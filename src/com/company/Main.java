package com.company;

public class Main {
    static int szPotegowanie(int a, int n){
        System.out.print(".");
        if(n == 1){
            return a;
        }
        if(n % 2 == 0){
            int x =szPotegowanie(a, n/2);
            return  x * x;
        }
        else{
            return a * szPotegowanie(a, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(szPotegowanie(2,10));
    }
}

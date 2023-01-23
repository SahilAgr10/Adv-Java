package com.sahil;
import java.util.Scanner;
// for a static data  can be accessed using clas name directly with dot operator .
// eg. : recursion.main(); otherwise we hVE TO Declare object first
public class Main {
    static int a = 90;
    public static void main(String[] args) {
        int ans = prod(515);
        System.out.println(ans);
    }

    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}

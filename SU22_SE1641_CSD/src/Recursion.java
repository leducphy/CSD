/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Recursion {

    public Recursion() {
    }

    int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    int findmin(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        int min = findmin(a, n - 1);
        if (min > a[n - 1]) {
            min = a[n - 1];
        }
        return min;
    }

    int findsum(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            return a[n - 1] + findsum(a, n - 1);
        }
    }

    int ispalindrome(char a[], int n) {
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Recursion re = new Recursion();
        System.out.println(re.sum(10));
        int[] arr = {3,2,3,4,5};
        System.out.println(re.findmin(arr, 5));;
        System.out.println(re.findsum(arr, 5));
    }
}

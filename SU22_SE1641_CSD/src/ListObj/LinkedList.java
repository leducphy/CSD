/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListObj;

import List.*;

/**
 *
 * @author admin
 */
public class LinkedList {

    public static void main(String[] args) {
        MyList list = new MyList();

        //1
        System.out.println("1. addLast");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 20);
        list.addLast("Bg", 20);
        list.addLast("Z", 18);
        list.traverse();
        System.out.println("");
        //2
        System.out.println("2. Delete the first node having age = 20");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 20);
        list.addLast("Bg", 20);
        list.addLast("Z", 18);
        list.addLast("Y", 20);
        list.traverse();
        list.deleteFisrt20();
        list.traverse();
        System.out.println("");

        //3
        System.out.println("3. Display the first 5 person having age >22");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 18);
        list.addLast("Y", 29);
        list.addLast("K", 29);
        list.addLast("L", 29);
        list.addLast("Z", 29);
        list.traverse();
        list.display5F22();
        System.out.println("");
        
        //4
        System.out.println("4. Display the first person having the second max age");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 18);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 38);
        list.addLast("Z", 36);
        list.traverse();
        list.Display1Max2ndAge();
        System.out.println("");
        
        //5
        System.out.println("5. Sort the list descendingly by age");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 18);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 38);
        list.addLast("Z", 36);
        list.traverse();
        System.out.println("The list after sorted by age");
        list.sortDescAge();list.traverse();
        System.out.println("");
        
        //6
        System.out.println("6. Delete the last node having age = 20");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 20);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 20);
        list.addLast("Z", 36);
        list.traverse();
        list.DelLastNodeA20();
        list.traverse();
        System.out.println("");
        
        //7
        System.out.println("7. Display the last 5 person having age >22");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 24);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 27);
        list.addLast("Z", 36);
        list.traverse();
        list.display5L22();
        list.traverse();
        System.out.println("");
        
        //8
        System.out.println("8. Find the third max age");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 24);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 27);
        list.addLast("Z", 36);
        list.traverse();
        System.out.println("The third max age :" + list.Max3rdAge());
        
        //9
        System.out.println("9. Insert the new person at the given index");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 24);
        list.addLast("Bg", 20);
        list.addLast("Z", 24);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 27);
        list.addLast("Z", 36);
        list.traverse();
        list.add("Q",45,6);
        list.traverse();
        System.out.println("");
        
        //10
        System.out.println("10. Sort the linked list ascendingly by name from startIndex to endIndex");
        list.clear();
        list.addLast("A", 1);
        list.addLast("B", 30);
        list.addLast("C", 36);
        list.addLast("D", 25);
        list.addLast("Bg", 20);
        list.addLast("Z", 24);
        list.addLast("Y", 38);
        list.addLast("K", 29);
        list.addLast("L", 27);
        list.addLast("Z", 36);
        list.traverse();
        list.sort(1, 5);
        list.traverse();
        System.out.println("");
    }
}

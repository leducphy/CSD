/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author admin
 */
public class LinkedList {

    public static void main(String[] args) {
        MyList list = new MyList();

        //1
        System.out.println("1.Check addToHead");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.traverse();
        System.out.println("");

        //2
        System.out.println("2.Check addToTail");
        list.clear();
        list.addToHead(1);
        list.addToTail(2);
        list.traverse();
        System.out.println("");
        
        //3
        System.out.println("3.Check addAfter");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);        
        list.addAfter(list.search(1), 14);
        list.traverse();
        System.out.println("");

        //5
        System.out.println("5.Check delFromHead");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.delFromHead();
        list.traverse();
        System.out.println("");

        //6
        System.out.println("6.Check delFromTail");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.delFromTail();
        list.traverse();
        System.out.println("");

        //7
        System.out.println("7.Check delAfter");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.delAfter(list.head);
        list.traverse();
        System.out.println("");
        //8
        System.out.println("8.delele the first node whose info is equal to x.");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(4);
        list.traverse();        
        list.dele(2);
        list.traverse();
        System.out.println("");

        //9
        System.out.println("9.Check search");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        Node p = list.search(2);
        list.remove(p);
        list.traverse();
        System.out.println("");
        
        //10
        System.out.println("10.Check count");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        System.out.println("Number of nodes in the list: " + list.count());
        list.traverse();
        System.out.println("");
        
        //11
        System.out.println("11.Check del i-th");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.dele(2);
        list.traverse();
        System.out.println("");   
        //12
        System.out.println("12.sort:");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(10);
        list.addToHead(3);
        list.traverse();        
        list.sort();
        list.traverse();
        System.out.println("");
        //13
        System.out.println("13. Delete node p");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.dele(new Node(4));
        list.traverse();
        System.out.println("");
        //14
        System.out.println("14. To array");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        int arr[] = list.toArray();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //15
        System.out.println("15. Merge two order list");
        list.clear();
        MyList list1 = new MyList();
        list1.addToHead(6);
        list1.addToHead(2);
        list1.addToHead(4);
        MyList list2 = new MyList();
        list2.addToHead(5);
        list2.addToHead(7);
        list2.addToHead(3);
        list.merge(list1, list2);
        list.traverse();
        System.out.println("");
        //16
        System.out.println("16.Check addBefore");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);        
        list.addBefore(new Node(2), 14);
        list.traverse();
        System.out.println("");
        //17
        System.out.println("17. Attach a singly linked list to the end of another singly linked list.");
        list.clear();list1.clear();
        list.addToHead(5);
        list.addToHead(7);
        list.addToHead(3);
        
        list1.addToHead(6);
        list1.addToHead(2);
        list1.addToHead(4);
        list.attach(list1);
        list.traverse();
        System.out.println("");
        //18
        System.out.println("18.max:");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(6);
        list.addToHead(3);
        System.out.println(list.max());
        System.out.println("");
        
        //19
        System.out.println("19.min:");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(6);
        list.addToHead(3);
        System.out.println(list.min());
        System.out.println("");
        //20
        System.out.println("20.sum:");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(6);
        list.addToHead(3);
        System.out.println(list.sum());
        System.out.println("");
        //21
        System.out.println("21.avg:");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(10);
        list.addToHead(3);
        System.out.println(list.avg());
        System.out.println("");
        //22
        System.out.println("22. Check if list is sorted");
        list.clear();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.addToHead(10);
        list.traverse();    
        System.out.println(list.sorted());
        list.sort();
        list.traverse();
        System.out.println(list.sorted());
        System.out.println("");
        //23
        System.out.println("23. Insert node with value x into sorted list ");
        list.clear();
        list.addToHead(1);
        list.addToHead(7);
        list.addToHead(3);
        list.addToHead(10);
        list.sort();
        list.insert(0);
        list.traverse();
        System.out.println("");
        //24
        System.out.println("24. Reverse a singly linked list using only one pass through the list.");
        list.clear();
        list.addToHead(1);
        list.addToHead(7);
        list.addToHead(3);
        list.addToHead(10);
        list.reverse().traverse();
        System.out.println("");
        //25
        System.out.println("25. Check whether two singly linked list have the same contents.");
        list1.clear();
        list1.addToHead(6);
        list1.addToHead(2);
        list1.addToHead(4);
        list1.traverse();
        list2.clear();
        list2.addToHead(6);
        list2.addToHead(2);
        list2.addToHead(4);
        
        list2.traverse();
        System.out.println(list.CheckSameContent(list1, list2));
        System.out.println("");
    }
}

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
public class Node {
    Person info;
    Node next;
    
    Node(String name,int age) {
        info = new Person(name, age);
        next = null;
    }
    
}

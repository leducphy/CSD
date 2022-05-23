/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListObj;

/**
 *
 * @author admin
 */
public class MyList {

    Node head;
    Node tail;

    public MyList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = tail = null;
    }

    Node beforeNode(Node q) {
        Node f = head;
        while (f.next != q) {
            f = f.next;
        }
        return f;
    }

    void remove(Node q) {
        if (isEmpty()) {
            return;
        }
        if (q == head) {//a b 
            head = q.next;
            return;
        }
        if (q == null) {
            return;
        }
        beforeNode(q).next = q.next;
    }

    int count() {
        Node p = head;
        int count = 1;
        while (p.next != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    void addToHead(String name, int age) {
        Node p = new Node(name, age);
        if (isEmpty()) {
            head = tail = p;
            return;
        }
        p.next = head;
        head = p;
    }

    //3
    void addAfter(Node p, String name, int age) {
        Node p1 = new Node(name, age);
        if (isEmpty()) {
            return;
        }
        p1.next = p.next;
        p.next = p1;
        if (p == tail) {
            tail = p1;
        }
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
        System.out.println("");
    }

    //1
    void addLast(String xName, int xAge) {
        Node p = new Node(xName, xAge);
        if (isEmpty() && !(p.info.name.substring(0, 1).equals("B") || p.info.age < 17)) {
            head = tail = p;
            return;
        }
        if (p.info.name.substring(0, 1).equals("B") || p.info.age < 17) {
        } else {
            tail.next = p;
            tail = p;
        }
    }

    //2
    void deleteFisrt20() {
        Node p = head;
        while (p != null) {
            if (p.info.age == 20) {
                remove(p);
                break;
            }
            p = p.next;
        }
    }

    //3
    void display5F22() {
        Node p = head;
        int count = 0;
        while (p != null) {
            if (p.info.age > 22) {
                System.out.print(p.info + " ");
                count++;
            }
            if (count == 5) {
                break;
            }
            p = p.next;
        }
    }

    //4
    int MaxAge() {
        Node p = head;
        int max = p.info.age;
        while (p.next != null) {
            if (p.next.info.age > max) {
                max = p.next.info.age;
            }
            p = p.next;
        }
        return max;
    }

    int Max2ndAge() {
        int max = this.MaxAge();
        Node p = head;
        while (p != null) {
            if (p.info.age == max) {
                remove(p);
            }
            p = p.next;
        }
        return this.MaxAge();
    }

    void Display1Max2ndAge() {
        Node p = head;
        while (p != null) {
            if (p.info.age == this.Max2ndAge()) {
                System.out.println(p.info);
                break;
            }
            p = p.next;
        }
    }

    //5
    void sortDescAge() {
        Node i;
        Node j;
        Person tmp;
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.info.age < j.info.age) {
                    tmp = i.info;
                    i.info = j.info;
                    j.info = tmp;
                }
            }
        }
    }

    //6
    void DelLastNodeA20() {
        Node p = head;
        int index = 0, n = 0, count = 0;
        while (p != null) {
            if (p.info.age == 20) {
                n = index;
            }
            index++;
            p = p.next;
        }
        p = head;
        while (p != null) {
            if (count == n) {
                remove(p);
                break;
            }
            count++;
            p = p.next;
        }
    }

    //7
    MyList reverse() {
        MyList my = new MyList();
        Node p = head;
        while (p != null) {
            my.addToHead(p.info.name, p.info.age);
            p = p.next;
        }
        return my;
    }

    void display5L22() {
        MyList list1 = this.reverse();
        this.clear();
        Node p = list1.head;
        int count = 0;
        while (p != null) {
            if (p.info.age > 22) {
                this.addToHead(p.info.name, p.info.age);
                count++;
            }
            if (count == 5) {
                break;
            }
            p = p.next;
        }
    }

    //8
    int Max3rdAge() {
        int max2 = this.Max2ndAge();
        Node p = head;
        while (p != null) {
            if (p.info.age == max2) {
                remove(p);
            }
            p = p.next;
        }
        return this.MaxAge();
    }

    //9
    void add(String xName, int xAge, int index) {
        if (index < 0 || index > this.count() - 1 || xName.substring(0, 1).equals("B") || xAge < 17) {
            System.out.println("Error adding! Person is invalid or index is wrong");
            return ;
        }
        int count = 0;
        Node p = head;
        while (p.next != null) {
            if (count == index - 1) {
                this.addAfter(p, xName, xAge);
                break;
            }
            count++;
            p = p.next;
        }
    }

    //10
    void sort(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > this.count() - 1 || endIndex < 0 || endIndex > this.count() - 1 || startIndex >= endIndex) {
            System.out.println("Error index!");
            return ;
        }
        int count = 0,m=0;
        Person tmp;
        Node p = head,i;
        while (p.next != null) {
            if (count == startIndex) {
                for (; p != null; p = p.next) {
                    int n=0;
                    for (i = p.next; i != null; i = i.next) {
                        if (p.info.age > i.info.age) {
                            tmp = p.info;
                            p.info = i.info;
                            i.info = tmp;
                        }
                        n++;
                        if (m+n==endIndex-startIndex) {
                            break;
                        }
                    }
                    if (m+1==endIndex-startIndex) {
                        break;
                    }
                    m++;
                }
                break;
            }
            count++;
            p = p.next;
        }
    }
}

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

    //1
    void addToHead(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
            return;
        }
        p.next = head;
        head = p;
    }

    //2
    void addToTail(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
            return;
        }
        tail.next = p;
        tail = p;
    }

    //3
    void addAfter(Node p, int x) {
        Node p1 = new Node(x);
        if (isEmpty()) {
            return;
        }
        p1.next = p.next;
        p.next = p1;
        if (p == tail) {
            tail = p1;
        }
    }

    //4
    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
        System.out.println("");
    }

    //5
    void delFromHead() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    //6
    void delFromTail() {
        Node p = head;
        if (isEmpty()) {
            return;
        }
        if (head == tail && head != null) {
            head = tail = null;
        }
        while (p.next != null) {
            p = p.next;
            if (p.next == tail) {
                p.next = null;
                tail = p;
            }
        }
    }

    //7
    void delAfter(Node p) {
        if (isEmpty() || head == tail || p == tail) {
            return;
        }
        p.next = p.next.next;
    }

    //8
    void dele(int x) {
        Node p = head;
        if (isEmpty()) {
            return;
        }
        while (p.next != null) {
            if (p.info == x) {
                remove(p);
                break;
            }
            p = p.next;
        }
    }

    //9
    Node search(int x) {
        Node p = head;
        while (p != null) {
            if (p.info == x) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    //10
    int count() {
        Node p = head;
        int count = 1;
        while (p.next != null) {
            count++;
            p = p.next;
        }
        return count;
    }
//11
//    void dele(int i) {
//        Node p = head;
//        int count = 0;
//        while (p.next != null) {
//            count++;
//            if (count == i) {
//                remove(p);
//            }
//            p = p.next;
//        }
//    }
    //12

    void sort() {
        Node i;
        Node j;
        Node tmp = new Node(0);
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.info > j.info) {
                    tmp.info = i.info;
                    i.info = j.info;
                    j.info = tmp.info;
                }
            }
        }
    }

    //13
    void dele(Node p) {
        if (isEmpty()) {
            return;
        }
        Node k = head;
        while (k.next != null) {
            if (k.info == p.info) {
                remove(k);
            }
            k = k.next;
        }
    }

    //14
    int[] toArray() {
        Node p;
        int i = 0;
        for (p = head; p != null; p = p.next) {
            i++;
        }
        int[] arr = new int[i];
        int j = 0;
        if (isEmpty()) {
            return null;
        }
        for (p = head; p != null; p = p.next) {
            arr[j] = p.info;
            j++;
        }
        return arr;
    }
    //15
    void merge (MyList list1, MyList list2) {
        list1.sort();list2.sort();
        Node p = list1.head;
        while (p != null) {
            this.addToHead(p.info);
            p = p.next;
        }
        Node q = list2.head;
        while (q != null) {
            this.addToHead(q.info);
            q = q.next;
        }
        this.sort();
    }
    //16
    void addBefore(Node p, int x) {
        if (isEmpty()) {
            return;
        }
        Node q = head;
        if (q.info==p.info) {
            this.addToHead(x);
        } else {
            while (q.next != null) {
                if (q.next.info == p.info) {
                    this.addAfter(q, x);
                    break;
                }
                q = q.next;
            }
        }
    }
    //17
    void attach (MyList list1) {
        Node p = list1.head;
        while (p != null) {
            this.addToTail(p.info);
            p = p.next;
        }
        
    }
    //18
    int max() {
        Node p = head;
        int max = p.info;
        while (p.next != null) {
            if (p.next.info > max) {
                max = p.next.info;
            }
            p = p.next;
        }
        return max;
    }

    //19
    int min() {
        Node p = head;
        int min = p.info;
        while (p.next != null) {
            if (p.next.info < min) {
                min = p.next.info;
            }
            p = p.next;
        }
        return min;
    }

    //20
    int sum() {
        Node p = head;
        int sum = p.info;
        while (p.next != null) {
            sum += p.next.info;
            p = p.next;
        }
        return sum;
    }

    //21
    int avg() {
        return sum() / count();
    }

    //22
    boolean sorted() {
        Node p = head;
        int count = 0;
        while (p.next != null) {
            if (p.info > p.next.info) {
                count++;
            }
            p = p.next;
        }
        if (count == count() - 1) {
            return true;
        }
        count = 0;
        p = head;
        while (p.next != null) {
            if (p.info <= p.next.info) {
                count++;
            }
            p = p.next;
        }
        return count == count() - 1;
    }
    //23 
    void insert(int x) {
//        this.addToHead(x);
//        this.sort();
        Node p = head;
        while (p != null) {
            if (p.info >= x) {
                this.addBefore(p, x);
                break;
            }
            p = p.next;
        }
    }
    //24
    MyList reverse() {
        MyList my = new MyList();
        Node p = head;
        while (p != null) {
            my.addToHead(p.info);
            p = p.next;
        }
        return my;
    }
    // 25
    boolean CheckSameContent(MyList list1, MyList list2) {
        Node p = list1.head, k = list2.head;
        if (list1.count()!=list2.count()) {
            return false;
        } else {
            while (p != null) {
            if (p.info!=k.info) {
                return false;
            }
            p = p.next;
            k=k.next;
        }
        return true;
        }
    }
}

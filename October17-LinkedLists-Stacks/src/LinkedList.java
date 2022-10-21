/*
1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8.
In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
 */

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;


    //-------------------------------------------
    //-------- Common Method Implementations ----
    //-------------------------------------------


    //-----addLast-----
    public void addLast(int item){
        var node = new Node(item);

        if(first==null){
            first = last = node;
        } else{
            last.next = node;
            last = node;
        }

        size++;
    }

    //-----addFirst-----
    public void addFirst(int item) {
        var node = new Node(item);

        if(isEmpty()){
            first=last=node;
        } else{
            node.next=first;    //
            first = node;
        }
        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    //-----indexOf-----
    public int indexOf(int item){
        int index= 0;
        var current = first;
        while(current!=null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //-----contains-----
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //-----removeFirst-----
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        if(first==last){
            first = last = null;
            return;
        }
        var second = first.next;    //20
        first.next = null;  //will remove link
        first = second;

        size--;
    }

    //-----removeLast-----
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){          //means we have a single node
            first = last = null;    //null out both first/last node
        }
        else{
            last = getPrevious(last);
            if (last != null) {
                last.next = null;
            }

            size--;
        }
    }

    //-----getPrevious-----
    private Node getPrevious(Node node){ //whatever node we give it, it'll get the previous node
        var current = first;
        while(current!=null){
            if(current.next == node)  return current;
            else{ current = current.next;}
        }
        return null;
    }

    //------size------
    public int size(){
        return size;
    }



    //-----getIntersection-----

    public static int getIntersection(LinkedList A, LinkedList B){
        int sizeA = A.size();
        int sizeB = B.size();
        Node headA = A.first;
        Node headB = B.first;

        if(sizeA > sizeB){
            for(int i =0; i<sizeA-sizeB;i++){
                headA = headA.next;
            }
        } else if(sizeB > sizeA){
            for(int i =0; i<sizeB-sizeA;i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB != null){
            if(headA.value == headB.value){
                return headA.value;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }

        return -1;
    }

}


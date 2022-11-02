

public class Main {

    public static void main(String[] args) {

//------Prompt 1: Intersecting LinkedList

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        //3 -> 7 -> 8 -> 10

        list1.addFirst(3);
        list1.addLast(7);
        list1.addLast(8);
        list1.addLast(10);

        //99 -> 1 -> 8 -> 11

        list2.addFirst(99);
        list2.addLast(1);
        list2.addLast(7);
        list2.addLast(11);

        System.out.println(LinkedList.getIntersection(list1,list2));

        list2.addLast(12);

        System.out.println(LinkedList.getIntersection(list1,list2));

        list1.addFirst(1);
        list1.addLast(20);

        System.out.println(LinkedList.getIntersection(list1,list2));

        //------Prompt 2: Stacks

        //incomplete
    }
}

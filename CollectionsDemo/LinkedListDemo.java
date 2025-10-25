package CollectionsDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //declare a linked list
        // LinkedList<String> ls=new LinkedList<String>();
        // LinkedList<Integer> ls=new LinkedList<Integer>();
        LinkedList l=new LinkedList<>();

        l.add("a");
        l.add("christeena");
        l.add("nv");
        l.add("c");
        l.add("kitty");
        l.add("crisbi");

        System.out.println(l);
        System.out.println(l.size());
        l.remove(3);
        System.out.println("the list after removal"+l);
        l.add(3,"java");
        System.out.println(l.get(3));
        // Reading elements from linked list using for loop
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        //Reading elements from ll using for each loop
        for (Object e:l) {
            System.out.println(e);
        }
        //Read the element using iterator method
        Iterator it= l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // addAll() and removeAll() methods
        LinkedList new_l= new LinkedList<>();
        new_l.addAll(l);
        System.out.println(new_l);

        new_l.removeAll(l);
        System.out.println(new_l);
        // sort() Collections.sort(collection)

        System.out.println("linked list before sorting"+ l);
        Collections.sort(l);
        System.out.println("Collection after sorting" + l);

        //reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

        //shuffling
        Collections.shuffle(l);
        System.out.println("Data after shuffling"+ l);

        //ll specific method
        l.addFirst("macri");
        l.addLast("jude");
        l.removeFirst();
        l.removeLast();
        l.getFirst();
        l.getLast();
    }

}

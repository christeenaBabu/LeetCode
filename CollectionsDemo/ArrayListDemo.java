package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declare ArrayList
        ArrayList al=new ArrayList <>();
        //ArrayList<Integer> al= new ArrayList<>();
        //ArrayList<String> al= new ArrayList<>();
       // List  al=new ArrayList<>();

        //add new elements to the arraylist
        al.add("welcome");
        al.add(5);
        al.add(15.4);
        al.add('c');
        al.add(true);
        System.out.println(al);//[welcome, 5, 15.4, c, true]
        //size
        System.out.println("Number of elements in the array "+al.size());//Number of elements in the array 5
        //remove
        al.remove(0);//here its the index
       // al.remove("welcome");// here its the object
        System.out.println("Elements after removal"+al);//[5, 15.4, c, true]
        //add
        al.add(2,"Kitty");
        System.out.println("Elements after removal"+al);//[5, 15.4, Kitty, c, true]
        //retrieve specific element
        System.out.println("retrieved element is"+al.get(1));//15.4 here 1 is index/element
        //update the element
        al.set(1,"dubzy");
        System.out.println("After updating the element"+al);//[5, dubzy, Kitty, c, true]

    }
}
